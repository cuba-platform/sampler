package com.haulmont.sampler.web.app.mainwindow;

import com.haulmont.cuba.gui.WindowManager.OpenType;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.web.toolkit.ui.CubaHorizontalSplitPanel;
import com.haulmont.sampler.web.app.mainwindowdashboard.SamplerMainDashboardFrame;
import com.haulmont.sampler.web.config.SamplesAppConfig;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.lang.StringUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.haulmont.cuba.gui.components.mainwindow.SideMenu.*;

public class SamplerMainWindow extends AbstractMainWindow {

    protected final static String FOUND_ITEM_STYLE = "found-item";

    @Inject
    protected BoxLayout titleBar;

    @Inject
    protected LinkButton refreshMenuBtn;

    @Inject
    protected TextField searchField;

    @Inject
    protected SideMenu sideMenu;

    @Inject
    protected HBoxLayout searchBox;

    @Inject
    protected Button searchButton;

    @Inject
    protected LinkButton collapseAllBtn;

    @Inject
    protected LinkButton expandAllBtn;

    @Inject
    protected SamplesHelper samplesHelper;

    @Inject
    protected SamplesMenuConfig samplesMenuConfig;

    @Inject
    protected SamplesAppConfig samplesAppConfig;

    @Inject
    protected SamplerMainDashboardFrame dashboardFrame;

    @Inject
    private SplitPanel mainSplit;

    protected List<MenuItem> foundItems = new ArrayList<>();
    protected List<String> parentListIdsToExpand = new ArrayList<>();

    protected WindowInfo sampleWindow;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initSideMenu();
        initMainSplit();

        titleBar.setVisible(samplesAppConfig.isDeveloperMode());
        refreshMenuBtn.setVisible(samplesAppConfig.isDeveloperMode());

        dashboardFrame.addDashboardItemClickListener(event -> {
            sideMenu.removeAllMenuItems();
            initMenuItems();

            SideMenu.MenuItem item = sideMenu.getMenuItem(event.getMenuItemId());
            if (item != null) {
                item.setStyleName(FOUND_ITEM_STYLE);
                item.setExpanded(true);
                expandAllParentRecursively(event.getMenuItemId());
            }
        });

        searchField.requestFocus();
    }

    public void initDashboardByRootItemId(String itemId) {
        dashboardFrame.clearDashboard();
        if (samplesMenuConfig.isRootItem(itemId)) {
            dashboardFrame.initDashboardMenu(itemId);
        } else {
            dashboardFrame.initDashboardMenu(SamplerMainDashboardFrame.MENU_ROOT_ITEM_ID);
        }
    }

    protected void initMainSplit() {
        mainSplit.unwrap(CubaHorizontalSplitPanel.class).setDockable(true);
    }

    protected void initSideMenu() {
        sampleWindow = samplesHelper.getSampleBrowser();
        sideMenu.removeAllMenuItems();
        initMenuItems();

        Action searchAction = new BaseAction("search") {
            @Override
            public void actionPerform(Component component) {
                search(searchField.getValue());
            }
        };
        searchButton.setAction(searchAction);
        searchBox.addShortcutAction(new ShortcutAction(
                "ENTER", shortcutTriggeredEvent -> searchAction.actionPerform(searchBox)));

        Action action = new BaseAction("collapseOrExpand") {
            @Override
            public void actionPerform(Component component) {
                if (component.getId().equals(collapseAllBtn.getId())) {
                    collapseAll();
                } else {
                    expandAll();
                }
            }
        };
        action.setCaption("");
        collapseAllBtn.setAction(action);
        expandAllBtn.setAction(action);
    }

    protected void initMenuItems() {
        List<com.haulmont.sampler.web.config.MenuItem> samplerMenuItems = samplesMenuConfig.getRootItems();
        for (com.haulmont.sampler.web.config.MenuItem item : samplerMenuItems) {
            MenuItem menuItem = sideMenu.createMenuItem(item.getId());
            menuItem.setCaption(samplesMenuConfig.getMenuItemCaption(item.getId()));
            loadMenuItems(item, menuItem);
            sideMenu.addMenuItem(menuItem);
        }
    }

    protected void loadMenuItems(com.haulmont.sampler.web.config.MenuItem parentSamplerItem, MenuItem parentSideMenuItem) {
        for (com.haulmont.sampler.web.config.MenuItem currentItem : parentSamplerItem.getChildren()) {
            MenuItem child;
            String id = currentItem.getId();
            if (currentItem.isMenu()) {
                child = sideMenu.createMenuItem(id);
                child.setCaption(samplesMenuConfig.getMenuItemCaption(currentItem.getId()));

                loadMenuItems(currentItem, child);
                parentSideMenuItem.addChildItem(child);
            } else {
                child = sideMenu.createMenuItem(id);
                child.setCaption(samplesMenuConfig.getMenuItemCaption(currentItem.getId()));
                child.setCommand(item -> {
                    Map<String, Object> params = samplesHelper.getParams(samplesMenuConfig.findItemById(item.getId()));
                    removeStyleNameFromAll(FOUND_ITEM_STYLE, sideMenu.getMenuItems());
                    item.setStyleName(FOUND_ITEM_STYLE);
                    openWindow(sampleWindow.getId(), OpenType.NEW_TAB, params);
                });
                parentSideMenuItem.addChildItem(child);
            }
        }
    }

    public void search(String searchValue) {
        foundItems.clear();
        sideMenu.removeAllMenuItems();
        initMenuItems();
        if (!StringUtils.isEmpty(searchValue)) {
            findItemsRecursively(sideMenu.getMenuItems(), searchValue);

            for (MenuItem item : foundItems) {
                if (samplesMenuConfig.findItemById(item.getId()).getParent() != null) {
                    expandAllParentRecursively(item.getId());
                }
                if (item.getChildren() != null) {
                    expand(sideMenu.getMenuItem(item.getId()), true);
                }
            }

            removeNotRequestedItems(sideMenu.getMenuItems(), null, searchValue);
        }
    }

    protected void findItemsRecursively(List<SideMenu.MenuItem> items, String searchValue) {
        for (MenuItem item : items) {
            if (StringUtils.containsIgnoreCase(item.getCaption(), searchValue)) {
                item.setStyleName(FOUND_ITEM_STYLE);
                foundItems.add(item);
            }
            if (item.hasChildren()) {
                findItemsRecursively(item.getChildren(), searchValue);
            }
        }
    }

    protected void removeNotRequestedItems(List<MenuItem> list, MenuItem parentItem, String searchValue) {
        for (MenuItem item : list) {
            if (item.hasChildren()) {
                if (!item.isExpanded()) {
                    if (parentItem != null) {
                        parentItem.removeChildItem(item);
                    }
                    sideMenu.removeMenuItem(item);
                } else if (!StringUtils.containsIgnoreCase(item.getCaption(), searchValue)) {
                    removeNotRequestedItems(item.getChildren(), item, searchValue);
                }
            } else if (!StringUtils.containsIgnoreCase(item.getCaption(), searchValue)) {
                if (parentItem != null) {
                    parentItem.removeChildItem(item);
                }
                sideMenu.removeMenuItem(item);
            }
        }
    }

    public void expandAll() {
        for (MenuItem item : sideMenu.getMenuItems()) {
            expand(item, true);
        }
    }

    public void collapseAll() {
        for (MenuItem item : sideMenu.getMenuItems()) {
            expand(item, false);
        }
    }

    protected void expand(MenuItem item, boolean isExpand) {
        if (item.hasChildren()) {
            item.setExpanded(isExpand);
            for (MenuItem menuItem : item.getChildren()) {
                if (menuItem.hasChildren()) {
                    expand(menuItem, isExpand);
                }
            }
        }
    }

    protected void expandAllParentRecursively(String id) {
        parentListIdsToExpand.clear();
        fillParentListToExpand(id);
        for (String s : parentListIdsToExpand) {
            MenuItem item = sideMenu.getMenuItem(s);
            if (item != null) {
                item.setExpanded(true);
            }
        }
    }

    protected void fillParentListToExpand(String id) {
        com.haulmont.sampler.web.config.MenuItem itemToExpand = samplesMenuConfig.findItemById(id);
        if (itemToExpand.getParent() != null) {
            parentListIdsToExpand.add(itemToExpand.getParent().getId());
            fillParentListToExpand(itemToExpand.getParent().getId());
        }
    }

    public void expandItemsFromDirectLink(String id) {
        sideMenu.removeAllMenuItems();
        initMenuItems();
        expandAllParentRecursively(id);
        MenuItem item = sideMenu.getMenuItemNN(id);
        item.setStyleName(FOUND_ITEM_STYLE);
        item.setExpanded(true);
    }

    protected void removeStyleNameFromAll(String styleName, List<SideMenu.MenuItem> list) {
        for (MenuItem menuItem : list) {
            menuItem.removeStyleName(styleName);
            if (menuItem.hasChildren()) {
                removeStyleNameFromAll(styleName, menuItem.getChildren());
            }
        }
    }
}
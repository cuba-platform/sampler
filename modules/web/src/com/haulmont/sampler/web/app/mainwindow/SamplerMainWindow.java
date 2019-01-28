package com.haulmont.sampler.web.app.mainwindow;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;
import com.haulmont.cuba.gui.screen.OpenMode;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.web.widgets.CubaHorizontalSplitPanel;
import com.haulmont.sampler.web.app.mainwindowdashboard.DashboardItemClickEvent;
import com.haulmont.sampler.web.app.mainwindowdashboard.SamplerMainDashboardFragment;
import com.haulmont.sampler.web.config.SamplesAppConfig;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static com.haulmont.cuba.gui.components.mainwindow.SideMenu.MenuItem;

public class SamplerMainWindow extends AbstractMainWindow {

    private final static String FOUND_ITEM_STYLE = "found-item";

    @Inject
    private BoxLayout titleBar;
    @Inject
    private LinkButton refreshMenuBtn;
    @Inject
    private TextField<String> searchField;
    @Inject
    private SideMenu sideMenu;
    @Inject
    private HBoxLayout searchBox;
    @Inject
    private SplitPanel mainSplit;

    @Inject
    private SamplerMainDashboardFragment dashboardFrame;

    @Inject
    private SamplesHelper samplesHelper;
    @Inject
    private SamplesMenuConfig samplesMenuConfig;
    @Inject
    private SamplesAppConfig samplesAppConfig;

    @Inject
    private Screens screens;

    private List<MenuItem> foundItems = new ArrayList<>();
    private List<String> parentListIdsToExpand = new ArrayList<>();

    @Subscribe
    protected void onInit(InitEvent event) {
        initSideMenu();
        initMainSplit();

        titleBar.setVisible(samplesAppConfig.isDeveloperMode());
        refreshMenuBtn.setVisible(samplesAppConfig.isDeveloperMode());

        dashboardFrame.addDashboardItemClickListener(this::onDashboardItemClicked);

        searchField.focus();
    }

    private void onDashboardItemClicked(DashboardItemClickEvent event) {
        sideMenu.removeAllMenuItems();
        initMenuItems();

        MenuItem item = sideMenu.getMenuItem(event.getMenuItemId());
        if (item != null) {
            item.setStyleName(FOUND_ITEM_STYLE);
            item.setExpanded(true);
            expandAllParentRecursively(event.getMenuItemId());
        }
    }

    public void initDashboardByRootItemId(String itemId) {
        dashboardFrame.clearDashboard();
        if (samplesMenuConfig.isRootItem(itemId)) {
            dashboardFrame.initDashboardMenu(itemId);
        } else {
            dashboardFrame.initDashboardMenu(SamplerMainDashboardFragment.MENU_ROOT_ITEM_ID);
        }
    }

    private void initMainSplit() {
        mainSplit.unwrap(CubaHorizontalSplitPanel.class)
                .setDockable(true);
    }

    private void initSideMenu() {
        sideMenu.removeAllMenuItems();
        initMenuItems();

        searchBox.addShortcutAction(new ShortcutAction("ENTER",
                shortcutTriggeredEvent ->
                        search(searchField.getValue())
        ));
    }

    @Subscribe("searchButton")
    protected void onSearchButtonClick(Button.ClickEvent event) {
        search(searchField.getValue());
    }

    @Subscribe("refreshMenuBtn")
    protected void onRefreshMenuBtnClick(Button.ClickEvent event) {
        samplesMenuConfig.reset();
    }

    private void initMenuItems() {
        List<com.haulmont.sampler.web.config.MenuItem> samplerMenuItems = samplesMenuConfig.getRootItems();
        for (com.haulmont.sampler.web.config.MenuItem item : samplerMenuItems) {
            MenuItem menuItem = sideMenu.createMenuItem(item.getId());
            menuItem.setCaption(samplesMenuConfig.getMenuItemCaption(item.getId()));
            loadMenuItems(item, menuItem);
            sideMenu.addMenuItem(menuItem);
        }
    }

    private void loadMenuItems(com.haulmont.sampler.web.config.MenuItem parentSamplerItem, MenuItem parentSideMenuItem) {
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
                    ScreenOptions screenOptions =
                            samplesHelper.getScreenOptions(samplesMenuConfig.getItemById(item.getId()));
                    removeStyleNameFromAll(FOUND_ITEM_STYLE, sideMenu.getMenuItems());
                    item.setStyleName(FOUND_ITEM_STYLE);
                    screens.create(samplesHelper.getSampleBrowserId(), OpenMode.NEW_TAB, screenOptions)
                            .show();
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
                if (samplesMenuConfig.getItemById(item.getId()).getParent() != null) {
                    expandAllParentRecursively(item.getId());
                }
                if (item.getChildren() != null) {
                    expand(sideMenu.getMenuItemNN(item.getId()), true);
                }
            }

            removeNotRequestedItems(sideMenu.getMenuItems(), null, searchValue);
        }
    }

    private void findItemsRecursively(List<SideMenu.MenuItem> items, String searchValue) {
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

    private void removeNotRequestedItems(List<MenuItem> list, MenuItem parentItem, String searchValue) {
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

    @Subscribe("expandAllBtn")
    protected void onExpandAllBtnClick(Button.ClickEvent event) {
        for (MenuItem item : sideMenu.getMenuItems()) {
            expand(item, true);
        }
    }

    @Subscribe("collapseAllBtn")
    protected void onCollapseAllBtnClick(Button.ClickEvent event) {
        for (MenuItem item : sideMenu.getMenuItems()) {
            expand(item, false);
        }
    }

    private void expand(MenuItem item, boolean isExpand) {
        if (item.hasChildren()) {
            item.setExpanded(isExpand);
            for (MenuItem menuItem : item.getChildren()) {
                if (menuItem.hasChildren()) {
                    expand(menuItem, isExpand);
                }
            }
        }
    }

    private void expandAllParentRecursively(String id) {
        parentListIdsToExpand.clear();
        fillParentListToExpand(id);
        for (String s : parentListIdsToExpand) {
            MenuItem item = sideMenu.getMenuItem(s);
            if (item != null) {
                item.setExpanded(true);
            }
        }
    }

    private void fillParentListToExpand(String id) {
        com.haulmont.sampler.web.config.MenuItem itemToExpand = samplesMenuConfig.getItemById(id);
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

    private void removeStyleNameFromAll(String styleName, List<SideMenu.MenuItem> list) {
        for (MenuItem menuItem : list) {
            menuItem.removeStyleName(styleName);
            if (menuItem.hasChildren()) {
                removeStyleNameFromAll(styleName, menuItem.getChildren());
            }
        }
    }
}
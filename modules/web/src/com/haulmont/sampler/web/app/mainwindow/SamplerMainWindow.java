package com.haulmont.sampler.web.app.mainwindow;

import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.UrlRouting;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;
import com.haulmont.cuba.gui.screen.OpenMode;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.web.AppUI;
import com.haulmont.cuba.web.sys.RedirectHandler;
import com.haulmont.cuba.web.widgets.CubaHorizontalSplitPanel;
import com.haulmont.sampler.web.SamplerApp;
import com.haulmont.sampler.web.app.mainwindowdashboard.DashboardItemClickEvent;
import com.haulmont.sampler.web.app.mainwindowdashboard.SamplerMainDashboardFragment;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesAppConfig;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private SplitPanel mainSplit;
    @Inject
    private LookupField<Locale> localesSelect;

    @Inject
    private SamplerMainDashboardFragment dashboardFrame;

    @Inject
    private SamplesHelper samplesHelper;
    @Inject
    private SamplesMenuConfig samplesMenuConfig;
    @Inject
    private SamplesAppConfig samplesAppConfig;

    @Inject
    private SamplerApp app;

    @Inject
    private Screens screens;
    @Inject
    private GlobalConfig globalConfig;
    @Inject
    private UrlRouting urlRouting;

    private List<SideMenu.MenuItem> foundItems = new ArrayList<>();
    private List<String> parentListIdsToExpand = new ArrayList<>();

    @Subscribe
    protected void onInit(InitEvent event) {
        initSideMenu();
        initMainSplit();
        initLocales();

        titleBar.setVisible(samplesAppConfig.isDeveloperMode());
        refreshMenuBtn.setVisible(samplesAppConfig.isDeveloperMode());

        dashboardFrame.addDashboardItemClickListener(this::onDashboardItemClicked);
        if (app.getRedirectHandler() == null) {
            app.setRedirectHandler(getBeanLocator().getPrototype(RedirectHandler.NAME, AppUI.getCurrent()));
        }

        searchField.focus();
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        if (app.getRedirectHandler() != null
                && app.getRedirectHandler().scheduled()) {
            app.getRedirectHandler().redirect();
        }
    }

    private void onDashboardItemClicked(DashboardItemClickEvent event) {
        sideMenu.removeAllMenuItems();
        initMenuItems();

        SideMenu.MenuItem item = sideMenu.getMenuItem(event.getMenuItemId());
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
    }

    private void initLocales() {
        localesSelect.setOptionsMap(globalConfig.getAvailableLocales());
        localesSelect.setValue(app.getLocale());

        boolean localeSelectVisible = globalConfig.getLocaleSelectVisible();
        localesSelect.setVisible(localeSelectVisible);

        localesSelect.addValueChangeListener(e -> {
            Locale selectedLocale = e.getValue();

            app.getRedirectHandler().schedule(urlRouting.getState());

            app.setLocale(selectedLocale);
            app.createTopLevelWindow();
        });

        localesSelect.setOptionStyleProvider(locale ->
                locale.equals(app.getLocale()) ? "selected-locale" : null
        );
    }

    @Subscribe("searchButton")
    protected void onSearchButtonClick(Button.ClickEvent event) {
        search(searchField.getValue());
    }

    @Subscribe("refreshMenuBtn")
    protected void onRefreshMenuBtnClick(Button.ClickEvent event) {
        samplesMenuConfig.reset();
    }

    @Subscribe("searchField")
    protected void onSearchFieldEnterPress(TextInputField.EnterPressEvent event) {
        search(searchField.getValue());
    }

    private void initMenuItems() {
        List<MenuItem> samplerMenuItems = samplesMenuConfig.getRootItems();
        for (MenuItem item : samplerMenuItems) {
            SideMenu.MenuItem menuItem = sideMenu.createMenuItem(item.getId());
            menuItem.setCaption(samplesMenuConfig.getMenuItemCaption(item.getId()));
            loadMenuItems(item, menuItem);
            sideMenu.addMenuItem(menuItem);
        }
    }

    private void loadMenuItems(MenuItem parentSamplerItem,
                               SideMenu.MenuItem parentSideMenuItem) {
        for (MenuItem currentItem : parentSamplerItem.getChildren()) {
            SideMenu.MenuItem child;
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

            for (SideMenu.MenuItem item : foundItems) {
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
        for (SideMenu.MenuItem item : items) {
            if (StringUtils.containsIgnoreCase(item.getCaption(), searchValue)) {
                item.setStyleName(FOUND_ITEM_STYLE);
                foundItems.add(item);
            }
            if (item.hasChildren()) {
                findItemsRecursively(item.getChildren(), searchValue);
            }
        }
    }

    private void removeNotRequestedItems(List<SideMenu.MenuItem> list,
                                         SideMenu.MenuItem parentItem, String searchValue) {
        for (SideMenu.MenuItem item : list) {
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
        for (SideMenu.MenuItem item : sideMenu.getMenuItems()) {
            expand(item, true);
        }
    }

    @Subscribe("collapseAllBtn")
    protected void onCollapseAllBtnClick(Button.ClickEvent event) {
        for (SideMenu.MenuItem item : sideMenu.getMenuItems()) {
            expand(item, false);
        }
    }

    private void expand(SideMenu.MenuItem item, boolean isExpand) {
        if (item.hasChildren()) {
            item.setExpanded(isExpand);
            for (SideMenu.MenuItem menuItem : item.getChildren()) {
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
            SideMenu.MenuItem item = sideMenu.getMenuItem(s);
            if (item != null) {
                item.setExpanded(true);
            }
        }
    }

    private void fillParentListToExpand(String id) {
        MenuItem itemToExpand = samplesMenuConfig.getItemById(id);
        if (itemToExpand.getParent() != null) {
            parentListIdsToExpand.add(itemToExpand.getParent().getId());
            fillParentListToExpand(itemToExpand.getParent().getId());
        }
    }

    public void expandItemsFromDirectLink(String id) {
        sideMenu.removeAllMenuItems();
        initMenuItems();
        expandAllParentRecursively(id);
        SideMenu.MenuItem item = sideMenu.getMenuItemNN(id);
        item.setStyleName(FOUND_ITEM_STYLE);
        item.setExpanded(true);
    }

    private void removeStyleNameFromAll(String styleName, List<SideMenu.MenuItem> list) {
        for (SideMenu.MenuItem menuItem : list) {
            menuItem.removeStyleName(styleName);
            if (menuItem.hasChildren()) {
                removeStyleNameFromAll(styleName, menuItem.getChildren());
            }
        }
    }
}
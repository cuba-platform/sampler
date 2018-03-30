package com.haulmont.sampler.web.app.mainwindowdashboard;

import com.google.common.collect.Iterables;
import com.haulmont.bali.events.EventRouter;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.controllers.ControllerUtils;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.lang.StringUtils;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class SamplerMainDashboardFrame extends AbstractFrame {

    public static final String MENU_ROOT_ITEM_ID = "mainMenuItemRootId";

    protected static final String GROUP_PANEL_STYLE = "group-panel";
    protected static final String GROUP_PANEL_ALIGN_STYLE = "group-panel-align";
    protected static final String GROUP_PANEL_ITEM_STYLE = "group-panel-item";
    protected static final String GROUP_PANEL_LABEL_STYLE = "group-panel-label";
    protected static final String LABEL_TITLE_STYLE = "label-title";
    protected static final String LABEL_IMAGE_STYLE = "label-image";

    protected static final String PLACEHOLDER_IMAGE_PATH = "VAADIN/themes/halo/images/dashboard/mainmenu/";
    protected static final String IMAGE_PATH = "VAADIN/themes/halo/";

    @Inject
    protected CssLayout cssLayout;

    @Inject
    protected HBoxLayout historyBox;

    @Inject
    protected HBoxLayout header;

    @Inject
    protected PopupView permalink;

    @Inject
    protected TextField popupContent;

    @Inject
    protected SamplesMenuConfig samplesMenuConfig;

    @Inject
    protected SamplesHelper samplesHelper;

    protected WindowInfo sampleWindow;

    @Inject
    protected ComponentsFactory factory;

    protected EventRouter eventRouter;

    @Override
    public void init(Map<String, Object> params) {
        sampleWindow = samplesHelper.getSampleBrowser();
        initDashboardMenu(MENU_ROOT_ITEM_ID);
    }

    protected EventRouter getEventRouter() {
        if (eventRouter == null) {
            eventRouter = new EventRouter();
        }
        return eventRouter;
    }

    public void initDashboardMenu(String menuItemRootId) {
        clearBreadCrumbs();
        List<MenuItem> menuItems;
        boolean isMainDashboard = menuItemRootId.equals(MENU_ROOT_ITEM_ID);
        if (isMainDashboard) {
            menuItems = samplesMenuConfig.getRootItems();

            // create label Title for main menu
            Label label = createLabelTitle();
            label.setValue(getMessage("dashboard." + MENU_ROOT_ITEM_ID));
            cssLayout.add(label);

            header.setVisible(false);
            permalink.setPopupVisible(false);
        } else {
            menuItems = samplesMenuConfig.getAllChildrenAsList(menuItemRootId);
            header.setVisible(true);
            addNavigationButtonLink(menuItemRootId, false);
        }

        MenuItem lastMenuItem = null;
        for (MenuItem item : menuItems) {
            if (item.isMenu() && !isMainDashboard) {
                Label title = createLabelTitle();
                String currentNameLabel = samplesMenuConfig.getMenuItemCaption(item.getId());
                if (lastMenuItem != null && lastMenuItem.isMenu()) {
                    Label lastLabel = (Label) Iterables.get(cssLayout.getComponents(), cssLayout.getComponents().size() - 1);
                    lastLabel.setValue(currentNameLabel);
                } else {
                    title.setValue(currentNameLabel);
                    cssLayout.add(title);
                }
            } else {
                CssLayout wrapper = createCssWrapper(item.getId(), isMainDashboard);
                CssLayout itemLayout = createItemLayout(item.getId());
                Label image = createImagePreview(item.getImage(), menuItemRootId);

                itemLayout.add(image);
                wrapper.add(itemLayout);
                cssLayout.add(wrapper);
            }
            lastMenuItem = item;
        }
    }

    protected CssLayout createCssWrapper(String itemId, boolean isMainDashboard) {
        CssLayout wrapper = factory.createComponent(CssLayout.class);
        wrapper.setStyleName(GROUP_PANEL_STYLE);
        wrapper.addStyleName(GROUP_PANEL_ALIGN_STYLE);
        wrapper.setWidth(AUTO_SIZE);
        wrapper.setAlignment(Alignment.MIDDLE_CENTER);

        wrapper.addLayoutClickListener(event -> {
            CssLayout groupBox = (CssLayout) event.getChildComponent();

            if (groupBox != null) {
                DashboardItemClickListener.ItemClickEvent clickEvent =
                        new DashboardItemClickListener.ItemClickEvent(groupBox, groupBox.getId());
                getEventRouter().fireEvent(DashboardItemClickListener.class, DashboardItemClickListener::onClick, clickEvent);

                if (isMainDashboard) {
                    clearDashboard();
                    initDashboardMenu(groupBox.getId());
                } else {
                    Map<String, Object> params = samplesHelper.getParams(samplesMenuConfig.findItemById(itemId));
                    openWindow(sampleWindow.getId(), WindowManager.OpenType.NEW_TAB, params);
                }
            }
        });
        return wrapper;
    }

    protected CssLayout createItemLayout(String itemId) {
        CssLayout groupBox = factory.createComponent(CssLayout.class);
        groupBox.setAlignment(Alignment.MIDDLE_CENTER);
        groupBox.setId(itemId);
        groupBox.setHeight("280px");
        groupBox.setWidth("453px");
        groupBox.setStyleName(GROUP_PANEL_ITEM_STYLE);

        Label caption = factory.createComponent(Label.class);
        caption.setStyleName(GROUP_PANEL_LABEL_STYLE);
        caption.setValue(samplesMenuConfig.getMenuItemCaption(itemId));
        caption.setHeight("50px");
        caption.setWidth("100%");
        groupBox.add(caption);
        return groupBox;
    }

    protected Label createImagePreview(String imageIcon, String menuItemRootId) {
        Label imageLabel = factory.createComponent(Label.class);
        imageLabel.setStyleName(LABEL_IMAGE_STYLE);
        imageLabel.setHtmlEnabled(true);
        imageLabel.setHeight("208px");
        imageLabel.setWidth("431px");

        StringBuilder sb = new StringBuilder();
        sb.append("<img src=\"");

        if (StringUtils.isNotEmpty(imageIcon)) {
            sb.append(IMAGE_PATH).append(imageIcon);
        } else {
            sb.append(PLACEHOLDER_IMAGE_PATH).append(menuItemRootId).append(".svg");
        }

        sb.append("\"/>");
        imageLabel.setValue(sb.toString());

        return imageLabel;
    }

    protected Label createLabelTitle() {
        Label title = factory.createComponent(Label.class);
        title.setWidth("100%");
        title.setStyleName(LABEL_TITLE_STYLE);
        return title;
    }

    protected void addNavigationButtonLink(String itemId, boolean isMainDashboard) {
        LinkButton linkButton = factory.createComponent(LinkButton.class);
        linkButton.setCaption(getMessage("dashboard.mainMenuItemRootId"));
        linkButton.setAction(new BaseAction("open") {
            @Override
            public void actionPerform(Component component) {
                LinkButton button = (LinkButton) Iterables.get(historyBox.getComponents(), historyBox.getComponents().size() - 1);
                if (!button.getAction().equals(this)) {
                    clearDashboard();
                    initDashboardMenu(itemId);
                }
                DashboardItemClickListener.ItemClickEvent clickEvent =
                        new DashboardItemClickListener.ItemClickEvent(linkButton, itemId);
                getEventRouter().fireEvent(DashboardItemClickListener.class, DashboardItemClickListener::onClick, clickEvent);

            }
        });
        if (!isMainDashboard) {
            Label label = factory.createComponent(Label.class);
            label.setValue(" > ");
            historyBox.add(label);
            linkButton.setCaption(samplesMenuConfig.getMenuItemCaption(itemId));
        }
        initPermalink(itemId);
        historyBox.add(linkButton);
    }

    private void initPermalink(String frameId) {
        String value = ControllerUtils.getLocationWithoutParams() + "open?screen=" + frameId;
        popupContent.setValue(value);
        popupContent.selectAll();
        popupContent.setWidth((value.length() * 8) + "px");

        permalink.addPopupVisibilityListener(event -> {
            if (event.isPopupVisible()) {
                popupContent.requestFocus();
            }
        });
    }

    public void clearDashboard() {
        cssLayout.removeAll();
    }

    protected void clearBreadCrumbs() {
        historyBox.removeAll();
        addNavigationButtonLink(MENU_ROOT_ITEM_ID, true);
    }

    public void addDashboardItemClickListener(DashboardItemClickListener listener) {
        getEventRouter().addListener(DashboardItemClickListener.class, listener);
    }

    public void remmoveDashboardItemClickListener(DashboardItemClickListener listener) {
        getEventRouter().removeListener(DashboardItemClickListener.class, listener);
    }
}

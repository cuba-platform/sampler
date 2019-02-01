package com.haulmont.sampler.web.app.mainwindowdashboard;

import com.google.common.collect.Iterables;
import com.haulmont.bali.events.Subscription;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.Component.Alignment;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.controllers.ControllerUtils;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;
import java.util.function.Consumer;

@UiController("sampler-main-dashboard-fragment")
@UiDescriptor("sampler-main-dashboard-fragment.xml")
public class SamplerMainDashboardFragment extends ScreenFragment {

    public static final String MENU_ROOT_ITEM_ID = "mainMenuItemRootId";

    private static final String GROUP_PANEL_STYLE = "group-panel";
    private static final String GROUP_PANEL_ALIGN_STYLE = "group-panel-align";
    private static final String GROUP_PANEL_ITEM_STYLE = "group-panel-item";
    private static final String GROUP_PANEL_LABEL_STYLE = "group-panel-label";
    private static final String LABEL_TITLE_STYLE = "label-title";
    private static final String LABEL_IMAGE_STYLE = "label-image";

    private static final String PLACEHOLDER_IMAGE_PATH = "VAADIN/images/dashboard/mainmenu/";
    private static final String IMAGE_PATH = "VAADIN/";

    @Inject
    private CssLayout cssLayout;
    @Inject
    private HBoxLayout historyBox;
    @Inject
    private HBoxLayout header;
    @Inject
    private PopupView permalink;
    @Inject
    private TextField<String> popupContent;

    @Inject
    private SamplesMenuConfig samplesMenuConfig;
    @Inject
    private SamplesHelper samplesHelper;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private MessageBundle messageBundle;
    @Inject
    private Screens screens;

    @Subscribe
    protected void onInit(InitEvent event) {
        initDashboardMenu(MENU_ROOT_ITEM_ID);
    }

    public void initDashboardMenu(String menuItemRootId) {
        clearBreadCrumbs();
        List<MenuItem> menuItems;
        boolean isMainDashboard = menuItemRootId.equals(MENU_ROOT_ITEM_ID);
        if (isMainDashboard) {
            menuItems = samplesMenuConfig.getRootItems();

            // create label Title for main menu
            Label<String> label = createLabelTitle();
            label.setValue(messageBundle.getMessage("dashboard." + MENU_ROOT_ITEM_ID));
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
                Label<String> title = createLabelTitle();
                String currentNameLabel = samplesMenuConfig.getMenuItemCaption(item.getId());
                if (lastMenuItem != null && lastMenuItem.isMenu()) {
                    //noinspection unchecked
                    Label<String> lastLabel = (Label<String>) Iterables.get(cssLayout.getComponents(),
                            cssLayout.getComponents().size() - 1);
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

    private CssLayout createCssWrapper(String itemId, boolean isMainDashboard) {
        CssLayout wrapper = uiComponents.create(CssLayout.class);
        wrapper.setStyleName(GROUP_PANEL_STYLE);
        wrapper.addStyleName(GROUP_PANEL_ALIGN_STYLE);
        wrapper.setWidth(Component.AUTO_SIZE);
        wrapper.setAlignment(Alignment.MIDDLE_CENTER);

        wrapper.addLayoutClickListener(event -> {
            CssLayout groupBox = (CssLayout) event.getChildComponent();

            if (groupBox != null) {
                DashboardItemClickEvent clickEvent = new DashboardItemClickEvent(groupBox, groupBox.getId());
                getEventHub().publish(DashboardItemClickEvent.class, clickEvent);

                if (isMainDashboard) {
                    clearDashboard();
                    initDashboardMenu(groupBox.getId());
                } else {

                    ScreenOptions screenOptions =
                            samplesHelper.getScreenOptions(samplesMenuConfig.getItemById(itemId));
                    screens.create(samplesHelper.getSampleBrowserId(), OpenMode.NEW_TAB, screenOptions)
                            .show();
                }
            }
        });
        return wrapper;
    }

    private CssLayout createItemLayout(String itemId) {
        CssLayout groupBox = uiComponents.create(CssLayout.class);
        groupBox.setAlignment(Alignment.MIDDLE_CENTER);
        groupBox.setId(itemId);
        groupBox.setHeight("280px");
        groupBox.setWidth("453px");
        groupBox.setStyleName(GROUP_PANEL_ITEM_STYLE);

        Label<String> caption = uiComponents.create(Label.TYPE_STRING);
        caption.setStyleName(GROUP_PANEL_LABEL_STYLE);
        caption.setValue(samplesMenuConfig.getMenuItemCaption(itemId));
        caption.setHeight("50px");
        caption.setWidth("100%");
        groupBox.add(caption);
        return groupBox;
    }

    private Label createImagePreview(String imageIcon, String menuItemRootId) {
        Label<String> imageLabel = uiComponents.create(Label.TYPE_STRING);
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

    private Label<String> createLabelTitle() {
        Label<String> title = uiComponents.create(Label.TYPE_STRING);
        title.setWidth("100%");
        title.setStyleName(LABEL_TITLE_STYLE);
        return title;
    }

    private void addNavigationButtonLink(String itemId, boolean isMainDashboard) {
        LinkButton linkButton = uiComponents.create(LinkButton.class);
        linkButton.setCaption(messageBundle.getMessage("dashboard.mainMenuItemRootId"));
        linkButton.setAction(new BaseAction("open") {
            @Override
            public void actionPerform(Component component) {
                LinkButton button = (LinkButton) Iterables.get(historyBox.getComponents(),
                        historyBox.getComponents().size() - 1);
                if (!button.getAction().equals(this)) {
                    clearDashboard();
                    initDashboardMenu(itemId);
                }
                DashboardItemClickEvent clickEvent = new DashboardItemClickEvent(linkButton, itemId);
                getEventHub().publish(DashboardItemClickEvent.class, clickEvent);

            }
        });
        if (!isMainDashboard) {
            Label<String> label = uiComponents.create(Label.TYPE_STRING);
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
                popupContent.focus();
            }
        });
    }

    public void clearDashboard() {
        cssLayout.removeAll();
    }

    private void clearBreadCrumbs() {
        historyBox.removeAll();
        addNavigationButtonLink(MENU_ROOT_ITEM_ID, true);
    }

    public Subscription addDashboardItemClickListener(Consumer<DashboardItemClickEvent> listener) {
        return getEventHub().subscribe(DashboardItemClickEvent.class, listener);
    }
}

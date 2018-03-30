package com.haulmont.sampler.web.app.folders;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.web.app.folders.CubaFoldersPane;
import com.haulmont.cuba.web.toolkit.ui.CubaTextField;
import com.haulmont.cuba.web.toolkit.ui.CubaTree;
import com.haulmont.sampler.web.App;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.Reindeer;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import static com.vaadin.ui.Alignment.MIDDLE_RIGHT;

/**
 * @author gorelov
 */
public class SamplerFoldersPane extends CubaFoldersPane {

    private static final String PROPERTY_CAPTION = "caption";

    private VerticalLayout menuLayout;
    private Tree tree;
    private WindowInfo sampleWindow;
    private TreeSearchFilter filter;

    private Messages messages = AppBeans.get(Messages.NAME);
    private SamplesHelper samplesHelper = AppBeans.get(SamplesHelper.NAME);
    private SamplesMenuConfig samplesMenuConfig = AppBeans.get(SamplesMenuConfig.NAME);

    public SamplerFoldersPane() {
        samplesMenuConfig.reset();
        sampleWindow = samplesHelper.getSampleBrowser();
    }

    @Override
    protected void createFoldersPaneLayout(Component appFoldersPane, Component searchFoldersPane) {
        createMenuPanel();
    }

    private void createMenuPanel() {
        menuLayout = new VerticalLayout();
        menuLayout.setMargin(true);
        menuLayout.setHeight("100%");
        menuLayout.setWidth("100%");

        createMenuSearch();
        createMenuHeader();
        createMenuTree();

        addComponent(menuLayout);
    }

    private void createMenuSearch() {
        HorizontalLayout searchLayout = new HorizontalLayout();
        searchLayout.setSpacing(true);
        searchLayout.setMargin(new MarginInfo(true, false, true, false));
        searchLayout.setWidth("100%");

        final CubaTextField searchField = new CubaTextField();
        searchField.setWidth("100%");
        searchField.addShortcutListener(new ShortcutListener("", KeyCode.ENTER, null) {
            @Override
            public void handleAction(Object sender, Object target) {
                search(searchField.getValue());
            }
        });
        searchField.focus();
        searchLayout.addComponent(searchField);
        searchLayout.setExpandRatio(searchField, 1);

        filter = null;
        Button searchButton = new Button(messages.getMessage(getClass(), "LeftPanel.search"));
        searchButton.setIcon(FontAwesome.SEARCH);
        searchButton.addClickListener(event -> search(searchField.getValue()));
        searchLayout.addComponent(searchButton);
        searchLayout.setComponentAlignment(searchButton, MIDDLE_RIGHT);

        menuLayout.addComponent(searchLayout);
    }

    private void createMenuHeader() {
        HorizontalLayout header = new HorizontalLayout();
        header.setSpacing(true);
        header.setWidth("100%");

        Label label = new Label(messages.getMessage(getClass(), "LeftPanel.caption"));
        label.setStyleName("cuba-folders-pane-caption");
        header.addComponent(label);
        header.setExpandRatio(label, 1);

        // NOTE: For development convenience only
        if (BooleanUtils.toBoolean(AppContext.getProperty("sampler.developerMode"))) {
            Button refresh = createButton("Refresh", event -> resetAllMenuItems());
            refresh.setDescription("Reload all menu items");
            header.addComponent(refresh);
            header.setComponentAlignment(refresh, MIDDLE_RIGHT);
        }

        Button collapseAll = createButton("LeftPanel.collapseAll", event -> collapseAll());
        header.addComponent(collapseAll);
        header.setComponentAlignment(collapseAll, MIDDLE_RIGHT);

        Button expandAll = createButton("LeftPanel.expandAll", event -> expandAll());
        header.addComponent(expandAll);
        header.setComponentAlignment(expandAll, MIDDLE_RIGHT);

        menuLayout.addComponent(header);
    }

    private Button createButton(String captionKey, Button.ClickListener listener) {
        Button button = new Button(messages.getMessage(getClass(), captionKey));
        button.addStyleName(Reindeer.BUTTON_LINK);
        button.addStyleName("small-link");
        button.addStyleName("dark");
        button.addClickListener(listener);

        return button;
    }

    private void createMenuTree() {
        tree = new CubaTree();
        tree.setHeight("100%");
        tree.setWidth("100%");
        tree.setSelectable(false);
        tree.addItemClickListener(new MenuItemClickListener());
        tree.setItemCaptionPropertyId(PROPERTY_CAPTION);
        tree.setContainerDataSource(createTreeContent());
        tree.setItemStyleGenerator(new TreeSearchStyle());

        menuLayout.addComponent(tree);
        menuLayout.setExpandRatio(tree, 1);
    }

    private HierarchicalContainer createTreeContent() {
        HierarchicalContainer container = new HierarchicalContainer();
        container.addContainerProperty(PROPERTY_CAPTION, String.class, "");
        fillContainer(container, samplesMenuConfig.getRootItems(), null);
        return container;
    }

    @SuppressWarnings("unchecked")
    private void fillContainer(HierarchicalContainer container, List<MenuItem> items, MenuItem parent) {
        for (MenuItem item : items) {
            Item containerItem = container.addItem(item);
            Property<String> caption = containerItem.getItemProperty(PROPERTY_CAPTION);
            caption.setValue(samplesMenuConfig.getMenuItemCaption(item.getId()));
            container.setParent(item, parent);
            if (item.isMenu()) {
                fillContainer(container, item.getChildren(), item);
            } else {
                container.setChildrenAllowed(item, false);
            }
        }
    }

    private class MenuItemClickListener implements ItemClickEvent.ItemClickListener {

        @Override
        public void itemClick(ItemClickEvent event) {
            MenuItem item = (MenuItem) event.getItemId();
            if (item.isMenu()) {
                Component tree = event.getComponent();
                if (tree instanceof Tree) {
                    switchExpandState((Tree) tree, item);
                }
            } else {
                if (event.getButton() == MouseEventDetails.MouseButton.LEFT) {
                    tree.select(item);
                    openWindow(item);
                }
            }
        }

        private void openWindow(MenuItem item) {
            Map<String, Object> params = samplesHelper.getParams(item);
            App.getInstance().getWindowManager().openWindow(sampleWindow, WindowManager.OpenType.NEW_TAB, params);
        }

        private void switchExpandState(Tree tree, MenuItem item) {
            if (tree.isExpanded(item)) {
                tree.collapseItem(item);
            } else {
                tree.expandItem(item);
            }
        }
    }

    private void expandAll() {
        tree.rootItemIds().forEach(tree::expandItemsRecursively);
    }

    private void collapseAll() {
        tree.rootItemIds().forEach(tree::collapseItemsRecursively);
    }

    private void search(final String searchRequest) {
        Container.Filterable container = (Container.Filterable) tree.getContainerDataSource();
        if (StringUtils.isBlank(searchRequest)) {
            container.removeContainerFilter(filter);
            filter = null;
        } else {
            if (filter != null) {
                container.removeContainerFilter(filter);
            }
            filter = new TreeSearchFilter(PROPERTY_CAPTION, searchRequest);
            container.addContainerFilter(filter);
            expandAll();
        }
    }

    private void resetAllMenuItems() {
        samplesMenuConfig.reset();
        tree.setItemStyleGenerator(null);
        tree.setContainerDataSource(createTreeContent());
        expandAll();
    }

    public void expandMenuItem(String itemId, boolean setSelected) {
        MenuItem item = samplesMenuConfig.findItemById(itemId);
        if (item != null) {
            MenuItem parent = item.getParent();
            Stack<MenuItem> itemsToExpand = new Stack<>();
            while (parent != null) {
                itemsToExpand.add(parent);
                parent = parent.getParent();
            }
            for (MenuItem itemToExpand : itemsToExpand) {
                tree.expandItem(itemToExpand);
            }
            if (setSelected) {
                tree.select(item);
            }
        }
    }

    private class TreeSearchStyle implements Tree.ItemStyleGenerator {

        @Override
        public String getStyle(Tree source, Object itemId) {
            MenuItem item = (MenuItem) itemId;
            if (filter != null) {
                if (samplesMenuConfig
                        .getMenuItemCaption(item.getId())
                        .toLowerCase()
                        .contains(filter.getSearchRequest())) {
                    return "bold";
                }
            }
            return null;
        }
    }

    private class TreeSearchFilter implements Container.Filter {

        private String propertyId;
        private String searchRequest;

        TreeSearchFilter(String propertyId, String searchRequest) {
            this.propertyId = propertyId;
            this.searchRequest = searchRequest.toLowerCase();
        }

        String getSearchRequest() {
            return searchRequest;
        }

        @Override
        public boolean passesFilter(Object itemId, Item item) throws UnsupportedOperationException {
            Property property = item.getItemProperty(propertyId);
            if (property == null || !property.getType().equals(String.class))
                return false;

            String value = (String) property.getValue();
            return match(value) || checkParents((MenuItem) itemId);
        }

        @Override
        public boolean appliesToProperty(Object propertyId) {
            return propertyId != null &&
                    propertyId.equals(this.propertyId);
        }

        private boolean checkParents(MenuItem item) {
            if (item.getParent() != null) {
                MenuItem parent = item.getParent();
                return match(samplesMenuConfig.getMenuItemCaption(parent.getId())) || checkParents(parent);
            }
            return false;
        }

        private boolean match(String value) {
            return value.toLowerCase().contains(searchRequest);
        }
    }
}

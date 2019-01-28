package com.haulmont.sampler.web.config;

import com.haulmont.bali.util.Dom4j;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.Resources;
import com.haulmont.cuba.core.sys.AppContext;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.text.StringTokenizer;
import org.dom4j.Element;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Component(SamplesMenuConfig.NAME)
public class SamplesMenuConfig {

    public static final String NAME = "sampler_SamplesConfig";
    public static final String MENU_CONFIG_XML_PROP = "sampler.samplesMenuConfig";

    private static final Log log = LogFactory.getLog(SamplesMenuConfig.class);

    @Inject
    private Resources resources;

    @Inject
    private Messages messages;

    private final List<MenuItem> rootItems = new ArrayList<>();

    private volatile boolean initialized;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public String getMenuItemCaption(String id) {
        try {
            return messages.getMainMessage("sample-config." + id);
        } catch (MissingResourceException e) {
            return id;
        }
    }

    private void checkInitialized() {
        if (!initialized) {
            lock.readLock().unlock();
            lock.writeLock().lock();
            try {
                if (!initialized) {
                    init();
                    initialized = true;
                }
            } finally {
                lock.readLock().lock();
                lock.writeLock().unlock();
            }
        }
    }

    private void init() {
        rootItems.clear();

        String configName = AppContext.getProperty(MENU_CONFIG_XML_PROP);
        StringTokenizer tokenizer = new StringTokenizer(configName);
        for (String location : tokenizer.getTokenArray()) {
            Resource resource = resources.getResource(location);
            if (resource.exists()) {
                try (InputStream stream = resource.getInputStream()) {
                    loadMenuItems(Dom4j.readDocument(stream).getRootElement(), null);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to read samples menu config from " + location, e);
                }
            } else {
                log.warn("Resource " + location + " not found, ignore it");
            }
        }
    }

    /**
     * Make the config to reload screens on next request.
     */
    public void reset() {
        initialized = false;
    }

    /**
     * Main menu root items
     */
    public List<MenuItem> getRootItems() {
        lock.readLock().lock();
        try {
            checkInitialized();
            return Collections.unmodifiableList(rootItems);
        } finally {
            lock.readLock().unlock();
        }
    }

    private void loadMenuItems(Element parentElement, MenuItem parentItem) {
        for (Element element : parentElement.elements()) {
            MenuItem menuItem = null;
            String id = element.attributeValue("id");
            if (StringUtils.isNotBlank(id)) {
                if ("menu".equals(element.getName())) {
                    menuItem = new MenuItem(parentItem, id);
                    menuItem.setImage(element.attributeValue("image"));
                    menuItem.setMenu(true);

                    loadMenuItems(element, menuItem);
                } else if ("item".equals(element.getName())) {
                    menuItem = parseItem(element, parentItem, id);
                } else {
                    log.warn(String.format("Unknown tag '%s' in sample-config", element.getName()));
                }
            } else {
                log.warn("Invalid sample-config: 'id' attribute not defined for tag" + element.getName());
            }

            if (parentItem != null && menuItem != null) {
                parentItem.addChild(menuItem);
            } else {
                rootItems.add(menuItem);
            }
        }
    }

    private MenuItem parseItem(Element element, MenuItem parentItem, String id) {
        MenuItem menuItem = new MenuItem(parentItem, id);
        String docUrl = element.attributeValue("docUrlSuffix");
        if (StringUtils.isNotBlank(docUrl)) {
            menuItem.setUrl(docUrl);
        }

        String descriptionsPack = element.attributeValue("descriptionsPack");
        if (StringUtils.isNotBlank(descriptionsPack)) {
            menuItem.setDescriptionsPack(messages.getMainMessage(descriptionsPack));
        }

        String controller = element.attributeValue("controller");
        if (StringUtils.isNotBlank(controller)) {
            menuItem.setController(controller);
        }

        String splitPosition = element.attributeValue("sampleHeight");
        if (StringUtils.isNotBlank(splitPosition)) {
            menuItem.setSampleHeight(splitPosition);
        }

        String splitEnabled = element.attributeValue("splitEnabled");
        if (StringUtils.isNotBlank(splitEnabled)) {
            menuItem.setSplitEnabled(splitEnabled);
        }

        String image = element.attributeValue("image");
        if (StringUtils.isNotBlank(image)) {
            menuItem.setImage(image);
        }

        Element otherFilesElement = element.element("otherFiles");
        if (otherFilesElement != null && !otherFilesElement.elements().isEmpty()) {
            List<String> otherFiles = new ArrayList<>();
            for (Element file : otherFilesElement.elements()) {
                String fileName = file.attributeValue("name");
                if (StringUtils.isNotEmpty(fileName))
                    otherFiles.add(fileName);
            }
            menuItem.setOtherFiles(otherFiles);
        }

        Element screenParamsElement = element.element("screenParams");
        if (screenParamsElement != null && !screenParamsElement.elements().isEmpty()) {
            Map<String, Object> params = new HashMap<>();
            for (Element param : screenParamsElement.elements()) {
                String paramName = param.attributeValue("name");
                if (StringUtils.isNotEmpty(paramName)) {
                    String value = param.attributeValue("value");
                    params.put(paramName, value);
                }
            }
            menuItem.setScreenParams(params);
        }

        return menuItem;
    }

    public MenuItem getItemById(String id) {
        MenuItem menuItem = IterableUtils.find(getItemsAsList(), new MenuItemPredicate(id));
        if (menuItem == null) {
            throw new IllegalArgumentException("Unable to find item with id " + id);
        }
        return menuItem;
    }

    @Nullable
    public MenuItem findItemById(String id) {
        return IterableUtils.find(getItemsAsList(), new MenuItemPredicate(id));
    }

    private List<MenuItem> getItemsAsList() {
        return getItemsAsList(getRootItems());
    }

    private List<MenuItem> getItemsAsList(List<MenuItem> allItems) {
        List<MenuItem> items = new ArrayList<>();
        for (MenuItem item : allItems) {
            items.add(item);
            if (item.isMenu())
                items.addAll(getItemsAsList(item.getChildren()));
        }
        return items;
    }

    /**
     * @param itemId id of parent item that contains children
     * @return List of items.
     */
    public List<MenuItem> getAllChildrenAsList(String itemId) {
        MenuItem item = getItemById(itemId);
        List<MenuItem> items = getItemsAsList(Collections.singletonList(item));
        return setCategoriesForSingleItems(items);
    }

    private List<MenuItem> setCategoriesForSingleItems(List<MenuItem> items) {
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            if (item.isMenu()) {
                List<MenuItem> withoutChildrenList = getItemsWithoutChildren(item.getChildren());
                if (!withoutChildrenList.isEmpty()) {
                    for (MenuItem menuItem : withoutChildrenList) {
                        int index = items.indexOf(menuItem);
                        MenuItem itemLabel = new MenuItem(menuItem.getParent(), menuItem.getId());
                        itemLabel.setMenu(true);
                        items.add(index, itemLabel);
                    }
                }
            }
        }
        return items;
    }

    private List<MenuItem> getItemsWithoutChildren(List<MenuItem> items) {
        List<MenuItem> itemList = new ArrayList<>();
        for (MenuItem item : items) {
            if (!item.isMenu())
                itemList.add(item);
        }
        if (itemList.size() == items.size()) {
            return Collections.emptyList();
        }
        return itemList;
    }

    public boolean isRootItem(String itemId) {
        List<MenuItem> rootsItem = getRootItems();
        return rootsItem.stream().anyMatch(menuItem -> menuItem.getId().equals(itemId));
    }

    private class MenuItemPredicate implements Predicate<MenuItem> {
        private final String id;

        MenuItemPredicate(String id) {
            this.id = id;
        }

        @Override
        public boolean evaluate(MenuItem object) {
            return id.equals(object.getId());
        }
    }
}

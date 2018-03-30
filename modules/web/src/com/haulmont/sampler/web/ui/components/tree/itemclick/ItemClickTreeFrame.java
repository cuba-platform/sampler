package com.haulmont.sampler.web.ui.components.tree.itemclick;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.Tree;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.sampler.entity.Task;

import javax.inject.Inject;
import java.util.Map;

public class ItemClickTreeFrame extends AbstractLookup {
    @Inject
    private Tree<Task> tree;

    @Override
    public void init(Map<String, Object> params) {
        tree.setItemClickAction(new BaseAction("treeClickAction") {
            @Override
            public void actionPerform(Component component) {
                Task task = tree.getSingleSelected();
                if (task != null) {
                    showNotification("Item clicked for: " + task.getInstanceName(), NotificationType.HUMANIZED);
                }
            }
        });
    }
}

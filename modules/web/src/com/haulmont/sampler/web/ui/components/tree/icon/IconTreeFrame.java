package com.haulmont.sampler.web.ui.components.tree.icon;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Tree;
import com.haulmont.sampler.entity.Task;

import javax.inject.Inject;
import java.util.Map;

public class IconTreeFrame extends AbstractLookup {
    @Inject
    private Tree<Task> tree;

    @Override
    public void init(Map<String, Object> params) {
        tree.setIconProvider(entity ->
                entity.getParentTask() != null ? "icons/ok.png" : "icons/cancel.png");
    }
}

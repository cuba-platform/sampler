package com.haulmont.sampler.web.ui.components.tree.icon;

import com.haulmont.cuba.gui.components.Tree;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Task;

import javax.inject.Inject;

@UiController("icon-tree")
@UiDescriptor("icon-tree.xml")
@LoadDataBeforeShow
public class IconTreeSample extends ScreenFragment {
    @Inject
    private Tree<Task> tree;

    @Install(to = "tree", subject = "iconProvider")
    protected String treeIconProvider(Task task) {
        return task.getParentTask() != null ? "icons/ok.png" : "icons/cancel.png";
    }
}

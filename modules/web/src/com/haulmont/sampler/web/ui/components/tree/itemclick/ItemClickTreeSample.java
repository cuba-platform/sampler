package com.haulmont.sampler.web.ui.components.tree.itemclick;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Tree;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Task;

import javax.inject.Inject;

@UiController("itemclick-tree")
@UiDescriptor("itemclick-tree.xml")
@LoadDataBeforeShow
public class ItemClickTreeSample extends ScreenFragment {
    @Inject
    private Tree<Task> tree;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        tree.setItemClickAction(new BaseAction("treeClickAction")
                .withHandler(actionPerformedEvent -> {
                    Task task = tree.getSingleSelected();
                    if (task != null) {
                        notifications.create()
                                .withCaption("Item clicked for: " + metadataTools.getInstanceName(task))
                                .show();
                    }
                }));
    }
}

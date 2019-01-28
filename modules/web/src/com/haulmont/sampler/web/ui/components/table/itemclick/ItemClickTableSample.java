package com.haulmont.sampler.web.ui.components.table.itemclick;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("itemclick-table")
@UiDescriptor("itemclick-table.xml")
@LoadDataBeforeShow
public class ItemClickTableSample extends ScreenFragment {

    @Inject
    private Table<Customer> customerTable;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        customerTable.setItemClickAction(new BaseAction("itemClickAction")
                .withHandler(actionPerformedEvent -> {
                    Customer customer = customerTable.getSingleSelected();
                    if (customer != null) {
                        notifications.create()
                                .withCaption("Item clicked for: " + metadataTools.getInstanceName(customer))
                                .show();
                    }
                }));

        customerTable.setEnterPressAction(new BaseAction("enterPressAction")
                .withHandler(actionPerformedEvent -> {
                    Customer customer = customerTable.getSingleSelected();
                    if (customer != null) {
                        notifications.create()
                                .withCaption("Enter pressed for: " + metadataTools.getInstanceName(customer))
                                .show();
                    }
                }));
    }
}
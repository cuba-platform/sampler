package com.haulmont.sampler.web.ui.components.table.action;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("action-table")
@UiDescriptor("action-table.xml")
@LoadDataBeforeShow
public class ActionTableSample extends ScreenFragment {

    @Inject
    private Table<Customer> customerTable;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe("customerTable.greeting")
    protected void onCustomerTableGreetingActionPerformed(Action.ActionPerformedEvent event) {
        Customer customer = customerTable.getSingleSelected();
        notifications.create()
                .withCaption(customer != null
                        ? "Hello, " + metadataTools.getInstanceName(customer)
                        : "No selection")
                .show();
    }
}
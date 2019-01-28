package com.haulmont.sampler.web.ui.components.datagrid.actions;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-actions")
@UiDescriptor("datagrid-actions.xml")
@LoadDataBeforeShow
public class DataGridActionsSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe("customersDataGrid.greeting")
    protected void onCustomersDataGridGreetingActionPerformed(Action.ActionPerformedEvent event) {
        Customer customer = customersDataGrid.getSingleSelected();
        notifications.create()
                .withCaption(customer != null
                        ? "Hello, " + metadataTools.getInstanceName(customer)
                        : "No selection")
                .show();
    }
}
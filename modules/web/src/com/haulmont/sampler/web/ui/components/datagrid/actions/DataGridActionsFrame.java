package com.haulmont.sampler.web.ui.components.datagrid.actions;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

public class DataGridActionsFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    public void greet() {
        Customer customer = customersDataGrid.getSingleSelected();
        if (customer != null)
            showNotification("Hello, " + customer.getInstanceName(), NotificationType.HUMANIZED);
        else
            showNotification("No selection", NotificationType.HUMANIZED);
    }
}
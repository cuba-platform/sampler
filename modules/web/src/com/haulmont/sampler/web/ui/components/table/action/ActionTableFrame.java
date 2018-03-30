package com.haulmont.sampler.web.ui.components.table.action;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

public class ActionTableFrame extends AbstractFrame {

    @Inject
    private Table<Customer> customerTable;

    public void greet() {
        Customer customer = customerTable.getSingleSelected();
        if (customer != null)
            showNotification("Hello, " + customer.getInstanceName(), NotificationType.HUMANIZED);
        else
            showNotification("No selection", NotificationType.HUMANIZED);
    }
}
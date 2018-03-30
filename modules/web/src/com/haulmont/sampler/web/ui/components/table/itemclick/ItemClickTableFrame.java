package com.haulmont.sampler.web.ui.components.table.itemclick;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class ItemClickTableFrame extends AbstractFrame {

    @Inject
    private Table<Customer> customerTable;

    @Override
    public void init(Map<String, Object> params) {
        customerTable.setItemClickAction(new BaseAction("tableClickAction") {
            @Override
            public void actionPerform(Component component) {
                Customer customer = customerTable.getSingleSelected();
                if (customer != null)
                    showNotification("Item clicked for: " + customer.getInstanceName(), NotificationType.HUMANIZED);
            }
        });
        customerTable.setEnterPressAction(new BaseAction("enterPressAction") {
            @Override
            public void actionPerform(Component component) {
                Customer customer = customerTable.getSingleSelected();
                if (customer != null)
                    showNotification("Enter pressed for: " + customer.getInstanceName(), NotificationType.HUMANIZED);
            }
        });
    }
}
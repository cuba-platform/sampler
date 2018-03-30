package com.haulmont.sampler.web.ui.components.datagrid.itemclick;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridItemClickFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.setItemClickAction(new BaseAction("itemClickAction") {
            @Override
            public void actionPerform(Component component) {
                Customer customer = customersDataGrid.getSingleSelected();
                if (customer != null)
                    showNotification("Item clicked for: " + customer.getInstanceName(), NotificationType.HUMANIZED);
            }
        });

        customersDataGrid.setEnterPressAction(new BaseAction("enterPressAction") {
            @Override
            public void actionPerform(Component component) {
                Customer customer = customersDataGrid.getSingleSelected();
                if (customer != null)
                    showNotification("Enter pressed for: " + customer.getInstanceName(), NotificationType.HUMANIZED);
            }
        });
    }
}
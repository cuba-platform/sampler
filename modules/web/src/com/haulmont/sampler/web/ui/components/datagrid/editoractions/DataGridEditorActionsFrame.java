package com.haulmont.sampler.web.ui.components.datagrid.editoractions;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class DataGridEditorActionsFrame extends AbstractFrame {

    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Inject
    private CollectionDatasource<Customer, UUID> customersDs;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.addAction(new CreateAction(customersDataGrid) {
            @Override
            public void actionPerform(Component component) {
                Customer newCustomer = metadata.create(Customer.class);
                customersDs.addItem(newCustomer);
                customersDataGrid.edit(newCustomer);
            }
        });

        customersDataGrid.addAction(new EditAction(customersDataGrid) {
            @Override
            public void actionPerform(Component component) {
                Customer selected = customersDataGrid.getSingleSelected();
                if (selected != null) {
                    customersDataGrid.edit(selected);
                } else {
                    showNotification("Item is not selected");
                }
            }
        });
    }
}
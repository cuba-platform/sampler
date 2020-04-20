package com.haulmont.sampler.web.ui.components.datagrid.editoractions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-editor-actions")
@UiDescriptor("datagrid-editor-actions.xml")
@LoadDataBeforeShow
public class DataGridEditorActionsSample extends ScreenFragment {

    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private CollectionContainer<Customer> customersDc;
    @Inject
    private Notifications notifications;
    @Inject
    private Metadata metadata;

    @Subscribe("customersDataGrid.create")
    public void onCustomersDataGridCreate(Action.ActionPerformedEvent event) {
        if (customersDataGrid.isEditorActive()) {
            notifications.create()
                    .withCaption("Close the editor before creating a new entity")
                    .show();
            return;
        }
        Customer newCustomer = metadata.create(Customer.class);
        customersDc.getMutableItems().add(newCustomer);
        customersDataGrid.edit(newCustomer);
    }

    @Subscribe("customersDataGrid.edit")
    public void onCustomersDataGridEdit(Action.ActionPerformedEvent event) {
        Customer selected = customersDataGrid.getSingleSelected();
        if (selected != null) {
            customersDataGrid.edit(selected);
        } else {
            notifications.create()
                    .withCaption("Item is not selected")
                    .show();
        }
    }
}
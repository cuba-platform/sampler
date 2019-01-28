package com.haulmont.sampler.web.ui.components.datagrid.editoractions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.components.Actions;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
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
    private CollectionLoader<Customer> customersLoader;
    @Inject
    private Actions actions;
    @Inject
    private Notifications notifications;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        CreateAction createAction = (CreateAction) actions.create(CreateAction.ID);
        createAction.withHandler(actionPerformedEvent -> {
            Customer newCustomer = metadata.create(Customer.class);
            customersDc.getMutableItems().add(newCustomer);
            customersDataGrid.edit(newCustomer);
        });
        customersDataGrid.addAction(createAction);

        EditAction editAction = (EditAction) actions.create(EditAction.ID);
        editAction.withHandler(actionPerformedEvent -> {
            Customer selected = customersDataGrid.getSingleSelected();
            if (selected != null) {
                customersDataGrid.edit(selected);
            } else {
                notifications.create()
                        .withCaption("Item is not selected")
                        .show();
            }
        });
        customersDataGrid.addAction(editAction);
    }
}
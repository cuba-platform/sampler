package com.haulmont.sampler.web.ui.components.datagrid.editorevents;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridEditorEventsFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.addEditorCloseListener(event ->
                showNotification("Editor closed", NotificationType.TRAY));

        customersDataGrid.addEditorPreCommitListener(event ->
                showNotification("Pre Commit"));

        customersDataGrid.addEditorPostCommitListener(event ->
                showNotification("Post Commit"));
    }
}

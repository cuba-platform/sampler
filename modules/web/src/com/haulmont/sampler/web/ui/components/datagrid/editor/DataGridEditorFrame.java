package com.haulmont.sampler.web.ui.components.datagrid.editor;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridEditorFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private CheckBox editorBuffered;

    @Override
    public void init(Map<String, Object> params) {
        editorBuffered.setValue(customersDataGrid.isEditorBuffered());

        editorBuffered.addValueChangeListener(e ->
                customersDataGrid.setEditorBuffered(editorBuffered.getValue()));
    }
}

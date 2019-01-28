package com.haulmont.sampler.web.ui.components.datagrid.editor;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-editor")
@UiDescriptor("datagrid-editor.xml")
@LoadDataBeforeShow
public class DataGridEditorSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private CheckBox editorBuffered;

    @Subscribe
    protected void onInit(InitEvent event) {
        editorBuffered.setValue(customersDataGrid.isEditorBuffered());
    }

    @Subscribe("editorBuffered")
    protected void onEditorBufferedValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        customersDataGrid.setEditorBuffered(Boolean.TRUE.equals(event.getValue()));
    }
}

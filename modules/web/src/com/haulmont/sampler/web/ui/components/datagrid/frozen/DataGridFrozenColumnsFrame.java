package com.haulmont.sampler.web.ui.components.datagrid.frozen;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridFrozenColumnsFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private TextField frozenColumnCountField;

    @Override
    public void init(Map<String, Object> params) {
        frozenColumnCountField.setValue(customersDataGrid.getFrozenColumnCount());
        frozenColumnCountField.addValueChangeListener(e ->
                customersDataGrid.setFrozenColumnCount(frozenColumnCountField.getValue()));
    }
}
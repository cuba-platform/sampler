package com.haulmont.sampler.web.ui.components.datagrid.generate;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridGeneratedColumnFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.addGeneratedColumn("fullName", new DataGrid.ColumnGenerator<Customer, String>() {
            @Override
            public String getValue(DataGrid.ColumnGeneratorEvent<Customer> event) {
                return event.getItem().getInstanceName();
            }

            @Override
            public Class<String> getType() {
                return String.class;
            }
        });
    }
}
package com.haulmont.sampler.web.ui.components.datagrid.generate;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-generated-column")
@UiDescriptor("datagrid-generated-column.xml")
@LoadDataBeforeShow
public class DataGridGeneratedColumnSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        customersDataGrid.addGeneratedColumn("fullName", new DataGrid.ColumnGenerator<Customer, String>() {
            @Override
            public String getValue(DataGrid.ColumnGeneratorEvent<Customer> event) {
                return metadataTools.getInstanceName(event.getItem());
            }

            @Override
            public Class<String> getType() {
                return String.class;
            }
        });
    }
}
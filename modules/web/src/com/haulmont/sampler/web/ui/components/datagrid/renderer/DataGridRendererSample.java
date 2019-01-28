package com.haulmont.sampler.web.ui.components.datagrid.renderer;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DataGrid.ImageRenderer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-renderer")
@UiDescriptor("datagrid-renderer.xml")
@LoadDataBeforeShow
public class DataGridRendererSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Subscribe
    protected void onInit(InitEvent event) {
        DataGrid.Column iconColumn = customersDataGrid.addGeneratedColumn("icon",
                new DataGrid.ColumnGenerator<Customer, String>() {
                    @Override
                    public String getValue(DataGrid.ColumnGeneratorEvent<Customer> event) {
                        switch (event.getItem().getGrade()) {
                            case STANDARD:
                                return "images/customer-standard.svg";
                            case HIGH:
                                return "images/customer-high.svg";
                            case PREMIUM:
                                return "images/customer-premium.svg";
                        }
                        return null;
                    }

                    @Override
                    public Class<String> getType() {
                        return String.class;
                    }
                });

        iconColumn.setRenderer(customersDataGrid.createRenderer(ImageRenderer.class));
    }
}
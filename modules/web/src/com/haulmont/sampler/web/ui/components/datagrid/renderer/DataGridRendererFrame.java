package com.haulmont.sampler.web.ui.components.datagrid.renderer;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DataGrid.ImageRenderer;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridRendererFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
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
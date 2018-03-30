package com.haulmont.sampler.web.ui.components.datagrid.style;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;
import org.apache.commons.lang.BooleanUtils;

import javax.inject.Inject;
import java.util.Map;

public class DataGridStyleFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.addRowStyleProvider(entity ->
                BooleanUtils.isTrue(entity.getActive()) ? "active-customer" : null);

        customersDataGrid.addCellStyleProvider((entity, property) -> {
            if ("grade".equals(property)) {
                switch (entity.getGrade()) {
                    case PREMIUM:
                        return "premium-grade";
                    case HIGH:
                        return "high-grade";
                    case STANDARD:
                        return "standard-grade";
                }
            }
            return null;
        });
    }
}
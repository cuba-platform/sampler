package com.haulmont.sampler.web.ui.components.datagrid.description;

import com.haulmont.chile.core.model.Instance;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class DataGridDescriptionProviderFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.setRowDescriptionProvider(Instance::getInstanceName);

        customersDataGrid.setCellDescriptionProvider((entity, columnId) -> {
            if ("name".equals(columnId) || "lastName".equals(columnId)) {
                return null;
            }

            String description = "<strong>" +
                    messages.getTools().getPropertyCaption(entity.getMetaClass(), columnId) +
                    ": </strong>";

            if ("grade".equals(columnId)) {
                description += messages.getMessage(entity.getGrade());
            } else if ("active".equals(columnId)) {
                description += getMessage(entity.getActive() ? "trueString" : "falseString");
            } else {
                description += entity.getValue(columnId);
            }
            return description;
        });
    }
}

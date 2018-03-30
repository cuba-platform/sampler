package com.haulmont.sampler.web.ui.components.datagrid.converter;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Customer;
import org.apache.commons.lang.BooleanUtils;

import javax.inject.Inject;
import java.util.Locale;
import java.util.Map;

public class DataGridConverterFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Override
    public void init(Map<String, Object> params) {
        customersDataGrid.getColumnNN("active").setConverter(new DataGrid.Converter<String, Boolean>() {
            @Override
            public Boolean convertToModel(String value, Class<? extends Boolean> targetType, Locale locale) {
                return null;
            }

            @Override
            public String convertToPresentation(Boolean value, Class<? extends String> targetType, Locale locale) {
                return getMessage(BooleanUtils.isTrue(value) ? "trueString" : "falseString");
            }

            @Override
            public Class<Boolean> getModelType() {
                return Boolean.class;
            }

            @Override
            public Class<String> getPresentationType() {
                return String.class;
            }
        });
    }
}
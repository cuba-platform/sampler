package com.haulmont.sampler.web.ui.components.datagrid.converter;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;
import org.apache.commons.lang3.BooleanUtils;

import javax.inject.Inject;
import java.util.Locale;

@UiController("datagrid-converter")
@UiDescriptor("datagrid-converter.xml")
@LoadDataBeforeShow
public class DataGridConverterSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private MessageBundle messageBundle;

    @Subscribe
    protected void onInit(InitEvent event) {
        customersDataGrid.getColumnNN("active").setConverter(new DataGrid.Converter<String, Boolean>() {
            @Override
            public Boolean convertToModel(String value, Class<? extends Boolean> targetType, Locale locale) {
                return null;
            }

            @Override
            public String convertToPresentation(Boolean value, Class<? extends String> targetType, Locale locale) {
                return messageBundle.getMessage(BooleanUtils.isTrue(value) ? "trueString" : "falseString");
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
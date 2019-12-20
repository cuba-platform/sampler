package com.haulmont.sampler.web.ui.styles.datagrid;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-styles")
@UiDescriptor("datagrid-styles.xml")
@LoadDataBeforeShow
public class DataGridStylesSample extends ScreenFragment {

    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Subscribe
    protected void onInit(InitEvent event) {
        for (Component component : getFragment().getComponents()) {
            if (component instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) component;
                checkBox.addValueChangeListener(this::updateDataGridStyle);
            }
        }
    }

    private void updateDataGridStyle(HasValue.ValueChangeEvent<Boolean> e) {
        String id = e.getComponent().getId();
        Boolean value = e.getValue();
        if (Boolean.TRUE.equals(value)) {
            customersDataGrid.addStyleName(prepareStyleName(id));
        } else {
            customersDataGrid.removeStyleName(prepareStyleName(id));
        }
    }

    private String prepareStyleName(String stylename) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stylename.length(); i++) {
            char c = stylename.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("-").append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
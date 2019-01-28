package com.haulmont.sampler.web.ui.styles.table;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("styles-table")
@UiDescriptor("styles-table.xml")
@LoadDataBeforeShow
public class TableStylesSample extends ScreenFragment {
    @Inject
    private Table<Customer> customersTable;

    @Subscribe
    protected void onInit(InitEvent event) {
        for (Component component : getFragment().getComponents()) {
            if (component instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) component;
                checkBox.addValueChangeListener(this::changeTableStyle);
            }
        }
    }

    private void changeTableStyle(HasValue.ValueChangeEvent e) {
        String id = e.getComponent().getId();
        Object value = e.getValue();
        if (value != null) {
            Boolean checked = (Boolean) value;
            if (checked) {
                customersTable.addStyleName(prepareStyleName(id));
            } else {
                customersTable.removeStyleName(prepareStyleName(id));
            }
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
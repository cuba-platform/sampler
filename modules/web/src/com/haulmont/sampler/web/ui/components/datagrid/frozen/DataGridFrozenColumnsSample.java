package com.haulmont.sampler.web.ui.components.datagrid.frozen;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-frozen-columns")
@UiDescriptor("datagrid-frozen-columns.xml")
@LoadDataBeforeShow
public class DataGridFrozenColumnsSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private TextField<Integer> frozenColumnCountField;

    @Subscribe
    protected void onInit(InitEvent event) {
        frozenColumnCountField.setValue(customersDataGrid.getFrozenColumnCount());
    }

    @Subscribe("frozenColumnCountField")
    protected void onFrozenColumnCountFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        customersDataGrid.setFrozenColumnCount(event.getValue() != null ? event.getValue() : 0);
    }
}
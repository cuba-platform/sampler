package com.haulmont.sampler.web.ui.components.datagrid.selectionmode;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DataGrid.SelectionMode;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.Map;

@UiController("datagrid-selection-mode")
@UiDescriptor("datagrid-selection-mode.xml")
@LoadDataBeforeShow
public class DataGridSelectionModeSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private LookupField<SelectionMode> selectionModeField;

    @Subscribe
    protected void onInit(InitEvent event) {
        Map<String, SelectionMode> selectionModeMap = new LinkedHashMap<>();
        for (SelectionMode mode : SelectionMode.values()) {
            selectionModeMap.put(mode.name(), mode);
        }
        selectionModeField.setOptionsMap(selectionModeMap);
        selectionModeField.setValue(customersDataGrid.getSelectionMode());
    }

    @Subscribe("selectionModeField")
    protected void onSelectionModeFieldValueChange(HasValue.ValueChangeEvent<SelectionMode> event) {
        customersDataGrid.setSelectionMode(event.getValue());
    }

}
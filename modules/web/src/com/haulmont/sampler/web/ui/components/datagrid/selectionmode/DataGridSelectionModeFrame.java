package com.haulmont.sampler.web.ui.components.datagrid.selectionmode;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DataGrid.SelectionMode;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataGridSelectionModeFrame extends AbstractFrame {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private LookupField selectionModeField;

    @Override
    public void init(Map<String, Object> params) {
        Map<String, SelectionMode> selectionModeMap = new LinkedHashMap<>();
        for (SelectionMode mode : SelectionMode.values()) {
            selectionModeMap.put(mode.name(), mode);
        }
        selectionModeField.setOptionsMap(selectionModeMap);
        selectionModeField.setValue(customersDataGrid.getSelectionMode());

        selectionModeField.addValueChangeListener(e ->
                customersDataGrid.setSelectionMode((SelectionMode) e.getValue()));
    }
}
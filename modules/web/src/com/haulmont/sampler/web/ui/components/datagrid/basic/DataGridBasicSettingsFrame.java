package com.haulmont.sampler.web.ui.components.datagrid.basic;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.sampler.entity.Order;
import org.apache.commons.lang.BooleanUtils;

import javax.inject.Inject;
import java.util.Map;

public class DataGridBasicSettingsFrame extends AbstractFrame {
    @Inject
    private DataGrid<Order> ordersDataGrid;
    @Inject
    private CheckBox columnsCollapsingAllowed;
    @Inject
    private CheckBox reorderingAllowed;
    @Inject
    private CheckBox sortable;

    @Override
    public void init(Map<String, Object> params) {
        sortable.setValue(ordersDataGrid.isSortable());
        columnsCollapsingAllowed.setValue(ordersDataGrid.isColumnsCollapsingAllowed());
        reorderingAllowed.setValue(ordersDataGrid.isColumnReorderingAllowed());

        columnsCollapsingAllowed.addValueChangeListener(e ->
                ordersDataGrid.setColumnsCollapsingAllowed(BooleanUtils.isTrue((Boolean) e.getValue())));
        reorderingAllowed.addValueChangeListener(e ->
                ordersDataGrid.setColumnReorderingAllowed(BooleanUtils.isTrue((Boolean) e.getValue())));
        sortable.addValueChangeListener(e ->
                ordersDataGrid.setSortable(BooleanUtils.isTrue((Boolean) e.getValue())));
    }
}
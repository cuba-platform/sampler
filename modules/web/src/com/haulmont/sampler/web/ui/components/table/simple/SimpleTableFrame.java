package com.haulmont.sampler.web.ui.components.table.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Map;

public class SimpleTableFrame extends AbstractFrame {

    @Inject
    private CheckBox multiselect;
    @Inject
    private CheckBox columnControlVisible;
    @Inject
    private CheckBox sortable;
    @Inject
    private CheckBox reorderingAllowed;
    @Inject
    private CheckBox showSelection;
    @Inject
    private Table<Order> ordersTable;

    @Override
    public void init(Map<String, Object> params) {
        multiselect.setValue(ordersTable.isMultiSelect());
        sortable.setValue(ordersTable.isSortable());
        columnControlVisible.setValue(ordersTable.getColumnControlVisible());
        reorderingAllowed.setValue(ordersTable.getColumnReorderingAllowed());
        showSelection.setValue(ordersTable.isShowSelection());

        multiselect.addValueChangeListener(e ->
                ordersTable.setMultiSelect((boolean) e.getValue()));
        sortable.addValueChangeListener(e ->
                ordersTable.setSortable((boolean) e.getValue()));
        columnControlVisible.addValueChangeListener(e ->
                ordersTable.setColumnControlVisible((boolean) e.getValue()));
        reorderingAllowed.addValueChangeListener(e ->
                ordersTable.setColumnReorderingAllowed((boolean) e.getValue()));
        showSelection.addValueChangeListener(e -> ordersTable.setShowSelection((boolean) e.getValue()));
    }
}
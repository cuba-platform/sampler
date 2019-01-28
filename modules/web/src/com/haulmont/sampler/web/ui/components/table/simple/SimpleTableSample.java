package com.haulmont.sampler.web.ui.components.table.simple;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("simple-table")
@UiDescriptor("simple-table.xml")
@LoadDataBeforeShow
public class SimpleTableSample extends ScreenFragment {

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

    @Subscribe
    protected void onInit(InitEvent event) {
        multiselect.setValue(ordersTable.isMultiSelect());
        sortable.setValue(ordersTable.isSortable());
        columnControlVisible.setValue(ordersTable.getColumnControlVisible());
        reorderingAllowed.setValue(ordersTable.getColumnReorderingAllowed());
        showSelection.setValue(ordersTable.isShowSelection());
    }

    @Subscribe("multiselect")
    protected void onMultiselectValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersTable.setMultiSelect(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("sortable")
    protected void onSortableValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersTable.setSortable(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("columnControlVisible")
    protected void onColumnControlVisibleValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersTable.setColumnControlVisible(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("reorderingAllowed")
    protected void onReorderingAllowedValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersTable.setColumnReorderingAllowed(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("showSelection")
    protected void onShowSelectionValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersTable.setShowSelection(Boolean.TRUE.equals(event.getValue()));
    }
}
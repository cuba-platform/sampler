package com.haulmont.sampler.web.ui.components.datagrid.basic;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("datagrid-basic-settings")
@UiDescriptor("datagrid-basic-settings.xml")
@LoadDataBeforeShow
public class DataGridBasicSettingsSample extends ScreenFragment {
    @Inject
    private DataGrid<Order> ordersDataGrid;
    @Inject
    private CheckBox columnsCollapsingAllowed;
    @Inject
    private CheckBox reorderingAllowed;
    @Inject
    private CheckBox sortable;

    @Subscribe
    protected void onInit(InitEvent event) {
        sortable.setValue(ordersDataGrid.isSortable());
        columnsCollapsingAllowed.setValue(ordersDataGrid.isColumnsCollapsingAllowed());
        reorderingAllowed.setValue(ordersDataGrid.isColumnReorderingAllowed());
    }

    @Subscribe("columnsCollapsingAllowed")
    protected void onColumnsCollapsingAllowedValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersDataGrid.setColumnsCollapsingAllowed(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("reorderingAllowed")
    protected void onReorderingAllowedValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersDataGrid.setColumnReorderingAllowed(Boolean.TRUE.equals(event.getValue()));
    }

    @Subscribe("sortable")
    protected void onSortableValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        ordersDataGrid.setSortable(Boolean.TRUE.equals(event.getValue()));
    }
}
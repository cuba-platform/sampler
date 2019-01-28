package com.haulmont.sampler.web.ui.charts.pivot.sorter;

import com.haulmont.charts.gui.components.pivot.PivotTable;
import com.haulmont.charts.gui.model.JsFunction;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("pivot-table-sorter-function")
@UiDescriptor("pivot-table-sorter-function.xml")
@LoadDataBeforeShow
public class PivotTableSorterFunctionSample extends ScreenFragment {
    @Inject
    private PivotTable pivotTable;
    @Inject
    private MessageBundle messageBundle;

    @Subscribe
    protected void onInit(InitEvent event) {
        pivotTable.setSortersFunction(new JsFunction(messageBundle.getMessage("function.sorters.dayOfWeek")));
    }
}
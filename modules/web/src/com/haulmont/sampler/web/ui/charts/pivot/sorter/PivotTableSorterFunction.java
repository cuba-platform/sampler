package com.haulmont.sampler.web.ui.charts.pivot.sorter;

import com.haulmont.charts.gui.components.pivot.PivotTable;
import com.haulmont.charts.gui.model.JsFunction;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class PivotTableSorterFunction extends AbstractFrame {
    @Inject
    private PivotTable pivotTable;

    @Override
    public void init(Map<String, Object> params) {
        pivotTable.setSortersFunction(new JsFunction(getMessage("function.sorters.dayOfWeek")));
    }
}
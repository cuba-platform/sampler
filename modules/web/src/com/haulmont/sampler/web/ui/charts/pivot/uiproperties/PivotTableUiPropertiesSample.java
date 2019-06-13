package com.haulmont.sampler.web.ui.charts.pivot.uiproperties;

import com.haulmont.charts.gui.components.pivot.PivotTable;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("pivot-table-ui-properties")
@UiDescriptor("pivot-table-ui-properties.xml")
@LoadDataBeforeShow
public class PivotTableUiPropertiesSample extends ScreenFragment {

    @Inject
    private PivotTable pivotTable;

    @Subscribe("showUiBtn")
    protected void onShowUiBtnClick(Button.ClickEvent event) {
        pivotTable.setShowUI(!pivotTable.isShowUI());
        pivotTable.repaint();
    }

    @Subscribe("showRowTotalsBtn")
    protected void onShowRowTotalsBtnClick(Button.ClickEvent event) {
        pivotTable.setShowRowTotals(!pivotTable.isRowTotalsShown());
        pivotTable.repaint();
    }

    @Subscribe("showColTotalsBtn")
    protected void onShowColTotalsBtnClick(Button.ClickEvent event) {
        pivotTable.setShowColTotals(!pivotTable.isColTotalsShown());
        pivotTable.repaint();
    }
}
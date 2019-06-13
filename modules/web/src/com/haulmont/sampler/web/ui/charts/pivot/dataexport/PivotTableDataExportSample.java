package com.haulmont.sampler.web.ui.charts.pivot.dataexport;

import com.haulmont.charts.gui.components.pivot.PivotTable;
import com.haulmont.charts.gui.components.pivot.PivotTableExtension;
import com.haulmont.charts.web.gui.components.pivottable.WebPivotTableExtension;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("pivot-table-data-export")
@UiDescriptor("pivot-table-data-export.xml")
@LoadDataBeforeShow
public class PivotTableDataExportSample extends ScreenFragment {

    @Inject
    private PivotTable pivotTable;

    private PivotTableExtension extension;

    @Subscribe
    protected void onInit(InitEvent event) {
        extension = new WebPivotTableExtension(pivotTable);
    }

    @Subscribe("exportBtn")
    protected void onExportBtnClick(Button.ClickEvent event) {
        extension.exportTableToXls();
    }
}

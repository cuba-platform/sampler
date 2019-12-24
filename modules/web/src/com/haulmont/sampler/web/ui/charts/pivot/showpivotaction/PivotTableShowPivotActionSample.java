package com.haulmont.sampler.web.ui.charts.pivot.showpivotaction;

import com.haulmont.charts.gui.components.action.list.PivotScreenBuilder;
import com.haulmont.charts.gui.components.action.list.ShowPivotAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Actions;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.TipInfo;

import javax.inject.Inject;
import java.util.Arrays;

@UiController("pivot-table-show-pivot-action")
@UiDescriptor("pivot-table-show-pivot-action.xml")
@LoadDataBeforeShow
public class PivotTableShowPivotActionSample extends ScreenFragment {

    @Inject
    private GroupTable<TipInfo> tipsTable;
    @Inject
    private Button defaultShowPivotBtn;

    @Inject
    private Actions actions;
    @Inject
    private MessageBundle messageBundle;

    @Subscribe
    public void onInit(InitEvent event) {
        ShowPivotAction showPivotAction = actions.create(ShowPivotAction.class);
        showPivotAction.setTarget(tipsTable);
        defaultShowPivotBtn.setAction(showPivotAction);
    }

    @Subscribe("tipsTable.customShowPivotAction")
    public void onTipsTableCustomShowPivotAction(Action.ActionPerformedEvent event) {
        PivotScreenBuilder builder = getBeanLocator().getPrototype(PivotScreenBuilder.NAME, tipsTable);
        builder.withIncludedProperties(Arrays.asList("sex", "smoker", "day", "time"))
                .withNativeJson("{\"cols\": " + messageBundle.getMessage("localizedCols") + ","
                               + "\"rows\": " + messageBundle.getMessage("localizedRows") + "}")
                .withItems(tipsTable.getItems().getItems())
                .build()
                .show();
    }
}
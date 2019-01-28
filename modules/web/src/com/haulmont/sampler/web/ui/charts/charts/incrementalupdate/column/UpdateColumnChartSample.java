package com.haulmont.sampler.web.ui.charts.charts.incrementalupdate.column;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.IncomeExpenses;
import org.apache.commons.lang3.RandomUtils;

import javax.inject.Inject;
import java.util.List;

@UiController("update-column-chart")
@UiDescriptor("update-column-chart.xml")
@LoadDataBeforeShow
public class UpdateColumnChartSample extends ScreenFragment {

    @Inject
    private CollectionContainer<IncomeExpenses> incomeExpensesDc;
    @Inject
    private Metadata metadata;

    private int lastYear = 2014;

    @Subscribe("addIncome")
    protected void onAddIncomeClick(Button.ClickEvent event) {
        incomeExpensesDc.getMutableItems().add(generateIncome());
    }

    @Subscribe("removeIncome")
    protected void onRemoveIncomeClick(Button.ClickEvent event) {
        List<IncomeExpenses> items = incomeExpensesDc.getMutableItems();
        if (!items.isEmpty()) {
            items.remove(0);
        }
    }

    private IncomeExpenses generateIncome() {
        IncomeExpenses incomeExpenses = metadata.create(IncomeExpenses.class);
        incomeExpenses.setYear(++lastYear);
        double income = RandomUtils.nextInt(0, 40) + RandomUtils.nextDouble(0, 1);
        incomeExpenses.setIncome(income);
        incomeExpenses.setDashLengthColumn(0);
        return incomeExpenses;
    }
}
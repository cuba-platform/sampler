package com.haulmont.sampler.web.ui.charts.charts.incrementalupdate.column;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.IncomeExpenses;
import org.apache.commons.lang.math.RandomUtils;

import javax.inject.Inject;
import java.util.UUID;

public class UpdateColumnChartFrame extends AbstractFrame {

    @Inject
    private CollectionDatasource<IncomeExpenses, UUID> incomeExpensesDs;
    @Inject
    private Metadata metadata;

    private int lastYear = 2014;

    public void addIncome() {
        incomeExpensesDs.includeItem(generateIncome());
    }

    public void removeIncome() {
        if (!incomeExpensesDs.getItems().isEmpty()) {
            incomeExpensesDs.excludeItem(incomeExpensesDs.getItems().iterator().next());
        }
    }

    private IncomeExpenses generateIncome() {
        IncomeExpenses incomeExpenses = metadata.create(IncomeExpenses.class);
        incomeExpenses.setYear(lastYear++);
        incomeExpenses.setIncome(RandomUtils.nextInt(40) + RandomUtils.nextDouble());
        incomeExpenses.setDashLengthColumn(0);
        return incomeExpenses;
    }
}
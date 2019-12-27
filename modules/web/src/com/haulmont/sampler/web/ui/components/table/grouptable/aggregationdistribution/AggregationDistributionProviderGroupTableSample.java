package com.haulmont.sampler.web.ui.components.table.grouptable.aggregationdistribution;

import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Employee;
import com.haulmont.sampler.entity.Experience;

import java.math.BigDecimal;

@UiController("aggregation-distribution-provider-group-table")
@UiDescriptor("aggregation-distribution-provider-group-table.xml")
@LoadDataBeforeShow
public class AggregationDistributionProviderGroupTableSample extends ScreenFragment {

    @Install(to = "employeesTable", subject = "aggregationDistributionProvider")
    private void employeesTableAggregationDistributionProvider(GroupTable.GroupAggregationDistributionContext<Employee> context) {
        BigDecimal value = (BigDecimal) context.getValue();
        if (value.signum() == -1) {
            return;
        }

        long highExperienceCount = context.getScope().stream()
                .filter(employee -> Experience.HIGH.equals(employee.getExperience()))
                .count();
        long commonExperienceCount = context.getScope().size() - highExperienceCount;

        // high value is 60% of total sum
        BigDecimal valuePerHigh = value
                .multiply(BigDecimal.valueOf(0.6))
                .divide(BigDecimal.valueOf(highExperienceCount), BigDecimal.ROUND_DOWN);

        // common value is 40% of total sum
        BigDecimal valuePerCommon = value
                .multiply(BigDecimal.valueOf(0.4))
                .divide(BigDecimal.valueOf(commonExperienceCount), BigDecimal.ROUND_DOWN);

        for (Employee employee : context.getScope()) {
            if (Experience.HIGH.equals(employee.getExperience())) {
                employee.setSalary(valuePerHigh);
            } else {
                employee.setSalary(valuePerCommon);
            }
        }
    }
}

package com.haulmont.sampler.web.ui.components.table.grouptable.style;

import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.data.GroupInfo;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.annotation.Nullable;
import javax.inject.Inject;

@UiController("style-group-table")
@UiDescriptor("style-group-table.xml")
@LoadDataBeforeShow
public class StyleGroupTableSample extends ScreenFragment {

    @Inject
    private GroupTable<Customer> customerTable;

    @Subscribe
    public void onInit(InitEvent event) {
        customerTable.setStyleProvider(new GroupTable.GroupStyleProvider<Customer>() {

            @SuppressWarnings("unchecked")
            @Override
            public String getStyleName(GroupInfo info) {
                CustomerGrade grade = (CustomerGrade) info.getPropertyValue(info.getProperty());
                switch (grade) {
                    case PREMIUM:
                        return "premium-grade";
                    case HIGH:
                        return "high-grade";
                    case STANDARD:
                        return "standard-grade";
                }
                return null;
            }

            @Override
            public String getStyleName(Customer customer, @Nullable String property) {
                if (Boolean.TRUE.equals(customer.getActive())) {
                    return "active-customer";
                }
                return null;
            }
        });
    }
}

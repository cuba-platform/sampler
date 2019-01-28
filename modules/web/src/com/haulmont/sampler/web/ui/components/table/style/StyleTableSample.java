package com.haulmont.sampler.web.ui.components.table.style;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

@UiController("style-table")
@UiDescriptor("style-table.xml")
@LoadDataBeforeShow
public class StyleTableSample extends ScreenFragment {

    @Install(to = "customerTable", subject = "styleProvider")
    protected String customerTableStyleProvider(Customer customer, String property) {
        if (property == null) {
            if (Boolean.TRUE.equals(customer.getActive())) {
                return "active-customer";
            }
        } else if (property.equals("grade")) {
            switch (customer.getGrade()) {
                case PREMIUM:
                    return "premium-grade";
                case HIGH:
                    return "high-grade";
                case STANDARD:
                    return "standard-grade";
            }
        }
        return null;
    }
}
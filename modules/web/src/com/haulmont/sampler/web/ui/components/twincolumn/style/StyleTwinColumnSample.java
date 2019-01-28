package com.haulmont.sampler.web.ui.components.twincolumn.style;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

@UiController("style-twincolumn")
@UiDescriptor("style-twincolumn.xml")
@LoadDataBeforeShow
public class StyleTwinColumnSample extends ScreenFragment {

    @Install(to = "twinColumn", subject = "optionStyleProvider")
    protected String twinColumnOptionStyleProvider(Customer customer, boolean selected) {
        switch (customer.getGrade()) {
            case PREMIUM:
                return "premium-grade";
            case HIGH:
                return "high-grade";
            case STANDARD:
                return "standard-grade";
            default:
                return null;
        }
    }
}
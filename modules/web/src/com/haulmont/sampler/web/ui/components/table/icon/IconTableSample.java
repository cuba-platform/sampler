package com.haulmont.sampler.web.ui.components.table.icon;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

@UiController("icon-table")
@UiDescriptor("icon-table.xml")
@LoadDataBeforeShow
public class IconTableSample extends ScreenFragment {

    @Install(to = "customerTable", subject = "iconProvider")
    protected String customerTableIconProvider(Customer customer) {
        return customer.getActive() ? "icons/ok.png" : "icons/cancel.png";
    }
}
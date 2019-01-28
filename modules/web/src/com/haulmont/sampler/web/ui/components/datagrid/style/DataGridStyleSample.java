package com.haulmont.sampler.web.ui.components.datagrid.style;

import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-style")
@UiDescriptor("datagrid-style.xml")
@LoadDataBeforeShow
public class DataGridStyleSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Install(to = "customersDataGrid", subject = "rowStyleProvider")
    protected String customersDataGridRowStyleProvider(Customer customer) {
        return Boolean.TRUE.equals(customer.getActive()) ? "active-customer" : null;
    }

    @Subscribe
    protected void onInit(InitEvent event) {
        customersDataGrid.getColumnNN("grade")
                .setStyleProvider(customer -> {
                    switch (customer.getGrade()) {
                        case PREMIUM:
                            return "premium-grade";
                        case HIGH:
                            return "high-grade";
                        case STANDARD:
                            return "standard-grade";
                    }

                    return null;
                });
    }
}
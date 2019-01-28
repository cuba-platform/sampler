package com.haulmont.sampler.web.ui.components.datagrid.description;

import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-description-provider")
@UiDescriptor("datagrid-description-provider.xml")
@LoadDataBeforeShow
public class DataGridDescriptionProviderSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;

    @Inject
    private Messages messages;
    @Inject
    private MessageBundle messageBundle;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        customersDataGrid.getColumnNN("age").setDescriptionProvider(customer ->
                        getPropertyCaption(customer, "age") +
                                customer.getAge(),
                ContentMode.HTML);

        customersDataGrid.getColumnNN("active").setDescriptionProvider(customer ->
                        getPropertyCaption(customer, "active") +
                                messageBundle.getMessage(customer.getActive() ? "trueString" : "falseString"),
                ContentMode.HTML);

        customersDataGrid.getColumnNN("grade").setDescriptionProvider(customer ->
                        getPropertyCaption(customer, "grade") +
                                messages.getMessage(customer.getGrade()),
                ContentMode.HTML);
    }

    private String getPropertyCaption(Customer customer, String property) {
        return "<strong>" +
                messages.getTools().getPropertyCaption(customer.getMetaClass(), property) +
                ": </strong>";
    }

    @Install(to = "customersDataGrid", subject = "rowDescriptionProvider")
    protected String customersDataGridRowDescriptionProvider(Customer customer) {
        return metadataTools.getInstanceName(customer);
    }


}

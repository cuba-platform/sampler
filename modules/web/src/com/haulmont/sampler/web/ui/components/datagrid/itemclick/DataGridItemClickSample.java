package com.haulmont.sampler.web.ui.components.datagrid.itemclick;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("datagrid-itemclick")
@UiDescriptor("datagrid-itemclick.xml")
@LoadDataBeforeShow
public class DataGridItemClickSample extends ScreenFragment {
    @Inject
    private DataGrid<Customer> customersDataGrid;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        customersDataGrid.setItemClickAction(new BaseAction("itemClickAction")
                .withHandler(actionPerformedEvent -> {
                    Customer customer = customersDataGrid.getSingleSelected();
                    if (customer != null) {
                        notifications.create()
                                .withCaption("Item clicked for: " + metadataTools.getInstanceName(customer))
                                .show();
                    }
                }));

        customersDataGrid.setEnterPressAction(new BaseAction("enterPressAction")
                .withHandler(actionPerformedEvent -> {
                    Customer customer = customersDataGrid.getSingleSelected();
                    if (customer != null) {
                        notifications.create()
                                .withCaption("Enter pressed for: " + metadataTools.getInstanceName(customer))
                                .show();
                    }
                }));
    }
}
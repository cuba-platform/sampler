package com.haulmont.sampler.web.ui.components.datagrid.large;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class DataGridLargeDataSetFrame extends AbstractFrame {
    private static final int COUNT = 1000;

    @Inject
    private CollectionDatasource<Customer, UUID> customersDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Generating test data
        customersDs.refresh();
        for (int i = 0; i < COUNT; i++) {
            Customer customer = metadata.create(Customer.class);
            customer.setName("First Name " + i);
            customer.setLastName("Last Name " + i);

            customersDs.includeItem(customer);
        }
    }
}

package com.haulmont.sampler.web.ui.components.datagrid.large;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("datagrid-large-dataset")
@UiDescriptor("datagrid-large-dataset.xml")
public class DataGridLargeDataSetSample extends ScreenFragment {
    private static final int COUNT = 1000;

    @Inject
    private CollectionContainer<Customer> customersDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Customer> items = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            Customer customer = metadata.create(Customer.class);
            customer.setName("First Name " + i);
            customer.setLastName("Last Name " + i);

            items.add(customer);

        }
        customersDc.setItems(items);
    }
}

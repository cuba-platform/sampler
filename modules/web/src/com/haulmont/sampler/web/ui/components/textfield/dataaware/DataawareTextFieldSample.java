package com.haulmont.sampler.web.ui.components.textfield.dataaware;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("dataaware-textfield")
@UiDescriptor("dataaware-textfield.xml")
public class DataawareTextFieldSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Customer> customersDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customer.setName("John");
        customersDc.setItem(customer);
    }
}
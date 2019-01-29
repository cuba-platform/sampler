package com.haulmont.sampler.web.ui.components.checkboxgroup.simple;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("checkboxgroup-simple")
@UiDescriptor("checkboxgroup-simple.xml")
public class CheckBoxGroupSimpleSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Customer> customerDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customerDc.setItem(customer);
    }
}

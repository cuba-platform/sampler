package com.haulmont.sampler.web.ui.components.form.column;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;

@UiController("form-column")
@UiDescriptor("form-column.xml")
public class FormColumnSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Customer> customerDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    private void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customer.setName("John");
        customer.setLastName("Doe");
        customer.setAge(40);
        customer.setActive(true);
        customer.setGrade(CustomerGrade.STANDARD);
        customerDc.setItem(customer);
    }
}
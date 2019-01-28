package com.haulmont.sampler.web.ui.components.fieldgroup.column;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;
import java.util.Map;

public class ColumnFieldGroupSample extends AbstractFrame {

    @Inject
    private Datasource<Customer> customerDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customer.setName("John");
        customer.setLastName("Doe");
        customer.setAge(40);
        customer.setActive(true);
        customer.setGrade(CustomerGrade.STANDARD);
        customerDs.setItem(customer);
    }
}
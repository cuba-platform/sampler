package com.haulmont.sampler.web.ui.entities.customer;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

@UiController("sampler$Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}
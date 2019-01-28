package com.haulmont.sampler.web.ui.entities.customer;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

@UiController("sampler$Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}
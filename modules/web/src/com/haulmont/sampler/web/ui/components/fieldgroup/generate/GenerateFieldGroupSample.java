package com.haulmont.sampler.web.ui.components.fieldgroup.generate;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.Map;

public class GenerateFieldGroupSample extends AbstractFrame {

    @Inject
    private FieldGroup customerFields;
    @Inject
    private Datasource<Customer> customerDs;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customer.setName("John");
        customer.setLastName("Doe");
        customerDs.setItem(customer);

        FieldGroup.FieldConfig config = customerFields.getFieldNN("active");
        //noinspection unchecked
        LookupField<Boolean> lookupField = uiComponents.create(LookupField.class);
        lookupField.setDatasource(customerDs, config.getProperty());

        Map<String, Boolean> options = new LinkedHashMap<>();
        options.put("Yes", Boolean.TRUE);
        options.put("No", Boolean.FALSE);
        lookupField.setOptionsMap(options);

        lookupField.setWidth("100%");
        config.setComponent(lookupField);
    }
}
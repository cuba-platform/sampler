package com.haulmont.sampler.web.ui.components.lookupfield.optionsstyleprovider;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;
import java.util.Map;

public class OptionsStyleProviderLookupFieldFrame extends AbstractFrame {

    @Inject
    private LookupField lookupField;

    @Inject
    private Metadata metadata;

    @Inject
    private Datasource<Customer> customerDs;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Customer order = metadata.create(Customer.class);
        customerDs.setItem(order);

        lookupField.setOptionsStyleProvider((component, item) -> {
            if (item != null) {
                CustomerGrade grade = (CustomerGrade) item;
                switch (grade) {
                    case HIGH:
                        return "high-grade";
                    case PREMIUM:
                        return "premium-grade";
                    case STANDARD:
                        return "standard-grade";
                }
            }
            return "";
        });
    }
}
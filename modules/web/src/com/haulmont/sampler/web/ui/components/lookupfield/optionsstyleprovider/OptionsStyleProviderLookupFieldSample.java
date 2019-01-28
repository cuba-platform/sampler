package com.haulmont.sampler.web.ui.components.lookupfield.optionsstyleprovider;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.Install;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;

@UiController("options-style-provider-lookupfield")
@UiDescriptor("options-style-provider-lookupfield.xml")
public class OptionsStyleProviderLookupFieldSample extends AbstractFrame {

    @Inject
    private LookupField<CustomerGrade> lookupField;

    @Inject
    private Metadata metadata;

    @Inject
    private InstanceContainer<Customer> customerDc;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Customer order = metadata.create(Customer.class);
        customerDc.setItem(order);
    }

    @Install(to = "lookupField", subject = "optionStyleProvider")
    protected String lookupFieldOptionStyleProvider(CustomerGrade grade) {
        if (grade != null) {
            switch (grade) {
                case HIGH:
                    return "high-grade";
                case PREMIUM:
                    return "premium-grade";
                case STANDARD:
                    return "standard-grade";
            }
        }
        return null;
    }


}
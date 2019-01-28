package com.haulmont.sampler.web.ui.components.suggestionfield.optionsstyleprovider;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("optionsstyleprovider-suggestionfield")
@UiDescriptor("optionsstyleprovider-suggestionfield.xml")
@LoadDataBeforeShow
public class OptionsStyleProviderSuggestionFieldSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);
    }

    @Install(to = "suggestionField", subject = "optionStyleProvider")
    protected String suggestionFieldOptionStyleProvider(Customer customer) {
        switch (customer.getGrade()) {
            case HIGH:
                return "high-grade";
            case PREMIUM:
                return "premium-grade";
            case STANDARD:
                return "standard-grade";
            default:
                return "standard-grade";
        }
    }
}
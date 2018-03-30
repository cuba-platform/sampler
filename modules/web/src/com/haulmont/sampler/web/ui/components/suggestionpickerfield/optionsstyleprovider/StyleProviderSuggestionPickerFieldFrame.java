package com.haulmont.sampler.web.ui.components.suggestionpickerfield.optionsstyleprovider;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.SuggestionPickerField;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Map;

public class StyleProviderSuggestionPickerFieldFrame extends AbstractFrame {

    @Inject
    private SuggestionPickerField suggestionPickerField;

    @Inject
    private Datasource<Order> orderDs;

    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDs.setItem(order);

        suggestionPickerField.setOptionsStyleProvider((component, item) -> {
            Customer customer = (Customer) item;
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
        });
    }
}
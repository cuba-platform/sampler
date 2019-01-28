package com.haulmont.sampler.web.ui.components.suggestionpickerfield.dataaware;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.SuggestionPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@UiController("dataaware-suggestion-picker-field")
@UiDescriptor("dataaware-suggestion-picker-field.xml")
public class DataawareSuggestionPickerFieldSample extends ScreenFragment {

    @Inject
    private SuggestionPickerField<Customer> suggestionPickerField;

    @Inject
    private TextField<Integer> delayTextField;
    @Inject
    private TextField<Integer> stringLengthTextField;
    @Inject
    private TextField<Integer> limitTextField;

    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private CollectionContainer<Customer> customersDc;
    @Inject
    private CollectionLoader<Customer> customersLoader;

    @Inject
    private Metadata metadata;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);

        customersLoader.load();
        List<Customer> customers = new ArrayList<>(customersDc.getItems());
        suggestionPickerField.setSearchExecutor((searchString, searchParams) ->
                customers.stream()
                        .filter(customer ->
                                StringUtils.containsIgnoreCase(metadataTools.getInstanceName(customer), searchString))
                        .collect(Collectors.toList()));

        delayTextField.setValue(300);
        stringLengthTextField.setValue(2);
        limitTextField.setValue(10);
    }

    @Subscribe("delayTextField")
    protected void onDelayTextFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        int delay = event.getValue() != null ? event.getValue() : 0;
        suggestionPickerField.setAsyncSearchDelayMs(delay);
    }

    @Subscribe("stringLengthTextField")
    protected void onStringLengthTextFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        int length = event.getValue() != null ? event.getValue() : 0;
        suggestionPickerField.setMinSearchStringLength(length);
    }

    @Subscribe("limitTextField")
    protected void onLimitTextFieldValueChange(HasValue.ValueChangeEvent<Integer> event) {
        int limit = event.getValue() != null ? event.getValue() : 0;
        suggestionPickerField.setSuggestionsLimit(limit);
    }
}
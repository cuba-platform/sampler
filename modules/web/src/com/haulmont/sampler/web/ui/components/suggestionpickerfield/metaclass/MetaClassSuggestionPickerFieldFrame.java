package com.haulmont.sampler.web.ui.components.suggestionpickerfield.metaclass;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.SuggestionPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class MetaClassSuggestionPickerFieldFrame extends AbstractFrame {

    @Inject
    private SuggestionPickerField suggestionPickerField;

    @Inject
    private TextField delayTextField;
    @Inject
    private TextField stringLengthTextField;
    @Inject
    private TextField limitTextField;

    @Inject
    private CollectionDatasource<Customer, UUID> customersDs;

    @Override
    public void init(Map<String, Object> params) {
        initTuningPanel();

        // obtain and collect data to use it later
        customersDs.refresh();

        List<Customer> customers = new ArrayList<>(customersDs.getItems());
        suggestionPickerField.setSearchExecutor((searchString, searchParams) ->
                customers.stream()
                        .filter(customer -> customer.getName().contains(searchString))
                        .collect(Collectors.toList()));
    }

    // init TextFields for SuggestionPickerField tuning
    private void initTuningPanel() {
        delayTextField.addValueChangeListener(e -> {
            int delay = e.getValue() != null ? Integer.parseInt((String) e.getValue()) : 0;
            suggestionPickerField.setAsyncSearchDelayMs(delay);
        });
        delayTextField.setValue(300);


        stringLengthTextField.addValueChangeListener(e -> {
            int length = e.getValue() != null ? Integer.parseInt((String) e.getValue()) : 0;
            suggestionPickerField.setMinSearchStringLength(length);
        });
        stringLengthTextField.setValue(2);


        limitTextField.addValueChangeListener(e -> {
            int limit = e.getValue() != null ? Integer.parseInt((String) e.getValue()) : 0;
            suggestionPickerField.setSuggestionsLimit(limit);
        });
        limitTextField.setValue(10);
    }
}
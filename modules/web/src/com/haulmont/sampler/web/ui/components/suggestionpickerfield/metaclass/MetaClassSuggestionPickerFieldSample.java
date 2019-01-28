package com.haulmont.sampler.web.ui.components.suggestionpickerfield.metaclass;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.SuggestionPickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@UiController("metaclass-suggestion-picker-field")
@UiDescriptor("metaclass-suggestion-picker-field.xml")
public class MetaClassSuggestionPickerFieldSample extends ScreenFragment {

    @Inject
    private SuggestionPickerField suggestionPickerField;

    @Inject
    private TextField<Integer> delayTextField;
    @Inject
    private TextField<Integer> stringLengthTextField;
    @Inject
    private TextField<Integer> limitTextField;

    @Inject
    private CollectionContainer<Customer> customersDc;
    @Inject
    private CollectionLoader<Customer> customersLoader;

    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
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
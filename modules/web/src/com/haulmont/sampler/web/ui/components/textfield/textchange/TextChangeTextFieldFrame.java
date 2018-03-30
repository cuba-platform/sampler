package com.haulmont.sampler.web.ui.components.textfield.textchange;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class TextChangeTextFieldFrame extends AbstractLookup {
    @Inject
    private TextField textField;

    @Override
    public void init(Map<String, Object> params) {
        textField.addTextChangeListener(event ->
                showNotification("Text Changed: " + event.getText()));
    }
}
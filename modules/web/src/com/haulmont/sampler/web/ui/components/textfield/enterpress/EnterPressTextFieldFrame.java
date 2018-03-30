package com.haulmont.sampler.web.ui.components.textfield.enterpress;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class EnterPressTextFieldFrame extends AbstractLookup {
    @Inject
    private TextField textField;

    @Override
    public void init(Map<String, Object> params) {
        textField.addEnterPressListener(event ->
                showNotification("Enter Pressed: " + event.getSource().getValue()));
    }
}
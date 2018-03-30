package com.haulmont.sampler.web.ui.components.textfield.validator;

import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;

public class ValidatorTextFieldFrame extends AbstractFrame {

    @Inject
    private TextField integerField;

    public void validate() {
        try {
            integerField.validate();
            showNotification("Validation successful", NotificationType.HUMANIZED);
        } catch (ValidationException e) {
            showNotification("Validation failed: " + e.getMessage(), NotificationType.ERROR);
        }
    }
}
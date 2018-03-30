package com.haulmont.sampler.web.ui.components.checkbox.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;

import javax.inject.Inject;
import java.util.Map;

public class SimpleCheckboxFrame extends AbstractFrame {

    @Inject
    private CheckBox carField;

    @Override
    public void init(Map<String, Object> params) {
        carField.setValue(true);
        carField.addValueChangeListener(e -> {
            if (Boolean.TRUE.equals(e.getValue())) {
                showNotification("I have a car", NotificationType.HUMANIZED);
            } else {
                showNotification("I don't have a car", NotificationType.HUMANIZED);
            }
        });
    }
}
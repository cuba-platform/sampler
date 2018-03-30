package com.haulmont.sampler.web.ui.components.colorpicker.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.ColorPicker;

import javax.inject.Inject;

public class SimpleColorPickerFrame extends AbstractFrame {

    @Inject
    private ColorPicker colorPicker;

    public void showValue() {
        String value = colorPicker.getValue();
        showNotification(value == null ? "null" : value, NotificationType.HUMANIZED);
    }
}

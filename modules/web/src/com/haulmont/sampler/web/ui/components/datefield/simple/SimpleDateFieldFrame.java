package com.haulmont.sampler.web.ui.components.datefield.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DateField;

import javax.inject.Inject;
import java.util.Date;

public class SimpleDateFieldFrame extends AbstractFrame {

    @Inject
    private DateField dateField;

    public void showValue() {
        Date value = dateField.getValue();
        showNotification(value == null ? "null" : value.toString(), NotificationType.HUMANIZED);
    }
}

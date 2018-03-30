package com.haulmont.sampler.web.ui.components.datepicker.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DatePicker;

import javax.inject.Inject;
import java.util.Date;

public class SimpleDatePickerFrame extends AbstractFrame {

    @Inject
    private DatePicker datePicker;

    public void showValue() {
        Date value = datePicker.getValue();
        showNotification(value == null ? "null" : value.toString(), NotificationType.HUMANIZED);
    }
}

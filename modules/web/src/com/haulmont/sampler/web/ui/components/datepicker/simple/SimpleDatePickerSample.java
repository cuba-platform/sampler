package com.haulmont.sampler.web.ui.components.datepicker.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DatePicker;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Date;

@UiController("simple-datepicker")
@UiDescriptor("simple-datepicker.xml")
public class SimpleDatePickerSample extends ScreenFragment {

    @Inject
    private DatePicker<Date> datePicker;

    @Inject
    private Notifications notifications;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(String.valueOf(datePicker.getValue()))
                .show();
    }
}

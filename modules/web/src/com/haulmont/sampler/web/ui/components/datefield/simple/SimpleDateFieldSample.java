package com.haulmont.sampler.web.ui.components.datefield.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Date;

@UiController("simple-datefield")
@UiDescriptor("simple-datefield.xml")
public class SimpleDateFieldSample extends ScreenFragment {

    @Inject
    private DateField<Date> dateField;

    @Inject
    private Notifications notifications;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(String.valueOf(dateField.getValue()))
                .show();
    }
}

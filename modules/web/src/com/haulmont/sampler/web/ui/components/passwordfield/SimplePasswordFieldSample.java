package com.haulmont.sampler.web.ui.components.passwordfield;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PasswordField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-passwordfield")
@UiDescriptor("simple-passwordfield.xml")
public class SimplePasswordFieldSample extends ScreenFragment {

    @Inject
    private PasswordField passwordField;
    @Inject
    private Notifications notifications;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(passwordField.getValue())
                .show();
    }
}
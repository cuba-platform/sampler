package com.haulmont.sampler.web.ui.components.textfield.enterpress;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.TextInputField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("enterpress-textfield")
@UiDescriptor("enterpress-textfield.xml")
public class EnterPressTextFieldSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("textField")
    protected void onTextFieldEnterPress(TextInputField.EnterPressEvent event) {
        notifications.create()
                .withCaption("Enter Pressed: " + event.getSource().getValue())
                .show();
    }
}
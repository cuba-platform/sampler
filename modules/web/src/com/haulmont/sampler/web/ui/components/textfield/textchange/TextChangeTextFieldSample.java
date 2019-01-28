package com.haulmont.sampler.web.ui.components.textfield.textchange;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.TextInputField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("textchange-textfield")
@UiDescriptor("textchange-textfield.xml")
public class TextChangeTextFieldSample extends ScreenFragment {
    @Inject
    private Notifications notifications;

    @Subscribe("textField")
    protected void onTextFieldTextChange(TextInputField.TextChangeEvent event) {
        notifications.create()
                .withCaption("Text Changed: " + event.getText())
                .show();
    }
}
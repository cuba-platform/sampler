package com.haulmont.sampler.web.ui.components.textfield.validator;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("validator-textfield")
@UiDescriptor("validator-textfield.xml")
public class ValidatorTextFieldSample extends ScreenFragment {

    @Inject
    private TextField<Integer> integerField;
    @Inject
    private Notifications notifications;

    @Subscribe("validate")
    protected void onValidateClick(Button.ClickEvent event) {
        try {
            integerField.validate();
            notifications.create()
                    .withCaption("Validation successful")
                    .show();
        } catch (ValidationException e) {
            notifications.create()
                    .withCaption("Validation failed: " + e.getMessage())
                    .withType(NotificationType.ERROR)
                    .show();
        }
    }
}
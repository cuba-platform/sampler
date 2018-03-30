package com.haulmont.sampler.web.ui.components.passwordfield;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.PasswordField;

import javax.inject.Inject;

public class SimplePasswordFieldFrame extends AbstractFrame {

    @Inject
    private PasswordField passwordField;

    public void showPassword() {
        showNotification(passwordField.getValue(), NotificationType.HUMANIZED);
    }
}
package com.haulmont.sampler.web.ui.components.button.action;

import com.haulmont.cuba.gui.components.AbstractFrame;

public class ActionButtonFrame extends AbstractFrame {

    public void someAction() {
        showNotification("Action performed", NotificationType.HUMANIZED);
    }
}
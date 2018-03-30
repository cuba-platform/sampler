package com.haulmont.sampler.web.ui.components.button.linkbutton;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Component;

public class LinkButtonFrame extends AbstractFrame {

    public void sayHello() {
        showNotification("Hello, world!", NotificationType.HUMANIZED);
    }

    public void save(Component source) {
        showNotification("Save called from " + source.getId(), NotificationType.HUMANIZED);
    }
}
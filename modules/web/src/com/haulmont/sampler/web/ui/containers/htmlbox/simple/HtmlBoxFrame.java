package com.haulmont.sampler.web.ui.containers.htmlbox.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;

public class HtmlBoxFrame extends AbstractFrame {
    public void click() {
        showNotification("Button clicked", NotificationType.HUMANIZED);
    }
}
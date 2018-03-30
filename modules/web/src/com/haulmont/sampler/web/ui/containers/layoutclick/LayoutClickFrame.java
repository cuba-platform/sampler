package com.haulmont.sampler.web.ui.containers.layoutclick;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.VBoxLayout;

import javax.inject.Inject;
import java.util.Map;

public class LayoutClickFrame extends AbstractFrame {
    @Inject
    private VBoxLayout boxLayout;

    @Override
    public void init(Map<String, Object> params) {
        boxLayout.addLayoutClickListener(event ->
                showNotification(getMessage(event.getMouseEventDetails()), NotificationType.HUMANIZED_HTML));
    }

    private String getMessage(MouseEventDetails mouseEventDetails) {
        return "Button: " + mouseEventDetails.getButton()
                + "<br>Client X: " + mouseEventDetails.getClientX()
                + "<br>Client Y" + mouseEventDetails.getClientY();
    }
}
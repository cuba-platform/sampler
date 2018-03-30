package com.haulmont.sampler.web.ui.containers.layoutshortcut;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.GroupBoxLayout;

import javax.inject.Inject;
import java.util.Map;

public class LayoutShortcutFrame extends AbstractFrame {

    @Inject
    private GroupBoxLayout groupBox;

    @Override
    public void init(Map<String, Object> params) {
        groupBox.addShortcutAction(new ShortcutAction("SHIFT-A", shortcutTriggeredEvent ->
                showNotification(getMessage(shortcutTriggeredEvent), NotificationType.HUMANIZED_HTML)));
    }

    private String getMessage(ShortcutTriggeredEvent shortcutEvent) {
        return "Source id: " + shortcutEvent.getSource().getId()
                + "<br>Target id: " + shortcutEvent.getTarget().getId();
    }
}
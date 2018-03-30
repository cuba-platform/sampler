package com.haulmont.sampler.web.ui.dialogsandnotifications.notification;

import com.haulmont.cuba.gui.components.AbstractFrame;

public class NotificationsSampleFrame extends AbstractFrame {

    public void tray() {
        showNotification("Tray notification", NotificationType.TRAY);
    }

    public void humanized() {
        showNotification("Humanized notification", "with description", NotificationType.HUMANIZED);
    }

    public void warning() {
        showNotification("<i>Warning notification</i>", NotificationType.WARNING_HTML);
    }

    public void error() {
        showNotification("<code>Error notification</code>", "<u>with description</u>", NotificationType.ERROR_HTML);
    }
}
package com.haulmont.sampler.web.ui.dialogsandnotifications.notification.type;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("notification-type")
@UiDescriptor("notification-type.xml")
public class NotificationTypeSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("tray")
    protected void onTrayClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Tray notification")
                .withType(NotificationType.TRAY)
                .show();
    }

    @Subscribe("humanized")
    protected void onHumanizedClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Humanized notification")
                .withDescription("with description")
                .withType(NotificationType.HUMANIZED)
                .show();
    }

    @Subscribe("warning")
    protected void onWarningClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("<i>Warning notification</i>")
                .withType(NotificationType.WARNING)
                .withContentMode(ContentMode.HTML)
                .show();
    }

    @Subscribe("error")
    protected void onErrorClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("<code>Error notification</code>")
                .withDescription("<u>with description</u>")
                .withType(NotificationType.ERROR)
                .withContentMode(ContentMode.HTML)
                .show();
    }
}
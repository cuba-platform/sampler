package com.haulmont.sampler.web.ui.dialogsandnotifications.notification.position;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.Position;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("notification-position")
@UiDescriptor("notification-position.xml")
public class NotificationPositionSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("defaultBtn")
    protected void onDefaultBtnClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Default")
                .withPosition(Position.DEFAULT)
                .show();
    }

    @Subscribe("topLeft")
    private void onTopLeftClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Top Left")
                .withPosition(Position.TOP_LEFT)
                .show();
    }

    @Subscribe("topCenter")
    private void onTopCenterClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Top Center")
                .withPosition(Position.TOP_CENTER)
                .show();
    }

    @Subscribe("topRight")
    private void onTopRightClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Top Right")
                .withPosition(Position.TOP_RIGHT)
                .show();
    }

    @Subscribe("middleLeft")
    private void onMiddleLeftClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Middle Left")
                .withPosition(Position.MIDDLE_LEFT)
                .show();
    }

    @Subscribe("middleCenter")
    private void onMiddleCenterClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Middle Center")
                .withPosition(Position.MIDDLE_CENTER)
                .show();
    }

    @Subscribe("middleRight")
    private void onMiddleRightClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Middle Right")
                .withPosition(Position.MIDDLE_RIGHT)
                .show();
    }

    @Subscribe("bottomLeft")
    private void onBottomLeftClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Bottom Left")
                .withPosition(Position.BOTTOM_LEFT)
                .show();
    }

    @Subscribe("bottomCenter")
    private void onBottomCenterClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Bottom Center")
                .withPosition(Position.BOTTOM_CENTER)
                .show();
    }

    @Subscribe("bottomRight")
    private void onBottomRightClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Position: Bottom Right")
                .withPosition(Position.BOTTOM_RIGHT)
                .show();
    }
}
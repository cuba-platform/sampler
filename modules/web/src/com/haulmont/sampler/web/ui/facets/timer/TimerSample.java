package com.haulmont.sampler.web.ui.facets.timer;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("timer")
@UiDescriptor("timer.xml")
public class TimerSample extends ScreenFragment {

    @Inject
    protected Timer timer;

    @Inject
    protected Label<String> statusLabel;

    @Inject
    protected Notifications notifications;

    protected int seconds = 0;

    @Subscribe("startTimer")
    protected void onStartTimerClick(Button.ClickEvent event) {
        timer.start();
        statusLabel.setValue("Timer started");
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Timer started")
                .show();
    }

    @Subscribe("stopTimer")
    protected void onStopTimerClick(Button.ClickEvent event) {
        timer.stop();
        seconds = 0;
        statusLabel.setValue("Timer stopped");
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Timer stopped")
                .show();
    }

    @Subscribe("timer")
    protected void onTimerTick(Timer.TimerActionEvent event) {
        seconds += event.getSource().getDelay() / 1000;
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Timer tick")
                .withDescription(seconds + " seconds passed")
                .show();
    }
}
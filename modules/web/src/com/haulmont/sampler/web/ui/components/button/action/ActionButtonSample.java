package com.haulmont.sampler.web.ui.components.button.action;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("action-button")
@UiDescriptor("action-button.xml")
public class ActionButtonSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("someAction")
    protected void onSomeActionActionPerformed(Action.ActionPerformedEvent event) {
        notifications.create()
                .withCaption("Action performed")
                .show();
    }
}
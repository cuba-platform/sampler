package com.haulmont.sampler.web.ui.components.button.programmaticaction;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("programmatic-action-button")
@UiDescriptor("programmatic-action-button.xml")
public class ProgrammaticActionButtonSample extends ScreenFragment {

    @Inject
    private Button button;

    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        button.setAction(new BaseAction("theAction")
                .withCaption("Click Me!")
                .withHandler(actionPerformedEvent ->
                        notifications.create()
                                .withCaption("Action performed")
                                .show()));
    }
}
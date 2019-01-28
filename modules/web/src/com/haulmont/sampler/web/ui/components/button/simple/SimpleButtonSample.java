package com.haulmont.sampler.web.ui.components.button.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-button")
@UiDescriptor("simple-button.xml")
public class SimpleButtonSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("helloButton")
    protected void onHelloButtonClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption("Hello, world!")
                .show();
    }

    @Subscribe("saveButton1")
    protected void onSaveButton1Click(Button.ClickEvent event) {
        save(event.getSource().getId());
    }

    @Subscribe("saveButton2")
    protected void onSaveButton2Click(Button.ClickEvent event) {
        save(event.getSource().getId());
    }

    public void save(String id) {
        notifications.create()
                .withCaption("Save called from " + id)
                .show();
    }
}
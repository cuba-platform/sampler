package com.haulmont.sampler.web.ui.components.checkbox.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-checkbox")
@UiDescriptor("simple-checkbox.xml")
public class SimpleCheckboxSample extends ScreenFragment {

    @Inject
    private CheckBox carField;

    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        carField.setValue(true);
        carField.addValueChangeListener(e ->
                notifications.create()
                        .withCaption(Boolean.TRUE.equals(e.getValue())
                                ? "I have a car"
                                : "I don't have a car")
                        .show());
    }
}
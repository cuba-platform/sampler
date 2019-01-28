package com.haulmont.sampler.web.ui.components.colorpicker.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ColorPicker;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-colorpicker")
@UiDescriptor("simple-colorpicker.xml")
public class SimpleColorPickerSample extends ScreenFragment {

    @Inject
    private ColorPicker colorPicker;
    @Inject
    private Notifications notifications;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(String.valueOf(colorPicker.getValue()))
                .show();
    }
}

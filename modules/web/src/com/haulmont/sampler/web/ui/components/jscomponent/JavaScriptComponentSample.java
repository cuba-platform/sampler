package com.haulmont.sampler.web.ui.components.jscomponent;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.web.gui.components.JavaScriptComponent;

import javax.inject.Inject;
import java.io.Serializable;

@UiController("java-script-component")
@UiDescriptor("java-script-component.xml")
public class JavaScriptComponentSample extends ScreenFragment {
    @Inject
    private JavaScriptComponent timePicker;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        TimePickerState state = new TimePickerState();
        state.now = "12:35:57";
        state.showSeconds = true;
        state.twentyFour = true;

        timePicker.addFunction("onBeforeShow", callbackEvent ->
                notifications.create()
                        .withCaption("Before Show Event")
                        .withPosition(Notifications.Position.MIDDLE_RIGHT)
                        .show());

        timePicker.addFunction("onShow", callbackEvent ->
                notifications.create()
                        .withCaption("Show Event")
                        .show());

        timePicker.setState(state);
    }

    @Subscribe("showValueBtn")
    protected void onShowValueBtnClick(Button.ClickEvent event) {
        timePicker.callFunction("showValue");
    }

    public class TimePickerState implements Serializable {
        public String now;             // hh:mm 24 hour format only, defaults to current time
        public boolean twentyFour;     // Display 24 hour format, defaults to false
        public boolean showSeconds;    // Whether or not to show seconds
    }
}

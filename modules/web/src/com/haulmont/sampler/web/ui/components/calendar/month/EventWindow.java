package com.haulmont.sampler.web.ui.components.calendar.month;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Map;

@UiController("event-window")
@UiDescriptor("event-window.xml")
public class EventWindow extends Screen {
    @Inject
    private Label<String> startDateValue;
    @Inject
    private Label<String> endDateValue;
    @Inject
    private Label<String> captionValue;
    @Inject
    private Label<String> descriptionValue;

    @Subscribe
    protected void onInit(InitEvent event) {
        MapScreenOptions options = (MapScreenOptions) event.getOptions();
        Map<String, Object> params = options.getParams();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        startDateValue.setValue(simpleDateFormat.format(params.get("startDate")));
        endDateValue.setValue(simpleDateFormat.format(params.get("endDate")));
        captionValue.setValue((String) params.get("caption"));
        descriptionValue.setValue((String) params.get("description"));
    }

    @Subscribe("closeButton")
    protected void onCloseButtonClick(Button.ClickEvent event) {
        close(WINDOW_CLOSE_ACTION);
    }
}
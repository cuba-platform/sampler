package com.haulmont.sampler.web.ui.components.calendar.month;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");

    public void setStartDateValue(Date startDate) {
        startDateValue.setValue(simpleDateFormat.format(startDate));
    }

    public void setEndDateValue(Date endDate) {
        endDateValue.setValue(simpleDateFormat.format(endDate));
    }

    public void setCaptionValue(String caption) {
        captionValue.setValue(caption);
    }

    public void setDescriptionValue(String description) {
        descriptionValue.setValue(description);
    }

    @Subscribe("closeButton")
    protected void onCloseButtonClick(Button.ClickEvent event) {
        close(WINDOW_CLOSE_ACTION);
    }
}
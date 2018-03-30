package com.haulmont.sampler.web.ui.components.calendar.month;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Label;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Map;

public class EventWindow extends AbstractWindow {
    @Inject
    private Label startDateValue;
    @Inject
    private Label endDateValue;
    @Inject
    private Label captionValue;
    @Inject
    private Label descriptionValue;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        startDateValue.setValue(simpleDateFormat.format(params.get("startDate")));
        endDateValue.setValue(simpleDateFormat.format(params.get("endDate")));
        captionValue.setValue(params.get("caption"));
        descriptionValue.setValue(params.get("description"));
    }

    public void windowClose() {
        close(CLOSE_ACTION_ID);
    }
}
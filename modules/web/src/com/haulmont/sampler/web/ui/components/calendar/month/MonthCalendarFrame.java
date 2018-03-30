package com.haulmont.sampler.web.ui.components.calendar.month;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.CalendarEvent;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class MonthCalendarFrame extends AbstractFrame {
    @Inject
    private CollectionDatasource<CalendarEvent, UUID> calendarEventsDs;

    @Inject
    private Calendar calendar;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        calendar.addEventClickListener(e ->
                openWindow("event-window", WindowManager.OpenType.DIALOG, ParamsMap.of(
                        "startDate", e.getCalendarEvent().getStart(),
                        "endDate", e.getCalendarEvent().getEnd(),
                        "caption", e.getCalendarEvent().getCaption(),
                        "description", e.getCalendarEvent().getDescription())
                ));
    }
}
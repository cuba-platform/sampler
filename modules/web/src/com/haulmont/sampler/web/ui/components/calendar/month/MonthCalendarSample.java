package com.haulmont.sampler.web.ui.components.calendar.month;

import com.google.common.collect.ImmutableMap;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("month-calendar")
@UiDescriptor("month-calendar.xml")
@LoadDataBeforeShow
public class MonthCalendarSample extends ScreenFragment {
    @Inject
    private Calendar calendar;

    @Inject
    private Screens screens;

    @Subscribe("calendar")
    protected void onCalendarCalendarEventClick(Calendar.CalendarEventClickEvent event) {
        ScreenOptions screenOptions = new MapScreenOptions(ImmutableMap.of(
                "startDate", event.getCalendarEvent().getStart(),
                "endDate", event.getCalendarEvent().getEnd(),
                "caption", event.getCalendarEvent().getCaption(),
                "description", event.getCalendarEvent().getDescription())
        );

        screens.create("event-window", OpenMode.DIALOG, screenOptions)
                .show();
    }
}
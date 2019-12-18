package com.haulmont.sampler.web.ui.components.calendar.month;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.components.calendar.CalendarEvent;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.Date;

@UiController("month-calendar")
@UiDescriptor("month-calendar.xml")
@LoadDataBeforeShow
public class MonthCalendarSample extends ScreenFragment {

    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe("calendar")
    protected void onCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<Date> event) {
        EventWindow screen = screenBuilders.screen(this)
                .withScreenClass(EventWindow.class)
                .withLaunchMode(OpenMode.DIALOG)
                .build();

        CalendarEvent<Date> calendarEvent = event.getCalendarEvent();
        screen.setStartDateValue(calendarEvent.getStart());
        screen.setEndDateValue(calendarEvent.getEnd());
        screen.setCaptionValue(calendarEvent.getCaption());
        screen.setDescriptionValue(calendarEvent.getDescription());

        screen.show();
    }
}
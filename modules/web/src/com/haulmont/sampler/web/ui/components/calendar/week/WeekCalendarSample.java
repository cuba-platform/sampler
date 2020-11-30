package com.haulmont.sampler.web.ui.components.calendar.week;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.calendar.SimpleCalendarEvent;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.CalendarEventStyle;

import javax.inject.Inject;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@UiController("week-calendar")
@UiDescriptor("week-calendar.xml")
public class WeekCalendarSample extends ScreenFragment {
    @Inject
    private Calendar<Date> calendar;
    @Inject
    private CheckBox isAllDay;
    @Inject
    private DateField<Date> startDateField;
    @Inject
    private DateField<Date> endDateField;
    @Inject
    private TextField<String> descriptionField;
    @Inject
    private TextField<String> captionField;
    @Inject
    private LookupField<CalendarEventStyle> styleNameField;

    @Inject
    private MessageBundle messageBundle;
    @Inject
    private TimeSource timeSource;

    @Subscribe
    protected void onInit(InitEvent event) {
        startDateField.setValue(timeSource.currentTimestamp());
        endDateField.setValue(timeSource.currentTimestamp());
        captionField.setValue(messageBundle.getMessage("caption"));
        descriptionField.setValue(messageBundle.getMessage("description"));

        styleNameField.setOptionsEnum(CalendarEventStyle.class);
        styleNameField.setValue(CalendarEventStyle.RED);

        generateEvents();
    }

    @Subscribe("addEvent")
    protected void onAddEventClick(Button.ClickEvent event) {
        generateEvent(
                captionField.getValue(),
                descriptionField.getValue(),
                startDateField.getValue(),
                endDateField.getValue(),
                isAllDay.getValue(),
                styleNameField.getValue().getId()
        );
    }

    private void generateEvents() {
        String[] captions = {"Training", "Development", "Design", "Weekend", "Party"};
        String[] descriptions = {
                "Student training",
                "Platform development",
                "UI development",
                "Weekend",
                "Party with friends"
        };

        generateEvent(captions[0], descriptions[0], "2016-10-17 09:00", "2016-10-17 14:00", false, "event-blue");
        generateEvent(captions[1], descriptions[1], "2016-10-17 15:00", "2016-10-17 18:00", false, "event-red");
        generateEvent(captions[2], descriptions[2], "2016-10-18 08:00", "2016-10-18 12:00", false, "event-yellow");
        generateEvent(captions[1], descriptions[1], "2016-10-18 13:00", "2016-10-18 18:00", false, "event-red");
        generateEvent(captions[0], descriptions[0], "2016-10-19 09:00", "2016-10-19 14:00", false, "event-blue");
        generateEvent(captions[1], descriptions[1], "2016-10-19 15:00", "2016-10-19 18:00", false, "event-red");
        generateEvent(captions[2], descriptions[2], "2016-10-20 08:00", "2016-10-20 12:00", false, "event-yellow");
        generateEvent(captions[1], descriptions[1], "2016-10-20 13:00", "2016-10-20 18:00", false, "event-red");
        generateEvent(captions[0], descriptions[0], "2016-10-21 09:00", "2016-10-21 14:00", false, "event-blue");
        generateEvent(captions[1], descriptions[1], "2016-10-21 15:00", "2016-10-21 18:00", false, "event-red");
        generateEvent(captions[2], descriptions[2], "2016-10-22 08:00", "2016-10-22 12:00", false, "event-yellow");
        generateEvent(captions[1], descriptions[1], "2016-10-22 13:00", "2016-10-22 18:00", false, "event-red");
        generateEvent(captions[3], descriptions[3], "2016-10-23 00:00", "2016-10-23 23:59", true, "event-green");
        generateEvent(captions[4], descriptions[4], "2016-10-20 19:00", "2016-10-21 07:59", false, "event-green");
    }

    private void generateEvent(String caption, String description, String start, String end,
                               boolean isAllDay, String stylename) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        generateEvent(
                caption,
                description,
                df.parse(start, new ParsePosition(0)),
                df.parse(end, new ParsePosition(0)),
                isAllDay,
                stylename
        );
    }

    private void generateEvent(String caption, String description, Date start, Date end,
                               boolean isAllDay, String stylename) {
        SimpleCalendarEvent<Date> calendarEvent = new SimpleCalendarEvent<>();
        calendarEvent.setCaption(caption);
        calendarEvent.setDescription(description);
        calendarEvent.setStart(start);
        calendarEvent.setEnd(end);
        calendarEvent.setAllDay(isAllDay);
        calendarEvent.setStyleName(stylename);

        calendar.getEventProvider().addEvent(calendarEvent);
    }
}
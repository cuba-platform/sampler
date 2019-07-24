package com.haulmont.sampler.web.ui.charts.charts.incrementalupdate.line;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.DateValue;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@UiController("update-line-chart")
@UiDescriptor("update-line-chart.xml")
@LoadDataBeforeShow
public class UpdateLineChartSample extends ScreenFragment {
    @Inject
    private CollectionContainer<DateValue> dateValueDc;
    @Inject
    private Metadata metadata;
    @Inject
    private Label<String> statusLabel;
    @Inject
    private Timer timer;

    @Inject
    private TimeSource timeSource;

    private Date lastDate;

    @Subscribe("timer")
    private void onTimerTick(Timer.TimerActionEvent event) {
        addData();
        removeData();
    }

    @Subscribe("startTimer")
    protected void onStartTimerClick(Button.ClickEvent event) {
        timer.start();
        statusLabel.setValue("Update enabled");
    }

    @Subscribe("stopTimer")
    protected void onStopTimerClick(Button.ClickEvent event) {
        timer.stop();
        statusLabel.setValue("Update disabled");
    }

    private void addData() {
        dateValueDc.getMutableItems().add(generateDateValue());
    }

    private void removeData() {
        List<DateValue> items = dateValueDc.getMutableItems();
        if (!items.isEmpty()) {
            items.remove(0);
        }
    }

    private DateValue generateDateValue() {
        DateValue dateValue = metadata.create(DateValue.class);
        lastDate = DateUtils.addDays(getLastDate(), 1);
        dateValue.setDate(lastDate);
        dateValue.setValue(RandomUtils.nextInt(0, 50));
        return dateValue;
    }

    private Date getLastDate() {
        if (lastDate == null) {
            List<DateValue> items = dateValueDc.getItems();
            if (items.isEmpty()) {
                return timeSource.currentTimestamp();
            } else {
                DateValue dateValue = items.get(items.size() - 1);
                return dateValue.getDate();
            }
        }
        return lastDate;
    }
}
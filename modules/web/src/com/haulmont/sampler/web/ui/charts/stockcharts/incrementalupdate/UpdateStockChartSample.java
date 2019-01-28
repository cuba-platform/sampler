package com.haulmont.sampler.web.ui.charts.stockcharts.incrementalupdate;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.Random;

@UiController("update-stock-chart")
@UiDescriptor("update-stock-chart.xml")
public class UpdateStockChartSample extends ScreenFragment {
    private static final int DAYS_COUNT = 20;

    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc1;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc2;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc3;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc4;
    @Inject
    private Label<String> statusLabel;

    @Inject
    private Metadata metadata;
    @Inject
    private TimeSource timeSource;
    @Inject
    private UiComponents uiComponents;

    private final Random random = new Random();
    private int lastIndex = DAYS_COUNT;
    private Date lastDate;
    private Timer timer;

    @Subscribe
    protected void onInit(InitEvent event) {
        generateData();

        lastDate = timeSource.currentTimestamp();

        timer = uiComponents.create(Timer.NAME);
        timer.setDelay(5000);
        timer.setRepeating(true);
        getHostScreen().getWindow().addTimer(timer);

        timer.addTimerActionListener(timerActionEvent -> {
            addData();
            removeData();
        });
        timer.start();
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
        addDateValueVolume(stockChartDc1, 40, 100, 1000, 500, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDc2, 100, 200, 1000, 600, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDc3, 100, 200, 1000, 600, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDc4, 100, 200, 100, 600, 1, lastDate, lastIndex);
        lastDate = DateUtils.addDays(lastDate, 1);
        lastIndex++;
    }

    private void removeData() {
        removeData(stockChartDc1);
        removeData(stockChartDc2);
        removeData(stockChartDc3);
        removeData(stockChartDc4);
    }

    private void removeData(CollectionContainer<DateValueVolume> container) {
        if (!container.getItems().isEmpty()) {
            container.getMutableItems().remove(0);
        }
    }

    private void generateData() {
        populateStockContainer(stockChartDc1, 40, 100, 1000, 500, 2);
        populateStockContainer(stockChartDc2, 100, 200, 1000, 600, 2);
        populateStockContainer(stockChartDc3, 100, 200, 1000, 600, 2);
        populateStockContainer(stockChartDc4, 100, 200, 100, 600, 1);
    }

    private void populateStockContainer(CollectionContainer<DateValueVolume> container,
                                        int valueX1, int valueX2, int volumeX1, int volumeX2, int volumeX3) {
        Date startDate = DateUtils.addDays(timeSource.currentTimestamp(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            addDateValueVolume(container, valueX1, valueX2, volumeX1, volumeX2, volumeX3,
                    DateUtils.addDays(startDate, i), i);
        }
    }

    private void addDateValueVolume(CollectionContainer<DateValueVolume> container,
                                    int valueX1, int valueX2, int volumeX1, int volumeX2, int volumeX3,
                                    Date date, int i) {
        Long value = Math.round(random.nextDouble() * (valueX1 + i)) + valueX2 + i;
        Long volume = Math.round(random.nextDouble() * (volumeX1 + i)) + volumeX2 + i + volumeX3;
        container.getMutableItems().add(dateValueVolume(date, value, volume));
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = metadata.create(DateValueVolume.class);
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }
}
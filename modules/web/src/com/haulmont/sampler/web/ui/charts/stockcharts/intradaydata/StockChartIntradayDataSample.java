package com.haulmont.sampler.web.ui.charts.stockcharts.intradaydata;

import com.haulmont.charts.gui.components.charts.StockChart;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.*;

@UiController("stockchart-intraday-data")
@UiDescriptor("stockchart-intraday-data.xml")
public class StockChartIntradayDataSample extends ScreenFragment {
    private static final int MINUTES_COUNT = 1000;

    @Inject
    private StockChart stockChart;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc;

    @Inject
    private Metadata metadata;
    @Inject
    private Notifications notifications;
    @Inject
    private TimeSource timeSource;

    private final Random random = new Random();

    @Subscribe
    protected void onInit(InitEvent event) {
        generateData();
        addEventListeners();
    }

    private void generateData() {
        List<DateValueVolume> items = new ArrayList<>();
        Date startDate = DateUtils.addDays(getZeroTime(timeSource.currentTimestamp()), -MINUTES_COUNT);
        for (int i = 0; i < MINUTES_COUNT; i++) {
            items.add(generateDateValueVolume(DateUtils.addMinutes(startDate, i), i));
        }
        stockChartDc.setItems(items);
    }

    private DateValueVolume generateDateValueVolume(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (40 + i)) + 100 + i;
        Long volume = Math.round(random.nextDouble() * 100000000);
        return dateValueVolume(date, value, volume);
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = metadata.create(DateValueVolume.class);
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }

    private Date getZeroTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    private void addEventListeners() {
        stockChart.addStockGraphItemClickListener(event ->
                showStockGraphItemEvent(event, "StockGraphItemClickEvent"));
        stockChart.addStockGraphItemRightClickListener(event ->
                showStockGraphItemEvent(event, "StockGraphItemRightClickEvent"));
    }

    private void showStockGraphItemEvent(StockChart.AbstractStockGraphItemEvent event, String message) {
        notifications.create()
                .withCaption(message)
                .withDescription("<Strong>Panel ID:</Strong> " + event.getPanelId() + "</br>"
                        + "<Strong>Graph ID:</Strong> " + event.getGraphId() + "</br>"
                        + "<Strong>Item Index:</Strong> " + event.getItemIndex() + "</br>"
                        + "<Strong>Item:</Strong> " + event.getEntity() + "</br>"
                        + "<Strong>X:</Strong> " + event.getX() + "</br>"
                        + "<Strong>Y:</Strong> " + event.getY() + "</br>"
                        + "<Strong>Absolute X:</Strong> " + event.getAbsoluteX() + "</br>"
                        + "<Strong>Absolute Y:</Strong> " + event.getAbsoluteY())
                .withType(NotificationType.TRAY)
                .withContentMode(ContentMode.HTML)
                .show();
    }
}
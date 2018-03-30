package com.haulmont.sampler.web.ui.charts.stockcharts.stockevents;

import com.haulmont.charts.gui.components.charts.StockChart;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class StockChartStockEventsFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 500;

    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs;
    @Inject
    private StockChart stockChart;

    private Random random = new Random();

    @Override
    public void init(Map<String, Object> params) {
        generateData();
        addEventListeners();
    }

    private void generateData() {
        stockChartDs.refresh();

        LocalDate localDate = LocalDate.of(2015, Month.DECEMBER, 31);
        Date startDate = Date.from(localDate.minusDays(DAYS_COUNT).atStartOfDay(ZoneId.systemDefault()).toInstant());
        for (int i = 0; i < DAYS_COUNT; i++) {
            stockChartDs.includeItem(generateDateValueVolume(DateUtils.addDays(startDate, i), i));
        }
    }

    private DateValueVolume generateDateValueVolume(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (40 + i)) + 100 + i;
        Long volume = Math.round(random.nextDouble() * (1000 + i)) + 600 + i + 2;
        return dateValueVolume(date, value, volume);
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = new DateValueVolume();
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }

    private void addEventListeners() {
        stockChart.addStockEventClickListener(event -> showStockEventEvent(event, "StockEventClickEvent"));
    }

    private void showStockEventEvent(StockChart.AbstractStockEventEvent event, String message) {
        showNotification(message, "<Strong>Graph ID:</Strong> " + event.getGraphId() + "</br>"
                        + "<Strong>Date:</Strong> " + event.getDate() + "</br>"
                        + "<Strong>StockEvent:</Strong> " + event.getStockEvent(),
                NotificationType.TRAY_HTML);
    }
}
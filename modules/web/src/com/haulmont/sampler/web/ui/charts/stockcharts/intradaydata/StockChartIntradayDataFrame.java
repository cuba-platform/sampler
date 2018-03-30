package com.haulmont.sampler.web.ui.charts.stockcharts.intradaydata;

import com.haulmont.charts.gui.components.charts.StockChart;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.*;

public class StockChartIntradayDataFrame extends AbstractFrame {
    private static final int MINUTES_COUNT = 1000;

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

        Date startDate = DateUtils.addDays(getZeroTime(new Date()), -MINUTES_COUNT);
        for (int i = 0; i < MINUTES_COUNT; i++) {
            stockChartDs.includeItem(addDateValueVolumeTime(DateUtils.addMinutes(startDate, i), i));
        }
    }

    private DateValueVolume addDateValueVolumeTime(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (40 + i)) + 100 + i;
        Long volume = Math.round(random.nextDouble() * 100000000);
        return dateValueVolume(date, value, volume);
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = new DateValueVolume();
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
        showNotification(message, "<Strong>Panel ID:</Strong> " + event.getPanelId() + "</br>"
                        + "<Strong>Graph ID:</Strong> " + event.getGraphId() + "</br>"
                        + "<Strong>Item Index:</Strong> " + event.getItemIndex() + "</br>"
                        + "<Strong>Item:</Strong> " + event.getEntity() + "</br>"
                        + "<Strong>X:</Strong> " + event.getX() + "</br>"
                        + "<Strong>Y:</Strong> " + event.getY() + "</br>"
                        + "<Strong>Absolute X:</Strong> " + event.getAbsoluteX() + "</br>"
                        + "<Strong>Absolute Y:</Strong> " + event.getAbsoluteY(),
                NotificationType.TRAY_HTML);
    }
}
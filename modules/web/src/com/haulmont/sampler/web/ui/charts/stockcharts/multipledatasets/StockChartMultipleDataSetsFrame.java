package com.haulmont.sampler.web.ui.charts.stockcharts.multipledatasets;

import com.haulmont.charts.gui.components.charts.StockChart;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class StockChartMultipleDataSetsFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 500;

    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs1;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs2;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs3;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs4;
    @Inject
    private StockChart stockChart;

    private Date today = new Date();
    private Random random = new Random();

    @Override
    public void init(Map<String, Object> params) {
        generateData();
        addEventListeners();
    }

    private void generateData() {
        stockChartDs1.refresh();
        populateStockDatasource(stockChartDs1, 40, 100, 1000, 500, 2);

        stockChartDs2.refresh();
        populateStockDatasource(stockChartDs2, 100, 200, 1000, 600, 2);

        stockChartDs3.refresh();
        populateStockDatasource(stockChartDs3, 100, 200, 1000, 600, 2);

        stockChartDs4.refresh();
        populateStockDatasource(stockChartDs4, 100, 200, 100, 600, 1);
    }

    private void populateStockDatasource(CollectionDatasource<DateValueVolume, UUID> datasource,
                                         int valueX1, int valueX2, int volumeX1, int volumeX2, int volumeX3) {
        Date startDate = DateUtils.addDays(today, -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            addDateValueVolume(datasource, valueX1, valueX2, volumeX1, volumeX2, volumeX3,
                    DateUtils.addDays(startDate, i), i);
        }
    }

    private void addDateValueVolume(CollectionDatasource<DateValueVolume, UUID> datasource,
                                    int valueX1, int valueX2, int volumeX1, int volumeX2, int volumeX3,
                                    Date date, int i) {
        Long value = Math.round(random.nextDouble() * (valueX1 + i)) + valueX2 + i;
        Long volume = Math.round(random.nextDouble() * (volumeX1 + i)) + volumeX2 + i + volumeX3;
        datasource.includeItem(dateValueVolume(date, value, volume));
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = new DateValueVolume();
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }

    private void addEventListeners() {
        stockChart.addDataSetSelectorCompareListener(event ->
                showDataSetSelectorEvent(event, "DataSetSelectorCompareEvent"));
        stockChart.addDataSetSelectorSelectListener(event ->
                showDataSetSelectorEvent(event, "DataSetSelectorSelectEvent"));
        stockChart.addDataSetSelectorUnCompareListener(event ->
                showDataSetSelectorEvent(event, "DataSetSelectorUnCompareEvent"));
        stockChart.addStockGraphClickListener(event ->
                showStockGraphEvent(event, "StockGraphClickEvent"));
    }

    private void showDataSetSelectorEvent(StockChart.AbstractDataSetSelectorEvent event, String message) {
        showNotification(message, "<Strong>DataSet:</Strong> " + event.getDataSetId(),
                NotificationType.HUMANIZED_HTML);
    }

    private void showStockGraphEvent(StockChart.AbstractStockGraphEvent event, String message) {
        showNotification(message, "<Strong>Panel ID:</Strong> " + event.getPanelId() + "</br>"
                        + "<Strong>Graph ID:</Strong> " + event.getGraphId() + "</br>"
                        + "<Strong>X:</Strong> " + event.getX() + "</br>"
                        + "<Strong>Y:</Strong> " + event.getY() + "</br>"
                        + "<Strong>Absolute X:</Strong> " + event.getAbsoluteX() + "</br>"
                        + "<Strong>Absolute Y:</Strong> " + event.getAbsoluteY(),
                NotificationType.HUMANIZED_HTML);
    }
}
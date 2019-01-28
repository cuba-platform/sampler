package com.haulmont.sampler.web.ui.charts.stockcharts.multipledatasets;

import com.haulmont.charts.gui.components.charts.StockChart;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
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

@UiController("stockchart-multiple-datasets")
@UiDescriptor("stockchart-multiple-datasets.xml")
public class StockChartMultipleDataSetsSample extends ScreenFragment {
    private static final int DAYS_COUNT = 500;

    @Inject
    private StockChart stockChart;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc1;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc2;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc3;
    @Inject
    private CollectionContainer<DateValueVolume> stockChartDc4;

    @Inject
    private Notifications notifications;
    @Inject
    private TimeSource timeSource;
    @Inject
    private Metadata metadata;

    private final Random random = new Random();

    @Subscribe
    protected void onInit(InitEvent event) {
        generateData();
        addEventListeners();
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
        notifications.create()
                .withCaption(message)
                .withDescription("<Strong>DataSet:</Strong> " + event.getDataSetId())
                .withContentMode(ContentMode.HTML)
                .show();
    }

    private void showStockGraphEvent(StockChart.AbstractStockGraphEvent event, String message) {
        notifications.create()
                .withCaption(message)
                .withDescription("<Strong>Panel ID:</Strong> " + event.getPanelId() + "</br>"
                        + "<Strong>Graph ID:</Strong> " + event.getGraphId() + "</br>"
                        + "<Strong>X:</Strong> " + event.getX() + "</br>"
                        + "<Strong>Y:</Strong> " + event.getY() + "</br>"
                        + "<Strong>Absolute X:</Strong> " + event.getAbsoluteX() + "</br>"
                        + "<Strong>Absolute Y:</Strong> " + event.getAbsoluteY())
                .withContentMode(ContentMode.HTML)
                .show();
    }
}
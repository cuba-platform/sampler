package com.haulmont.sampler.web.ui.charts.stockcharts.multiplepanels;

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
import com.haulmont.sampler.entity.StockData;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@UiController("stockchart-multiple-panels")
@UiDescriptor("stockchart-multiple-panels.xml")
public class StockChartMultiplePanelsSample extends ScreenFragment {
    private static final int DAYS_COUNT = 2000;

    @Inject
    private StockChart stockChart;
    @Inject
    private CollectionContainer<StockData> stockChartDc;

    @Inject
    private Metadata metadata;
    @Inject
    private TimeSource timeSource;
    @Inject
    private Notifications notifications;

    private final Random random = new Random();

    @Subscribe
    protected void onInit(InitEvent event) {
        generateData();
        addEventListeners();
    }

    private void generateData() {
        List<StockData> items = new ArrayList<>();
        Date startDate = DateUtils.addDays(timeSource.currentTimestamp(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            items.add(generateStockData(DateUtils.addDays(startDate, i), i));
        }
        stockChartDc.setItems(items);
    }

    private StockData generateStockData(Date date, int i) {
        Long open = Math.round(random.nextDouble() * 30 + 100);
        Long close = open + Math.round(random.nextDouble() * 15 - random.nextDouble() * 10);

        Long low = (open < close ? open : close) - Math.round(random.nextDouble() * 5);
        Long high = (open < close ? close : open) + Math.round(random.nextDouble() * 5);

        Long volume = Math.round(random.nextDouble() * (1000 + i)) + 100 + i;
        Long value = Math.round(random.nextDouble() * 30 + 100);

        return stockData(date, value, volume, open, close, high, low);
    }

    private StockData stockData(Date date, Long value, Long volume,
                                Long open, Long close, Long high, Long low) {
        StockData dateValueVolume = metadata.create(StockData.class);
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        dateValueVolume.setOpen(open);
        dateValueVolume.setClose(close);
        dateValueVolume.setHigh(high);
        dateValueVolume.setLow(low);
        return dateValueVolume;
    }

    private void addEventListeners() {
        stockChart.addPeriodSelectorChangeListener(event ->
                notifications.create()
                        .withCaption("PeriodSelectorChangeEvent")
                        .withDescription("<Strong>Start Date:</Strong> " + event.getStartDate() + "</br>"
                                + "<Strong>End Date:</Strong> " + event.getEndDate() + "</br>"
                                + "<Strong>Predefined Period:</Strong> " + event.getPredefinedPeriod().name() + "</br>"
                                + "<Strong>Count:</Strong> " + event.getCount() + "</br>"
                                + "<Strong>X:</Strong> " + event.getX() + "</br>"
                                + "<Strong>Y:</Strong> " + event.getY() + "</br>"
                                + "<Strong>Absolute X:</Strong> " + event.getAbsoluteX() + "</br>"
                                + "<Strong>Absolute Y:</Strong> " + event.getAbsoluteY())
                        .withContentMode(ContentMode.HTML)
                        .show());
    }
}
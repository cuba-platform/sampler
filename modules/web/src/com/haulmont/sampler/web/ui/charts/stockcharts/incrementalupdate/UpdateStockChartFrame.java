package com.haulmont.sampler.web.ui.charts.stockcharts.incrementalupdate;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class UpdateStockChartFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 20;

    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs1;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs2;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs3;
    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs4;
    @Inject
    private Timer timer;
    @Inject
    private Label statusLabel;

    private Date today = new Date();
    private Random random = new Random();
    private int lastIndex = DAYS_COUNT;
    private Date lastDate;

    @Override
    public void init(Map<String, Object> params) {
        generateData();

        lastDate = today;

        timer.addActionListener(timer -> {
            addData();
            removeData();
        });
        timer.start();
    }

    private void addData() {
        addDateValueVolume(stockChartDs1, 40, 100, 1000, 500, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDs2, 100, 200, 1000, 600, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDs3, 100, 200, 1000, 600, 2, lastDate, lastIndex);
        addDateValueVolume(stockChartDs4, 100, 200, 100, 600, 1, lastDate, lastIndex);
        lastDate = DateUtils.addDays(lastDate, 1);
        lastIndex++;
    }

    private void removeData() {
        removeData(stockChartDs1);
        removeData(stockChartDs2);
        removeData(stockChartDs3);
        removeData(stockChartDs4);
    }
    private void removeData(CollectionDatasource<DateValueVolume, UUID> stockChartDs) {
        if (!stockChartDs.getItems().isEmpty()) {
            stockChartDs.excludeItem(stockChartDs.getItems().iterator().next());
        }
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

    public void startTimer() {
        timer.start();
        statusLabel.setValue("Update enabled");
    }

    public void stopTimer() {
        timer.stop();
        statusLabel.setValue("Update disabled");
    }
}
package com.haulmont.sampler.web.ui.charts.stockcharts.drawing;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class StockChartDrawingFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 500;

    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stockChartDs;

    private Random random = new Random();

    @Override
    public void init(Map<String, Object> params) {
        stockChartDs.refresh();

        Date startDate = DateUtils.addDays(new Date(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            stockChartDs.includeItem(generateDateValueVolume(DateUtils.addDays(startDate, i), i));
        }
    }

    private DateValueVolume generateDateValueVolume(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (40 + i)) + 100 + i;
        Long volume = Math.round(random.nextDouble() * i) + i;
        return dateValueVolume(date, value, volume);
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = new DateValueVolume();
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }
}
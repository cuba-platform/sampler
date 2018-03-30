package com.haulmont.sampler.web.ui.charts.charts.serial.clusteredbar;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.*;

public class ClusteredBarChartFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 5;

    @Inject
    private CollectionDatasource<DateValueVolume, UUID> stackedAreaChartDs;

    private Random random = new Random();

    @Override
    public void init(Map<String, Object> params) {
        Date startDate = DateUtils.addDays(new Date(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            stackedAreaChartDs.includeItem(generateDateValueVolume(DateUtils.addDays(startDate, i), i));
        }
    }

    private DateValueVolume generateDateValueVolume(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (20 + i)) + 20 + i;
        Long volume = Math.round(random.nextDouble() * (20 + i)) + i;
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

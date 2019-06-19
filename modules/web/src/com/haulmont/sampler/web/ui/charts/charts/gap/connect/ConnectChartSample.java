package com.haulmont.sampler.web.ui.charts.charts.gap.connect;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.DateValueGap;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@UiController("connect-chart")
@UiDescriptor("connect-chart.xml")
public class ConnectChartSample extends ScreenFragment {

    private static final int DAYS_COUNT = 15;

    @Inject
    private CollectionContainer<DateValueGap> gapChartDc;

    @Inject
    private Metadata metadata;

    @Inject
    private TimeSource timeSource;

    private final Random random = new Random();

    @Subscribe
    private void onInit(InitEvent event) {
        List<DateValueGap> items = new ArrayList<>(DAYS_COUNT);
        Date startDate = DateUtils.addDays(timeSource.currentTimestamp(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            if (i < 7 || i > 8) {
                items.add(generateDateValueGap(DateUtils.addDays(startDate, i), i));
            }
        }
        gapChartDc.setItems(items);
    }

    private DateValueGap generateDateValueGap(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (20 + i)) - 20 + i;
        return dateValueVolume(date, value);
    }

    private DateValueGap dateValueVolume(Date date, Long value) {
        DateValueGap dateValueGap = metadata.create(DateValueGap.class);
        dateValueGap.setDate(date);
        dateValueGap.setValue(value);
        return dateValueGap;
    }
}

package com.haulmont.sampler.web.ui.charts.charts.serial.multipleaxis;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.DateValueVolume;
import org.apache.commons.lang3.time.DateUtils;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@UiController("multiple-valueaxis-chart")
@UiDescriptor("multiple-valueaxis-chart.xml")
public class MultipleValueAxisSample extends ScreenFragment {
    private static final int DAYS_COUNT = 20;

    @Inject
    private CollectionContainer<DateValueVolume> lineChartDc;
    @Inject
    private Metadata metadata;
    @Inject
    private TimeSource timeSource;

    private Random random = new Random();

    @Subscribe
    protected void onInit(InitEvent event) {
        List<DateValueVolume> items = new ArrayList<>();
        Date startDate = DateUtils.addDays(timeSource.currentTimestamp(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            items.add(generateDateValueVolume(DateUtils.addDays(startDate, i), i));
        }
        lineChartDc.setItems(items);
    }


    private DateValueVolume generateDateValueVolume(Date date, int i) {
        Long value = Math.round(random.nextDouble() * (20 + i)) + 20 + i;
        Long volume = Math.round(random.nextDouble() * (20 + i)) + i;
        return dateValueVolume(date, value, volume);
    }

    private DateValueVolume dateValueVolume(Date date, Long value, Long volume) {
        DateValueVolume dateValueVolume = metadata.create(DateValueVolume.class);
        dateValueVolume.setDate(date);
        dateValueVolume.setValue(value);
        dateValueVolume.setVolume(volume);
        return dateValueVolume;
    }
}

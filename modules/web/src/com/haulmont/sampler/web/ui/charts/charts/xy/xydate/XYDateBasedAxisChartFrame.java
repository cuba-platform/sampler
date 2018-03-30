package com.haulmont.sampler.web.ui.charts.charts.xy.xydate;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.charts.gui.components.charts.XYChart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.cuba.gui.components.AbstractFrame;
import org.apache.commons.lang.time.DateUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;
import java.util.Random;

public class XYDateBasedAxisChartFrame extends AbstractFrame {
    private static final int DAYS_COUNT = 10;

    @Inject
    private XYChart xyChart;

    private Random random = new Random();

    @Override
    public void init(Map<String, Object> params) {
        ListDataProvider dataProvider = new ListDataProvider();

        Date startDate = DateUtils.addDays(new Date(), -DAYS_COUNT);
        for (int i = 0; i < DAYS_COUNT; i++) {
            dataProvider.addItem(generateDateValueVolume(DateUtils.addDays(startDate, i), i));
        }
        xyChart.setDataProvider(dataProvider);

        xyChart.getValueAxes().get(0).setMinimumDate(DateUtils.addDays(startDate, -1));
        xyChart.getValueAxes().get(0).setMaximumDate(DateUtils.addDays(startDate, DAYS_COUNT + 1));
    }

    private MapDataItem generateDateValueVolume(Date date, int i) {
        Long roundValue = Math.round(random.nextDouble() * (5 + i)) + 2 + i;
        Long diamondValue = Math.round(random.nextDouble() * (2 + i)) + 2 + i;
        Long roundY = Math.round(random.nextDouble() * (2 + i)) + 1 + i;
        Long diamondY = Math.round(random.nextDouble() * (6 + i)) + 1 + i;
        return dateValueVolume(date, roundValue, roundY, diamondValue, diamondY);
    }

    private MapDataItem dateValueVolume(Date date, Long roundValue, Long roundY, Long diamondValue, Long diamondY) {
        return new MapDataItem(
                ParamsMap.of("date", date,
                             "roundValue", roundValue,
                             "roundY", roundY,
                             "diamondValue", diamondValue,
                             "diamondY", diamondY));
    }
}

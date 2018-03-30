package com.haulmont.sampler.web.ui.charts.charts.radar.polar;

import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class PolarChartFrame extends AbstractFrame {

    @Inject
    private Chart polarChart;

    @Override
    public void init(Map<String, Object> params) {
        ListDataProvider dataProvider = new ListDataProvider();

        dataProvider.addItem(new MapDataItem().add("direction", "N").add("value", 8.0));
        dataProvider.addItem(new MapDataItem().add("direction", "NE").add("value", 9.0));
        dataProvider.addItem(new MapDataItem().add("direction", "E").add("value", 4.5));
        dataProvider.addItem(new MapDataItem().add("direction", "SE").add("value", 3.5));
        dataProvider.addItem(new MapDataItem().add("direction", "S").add("value", 9.2));
        dataProvider.addItem(new MapDataItem().add("direction", "SW").add("value", 8.4));
        dataProvider.addItem(new MapDataItem().add("direction", "W").add("value", 11.1));
        dataProvider.addItem(new MapDataItem().add("direction", "NW").add("value", 10.0));

        polarChart.setDataProvider(dataProvider);
    }
}
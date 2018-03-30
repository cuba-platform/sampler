package com.haulmont.sampler.web.ui.charts.charts.dataitems.mapdataitem;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class MapDataItemFrame extends AbstractFrame {
    @Inject
    private Chart chart;

    @Override
    public void init(Map<String, Object> params) {
        ListDataProvider dataProvider = new ListDataProvider();
        dataProvider.addItem(new MapDataItem(
                ParamsMap.of("value", 75, "description", "Sky")));
        dataProvider.addItem(new MapDataItem(
                ParamsMap.of("value", 7, "description", "Shady side of pyramid")));
        dataProvider.addItem(new MapDataItem(
                ParamsMap.of("value", 18, "description", "Sunny side of pyramid")));

        chart.setDataProvider(dataProvider);
    }
}
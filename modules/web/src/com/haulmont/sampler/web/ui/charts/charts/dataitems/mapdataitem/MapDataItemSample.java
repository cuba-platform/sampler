package com.haulmont.sampler.web.ui.charts.charts.dataitems.mapdataitem;

import com.google.common.collect.ImmutableMap;
import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("map-data-item")
@UiDescriptor("map-data-item.xml")
public class MapDataItemSample extends ScreenFragment {
    @Inject
    private PieChart chart;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListDataProvider dataProvider = new ListDataProvider();
        dataProvider.addItem(new MapDataItem(
                ImmutableMap.of("value", 75, "description", "Sky")));
        dataProvider.addItem(new MapDataItem(
                ImmutableMap.of("value", 7, "description", "Shady side of pyramid")));
        dataProvider.addItem(new MapDataItem(
                ImmutableMap.of("value", 18, "description", "Sunny side of pyramid")));

        chart.setDataProvider(dataProvider);
    }
}
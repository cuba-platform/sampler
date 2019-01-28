package com.haulmont.sampler.web.ui.charts.charts.radar.polar;

import com.haulmont.charts.gui.components.charts.RadarChart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("polar-chart")
@UiDescriptor("polar-chart.xml")
public class PolarChartSample extends ScreenFragment {

    @Inject
    private RadarChart polarChart;

    @Subscribe
    protected void onInit(InitEvent event) {
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
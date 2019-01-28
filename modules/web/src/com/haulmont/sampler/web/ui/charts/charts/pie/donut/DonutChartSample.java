package com.haulmont.sampler.web.ui.charts.charts.pie.donut;

import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("donut-chart")
@UiDescriptor("donut-chart.xml")
public class DonutChartSample extends ScreenFragment {

    @Inject
    private PieChart donutChart;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListDataProvider dataProvider = new ListDataProvider();

        dataProvider.addItem(new MapDataItem().add("title", "New").add("value", 4852));
        dataProvider.addItem(new MapDataItem().add("title", "Returning").add("value", 9899));

        donutChart.setDataProvider(dataProvider);
    }
}
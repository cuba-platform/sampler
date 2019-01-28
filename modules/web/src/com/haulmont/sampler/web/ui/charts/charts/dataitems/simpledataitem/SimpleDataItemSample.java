package com.haulmont.sampler.web.ui.charts.charts.dataitems.simpledataitem;

import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.charts.gui.data.SimpleDataItem;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-data-item")
@UiDescriptor("simple-data-item.xml")
public class SimpleDataItemSample extends ScreenFragment {
    @Inject
    private PieChart chart;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListDataProvider dataProvider = new ListDataProvider();
        dataProvider.addItem(new SimpleDataItem(new ValueDescription(75, "Sky")));
        dataProvider.addItem(new SimpleDataItem(new ValueDescription(7, "Shady side of pyramid")));
        dataProvider.addItem(new SimpleDataItem(new ValueDescription(18, "Sunny side of pyramid")));

        chart.setDataProvider(dataProvider);
    }

    public class ValueDescription {
        private Integer value;
        private String description;

        public ValueDescription(Integer value, String description) {
            this.value = value;
            this.description = description;
        }

        public Integer getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }
    }
}
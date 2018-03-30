package com.haulmont.sampler.web.ui.charts.charts.dataitems.simpledataitem;

import com.haulmont.charts.gui.data.SimpleDataItem;
import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class SimpleDataItemFrame extends AbstractFrame {
    @Inject
    private Chart chart;

    @Override
    public void init(Map<String, Object> params) {
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
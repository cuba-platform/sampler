package com.haulmont.sampler.web.ui.charts.charts.dataitems.entitydataitem;

import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.charts.gui.data.EntityDataItem;
import com.haulmont.charts.gui.data.ListDataProvider;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.ValueDescription;

import javax.inject.Inject;

@UiController("entity-data-item")
@UiDescriptor("entity-data-item.xml")
public class EntityDataItemSample extends ScreenFragment {
    @Inject
    private PieChart chart;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        ListDataProvider dataProvider = new ListDataProvider();
        dataProvider.addItem(new EntityDataItem(valueDescription(75, "Sky")));
        dataProvider.addItem(new EntityDataItem(valueDescription(7, "Shady side of pyramid")));
        dataProvider.addItem(new EntityDataItem(valueDescription(18, "Sunny side of pyramid")));

        chart.setDataProvider(dataProvider);
    }

    private ValueDescription valueDescription(Integer value, String description) {
        ValueDescription entity = metadata.create(ValueDescription.class);
        entity.setValue(value);
        entity.setDescription(description);
        return entity;
    }
}
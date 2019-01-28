package com.haulmont.sampler.web.ui.charts.charts.events.legend;

import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.CountryLitres;

import javax.inject.Inject;

@UiController("chart-legend")
@UiDescriptor("chart-legend.xml")
@LoadDataBeforeShow
public class ChartLegendSample extends ScreenFragment {
    @Inject
    private PieChart chart;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        chart.addLegendItemHideListener(legendItemHideEvent ->
                notifications.create()
                        .withCaption("LegendItemHideEvent")
                        .withDescription(itemInfo(legendItemHideEvent.getEntity()))
                        .withContentMode(ContentMode.HTML)
                        .show());

        chart.addLegendItemShowListener(legendItemShowEvent ->
                notifications.create()
                        .withCaption("LegendItemShowEvent")
                        .withDescription(itemInfo(legendItemShowEvent.getEntity()))
                        .withContentMode(ContentMode.HTML)
                        .show());
    }

    private String itemInfo(Entity entity) {
        CountryLitres countryLitres = (CountryLitres) entity;
        return countryLitres.getCountry() + ": " + countryLitres.getLitres() + " litres";
    }
}
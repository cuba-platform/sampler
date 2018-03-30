package com.haulmont.sampler.web.ui.charts.charts.events.legend;

import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.sampler.entity.CountryLitres;

import javax.inject.Inject;
import java.util.Map;

public class ChartLegendFrame extends AbstractFrame {
    @Inject
    private Chart chart;

    @Override
    public void init(Map<String, Object> params) {
        chart.addLegendItemHideListener(event ->
                showNotification("LegendItemHideEvent", itemInfo(event.getEntity()), NotificationType.HUMANIZED_HTML));
        chart.addLegendItemShowListener(event ->
                showNotification("LegendItemShowEvent", itemInfo(event.getEntity()), NotificationType.HUMANIZED_HTML));
    }

    private String itemInfo(Entity entity) {
        CountryLitres countryLitres = (CountryLitres) entity;
        return countryLitres.getCountry() + ": " + countryLitres.getLitres() + " litres";
    }
}
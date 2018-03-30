package com.haulmont.sampler.web.ui.charts.charts.events.slice;

import com.haulmont.charts.gui.components.charts.Chart.SliceClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.SliceRightClickEvent;
import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.sampler.entity.CountryLitres;

import javax.inject.Inject;
import java.util.Map;

public class ChartSliceFrame extends AbstractFrame {
    @Inject
    private PieChart pieChart;

    @Override
    public void init(Map<String, Object> params) {
        pieChart.addSlicePullOutListener(event ->
                showNotification("PullOutEvent", itemInfo(event.getEntity()), NotificationType.HUMANIZED));
        pieChart.addSlicePullInListener(event ->
                showNotification("PullInEvent", itemInfo(event.getEntity()), NotificationType.HUMANIZED));
        pieChart.addSliceClickListener(event ->
                showNotification("SliceClickEvent", eventInfo(event), NotificationType.TRAY_HTML));
        pieChart.addSliceRightClickListener(event ->
                showNotification("SliceRightClickEvent", eventInfo(event), NotificationType.TRAY_HTML));
    }

    private String itemInfo(Entity entity) {
        CountryLitres countryLitres = (CountryLitres) entity;
        return countryLitres.getCountry() + ": " + countryLitres.getLitres() + " litres";
    }

    private String eventInfo(SliceClickEvent event) {
        return String.format("<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getX(), event.getY(), event.getAbsoluteX(), event.getAbsoluteY());
    }

    private String eventInfo(SliceRightClickEvent event) {
        return String.format("<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getX(), event.getY(), event.getAbsoluteX(), event.getAbsoluteY());
    }
}
package com.haulmont.sampler.web.ui.charts.charts.events.slice;

import com.haulmont.charts.gui.components.charts.Chart.SliceClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.SliceRightClickEvent;
import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.CountryLitres;

import javax.inject.Inject;

@UiController("chart-slice")
@UiDescriptor("chart-slice.xml")
@LoadDataBeforeShow
public class ChartSliceSample extends ScreenFragment {
    @Inject
    private PieChart pieChart;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        pieChart.addSlicePullOutListener(slicePullOutEvent ->
                notifications.create()
                        .withCaption("PullOutEvent")
                        .withDescription(itemInfo(slicePullOutEvent.getEntity()))
                        .show());

        pieChart.addSlicePullInListener(slicePullInEvent ->
                notifications.create()
                        .withCaption("PullInEvent")
                        .withDescription(itemInfo(slicePullInEvent.getEntity()))
                        .show());

        pieChart.addSliceClickListener(sliceClickEvent ->
                notifications.create()
                        .withCaption("SliceClickEvent")
                        .withDescription(eventInfo(sliceClickEvent))
                        .withType(NotificationType.TRAY)
                        .withContentMode(ContentMode.HTML)
                        .show());

        pieChart.addSliceRightClickListener(sliceRightClickEvent ->
                notifications.create()
                        .withCaption("SliceRightClickEvent")
                        .withDescription(eventInfo(sliceRightClickEvent))
                        .withType(NotificationType.TRAY)
                        .withContentMode(ContentMode.HTML)
                        .show());
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
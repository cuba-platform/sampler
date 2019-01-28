package com.haulmont.sampler.web.ui.charts.charts.events.click;

import com.haulmont.charts.gui.components.charts.Chart.ChartClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.ChartRightClickEvent;
import com.haulmont.charts.gui.components.charts.XYChart;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("chart-click")
@UiDescriptor("chart-click.xml")
@LoadDataBeforeShow
public class ChartClickSample extends ScreenFragment {
    @Inject
    private XYChart chart;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        chart.addClickListener(chartClickEvent ->
                notifications.create()
                        .withCaption("ClickEvent")
                        .withDescription(eventInfo(chartClickEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());

        chart.addRightClickListener(chartRightClickEvent ->
                notifications.create()
                        .withCaption("RightClickEvent")
                        .withDescription(eventInfo(chartRightClickEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());
    }

    private String eventInfo(ChartClickEvent event) {
        return String.format("<strong>X Value:</strong> %f<br/><strong>Y Value:</strong> %f<br/>" +
                        "<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getxAxis(), event.getyAxis(),
                event.getX(), event.getY(),
                event.getAbsoluteX(), event.getAbsoluteY());
    }

    private String eventInfo(ChartRightClickEvent event) {
        return String.format("<strong>X Value:</strong> %f<br/><strong>Y Value:</strong> %f<br/>" +
                        "<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getxAxis(), event.getyAxis(),
                event.getX(), event.getY(),
                event.getAbsoluteX(), event.getAbsoluteY());
    }
}
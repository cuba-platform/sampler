package com.haulmont.sampler.web.ui.charts.charts.events.zoom;

import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("chart-zoom")
@UiDescriptor("chart-zoom.xml")
@LoadDataBeforeShow
public class ChartZoomSample extends ScreenFragment {
    @Inject
    private SerialChart lineChart;
    @Inject
    private Label<String> label;

    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        lineChart.addZoomListener(zoomEvent ->
                label.setValue(String.format("Zoom: <strong>[%s, %s]</strong>",
                        zoomEvent.getStartValue(), zoomEvent.getEndValue())));

        lineChart.addCursorZoomListener(cursorZoomEvent ->
                notifications.create()
                        .withCaption("CursorZoomEvent")
                        .withDescription(eventInfo(cursorZoomEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());
    }

    private String eventInfo(Chart.CursorZoomEvent event) {
        return "<strong>Start: </strong>" + event.getStart() + "<br/>" +
                "<strong>End: </strong>" + event.getEnd();
    }
}
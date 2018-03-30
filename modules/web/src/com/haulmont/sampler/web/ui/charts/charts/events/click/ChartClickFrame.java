package com.haulmont.sampler.web.ui.charts.charts.events.click;

import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.charts.gui.components.charts.Chart.ChartClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.ChartRightClickEvent;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class ChartClickFrame extends AbstractFrame {
    @Inject
    private Chart chart;

    @Override
    public void init(Map<String, Object> params) {
        chart.addClickListener(event ->
                showNotification("ClickEvent", eventInfo(event), NotificationType.HUMANIZED_HTML));
        chart.addRightClickListener(event ->
                showNotification("RightClickEvent", eventInfo(event), NotificationType.HUMANIZED_HTML));
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
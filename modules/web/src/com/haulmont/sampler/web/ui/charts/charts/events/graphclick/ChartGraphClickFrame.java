package com.haulmont.sampler.web.ui.charts.charts.events.graphclick;

import com.haulmont.charts.gui.components.charts.Chart.GraphClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.GraphItemClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.GraphItemRightClickEvent;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class ChartGraphClickFrame extends AbstractFrame {
    @Inject
    private SerialChart chart;

    @Override
    public void init(Map<String, Object> params) {
        chart.addGraphClickListener(event ->
                showNotification("GraphClickEvent", clickEventInfo(event),
                        NotificationType.TRAY_HTML));
        chart.addGraphItemClickListener(event ->
                showNotification("GraphItemClickEvent", itemClickEventInfo(event),
                        NotificationType.HUMANIZED_HTML));
        chart.addGraphItemRightClickListener(event ->
                showNotification("GraphItemRightClickEvent", itemClickEventInfo(event),
                        NotificationType.HUMANIZED_HTML));
    }

    private String clickEventInfo(GraphClickEvent event) {
        return String.format("<strong>Graph Id:</strong> %s<br/>" +
                        "<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getGraphId(), event.getX(), event.getY(), event.getAbsoluteX(), event.getAbsoluteY());
    }

    private String itemClickEventInfo(GraphItemClickEvent event) {
        return String.format("<strong>Graph Id:</strong> %s<br/><strong>Item Index:</strong> %d<br/>" +
                        "<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getGraphId(), event.getItemIndex(),
                event.getX(), event.getY(),
                event.getAbsoluteX(), event.getAbsoluteY());
    }

    private String itemClickEventInfo(GraphItemRightClickEvent event) {
        return String.format("<strong>Graph Id:</strong> %s<br/><strong>Item Index:</strong> %d<br/>" +
                        "<strong>X:</strong> %d<br/><strong>Y:</strong> %d<br/>" +
                        "<strong>Absolute X:</strong> %d<br/><strong>Absolute Y:</strong> %d<br/>",
                event.getGraphId(), event.getItemIndex(),
                event.getX(), event.getY(),
                event.getAbsoluteX(), event.getAbsoluteY());
    }
}
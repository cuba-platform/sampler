package com.haulmont.sampler.web.ui.charts.charts.events.graphclick;

import com.haulmont.charts.gui.components.charts.Chart.GraphClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.GraphItemClickEvent;
import com.haulmont.charts.gui.components.charts.Chart.GraphItemRightClickEvent;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("chart-graph-click")
@UiDescriptor("chart-graph-click.xml")
@LoadDataBeforeShow
public class ChartGraphClickSample extends ScreenFragment {
    @Inject
    private SerialChart chart;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        chart.addGraphClickListener(graphClickEvent ->
                notifications.create()
                        .withCaption("GraphClickEvent")
                        .withDescription(clickEventInfo(graphClickEvent))
                        .withType(NotificationType.TRAY)
                        .withContentMode(ContentMode.HTML)
                        .show());

        chart.addGraphItemClickListener(graphItemClickEvent ->
                notifications.create()
                        .withCaption("GraphItemClickEvent")
                        .withDescription(itemClickEventInfo(graphItemClickEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());

        chart.addGraphItemRightClickListener(graphItemRightClickEvent ->
                notifications.create()
                        .withCaption("GraphItemRightClickEvent")
                        .withDescription(itemClickEventInfo(graphItemRightClickEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());
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
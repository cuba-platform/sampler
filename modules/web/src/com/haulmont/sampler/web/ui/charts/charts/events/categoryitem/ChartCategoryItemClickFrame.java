package com.haulmont.sampler.web.ui.charts.charts.events.categoryitem;

import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.charts.gui.components.charts.SeriesBasedChart.CategoryItemClickEvent;

import javax.inject.Inject;
import java.util.Map;

public class ChartCategoryItemClickFrame extends AbstractFrame {

    @Inject
    private SerialChart lineChart;

    @Override
    public void init(Map<String, Object> params) {
        lineChart.addCategoryItemClickListener(event ->
                showNotification("CategoryItemClickEvent", eventInfo(event), NotificationType.HUMANIZED_HTML));
    }

    private String eventInfo(CategoryItemClickEvent event) {
        return String.format("<strong>Item name:</strong> %s<br/> <strong>X:</strong> %d<br/>" +
                             "<strong>Y:</strong> %d<br/> <strong>Axis X:</strong> %d<br/>" +
                             "<strong>Axis Y:</strong> %d<br/> <strong>Offset X:</strong> %d<br/>" +
                             "<strong>Offset Y:</strong> %d<br/>",
                event.getValue(), event.getX(), event.getY(), event.getXAxis(), event.getYAxis(),
                event.getOffsetX(), event.getOffsetY());
    }
}

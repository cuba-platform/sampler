package com.haulmont.sampler.web.ui.charts.charts.events.categoryitem;

import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.charts.gui.components.charts.SeriesBasedChart.CategoryItemClickEvent;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("chart-category-item-click")
@UiDescriptor("chart-category-item-click.xml")
@LoadDataBeforeShow
public class ChartCategoryItemClickSample extends ScreenFragment {

    @Inject
    private SerialChart lineChart;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        lineChart.addCategoryItemClickListener(categoryItemClickEvent ->
                notifications.create()
                        .withCaption("CategoryItemClickEvent")
                        .withDescription(eventInfo(categoryItemClickEvent))
                        .withContentMode(ContentMode.HTML)
                        .show());
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

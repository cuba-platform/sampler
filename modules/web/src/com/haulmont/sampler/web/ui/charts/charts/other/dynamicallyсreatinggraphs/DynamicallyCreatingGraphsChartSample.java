package com.haulmont.sampler.web.ui.charts.charts.other.dynamicallyсreatinggraphs;

import com.haulmont.charts.gui.amcharts.model.Graph;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.chile.core.model.MetaProperty;
import com.haulmont.cuba.core.global.MessageTools;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.TransportCount;

import javax.inject.Inject;

@UiController("dynamically-creating-graphs-chart")
@UiDescriptor("dynamically-creating-graphs-chart.xml")
public class DynamicallyCreatingGraphsChartSample extends ScreenFragment {
    private static final String CATEGORY_FIELD = "year";

    @Inject
    private SerialChart serialChart;
    @Inject
    private Metadata metadata;
    @Inject
    private MessageTools messageTools;

    @Subscribe
    private void onInit(InitEvent event) {
        getScreenData().loadAll();

        MetaClass metaClass = metadata.getClassNN(TransportCount.class);
        for (MetaProperty property : metaClass.getOwnProperties()) {
            if (!CATEGORY_FIELD.equals(property.getName())) {
                serialChart.addGraphs(createGraph(property));
            }
        }
    }

    private Graph createGraph(MetaProperty property) {
        Graph graph = new Graph();
        graph.setTitle(messageTools.getPropertyCaption(property));
        graph.setValueField(property.getName());
        graph.setUseLineColorForBulletBorder(true);
        graph.setFillAlphas(0.5);
        graph.setLineThickness(3);
        graph.setBalloonText("[[title]] : [[value]]");
        return graph;
    }
}

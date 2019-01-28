package com.haulmont.sampler.web.ui.charts.map.heat;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.layer.HeatMapLayer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;

@UiController("heat-map")
@UiDescriptor("heat-map.xml")
public class HeatMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setZoom(13);
        map.setCenter(map.createGeoPoint(53.464, -1.98));

        HeatMapLayer firstLayer = map.createHeatMapLayer();
        List<GeoPoint> data = HeatPoints.getFirstHeatLayer(map);
        firstLayer.setData(data);
        firstLayer.setMaxIntensity((double) 1);
        map.addHeatMapLayer(firstLayer);

        HeatMapLayer secondLayer = map.createHeatMapLayer();
        data = HeatPoints.getSecondHeatLayer(map);
        secondLayer.setData(data);
        secondLayer.setMaxIntensity((double) 8);
        map.addHeatMapLayer(secondLayer);
    }
}
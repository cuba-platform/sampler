package com.haulmont.sampler.web.ui.charts.map.polygon;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;

@UiController("polygon-map")
@UiDescriptor("polygon-map.xml")
public class PolygonMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setCenter(map.createGeoPoint(53.47006563435706, -2.17529296875));
        map.setZoom(11);
        List<GeoPoint> coordinates = PolygonPoints.getManchesterPoints(map);
        Polygon polygon = map.createPolygon(coordinates, "#9CFBA9", 0.6, "#2CA860", 1.0, 2);
        map.addPolygonOverlay(polygon);

        coordinates = PolygonPoints.getHydePoints(map);
        polygon = map.createPolygon(coordinates, "#0068A3", 0.6, "#081B42", 1.0, 2);
        polygon.setEditable(true);
        map.addPolygonOverlay(polygon);
    }
}
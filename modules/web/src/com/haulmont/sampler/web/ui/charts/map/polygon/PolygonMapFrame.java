package com.haulmont.sampler.web.ui.charts.map.polygon;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class PolygonMapFrame extends AbstractFrame {

    @Inject
    private MapViewer map;

    @Override
    public void init(Map<String, Object> params) {

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
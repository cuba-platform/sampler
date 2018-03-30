package com.haulmont.sampler.web.ui.charts.map.vertexremoval;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class VertexRemovalMapFrame extends AbstractFrame {

    @Inject
    private MapViewer map;

    @Override
    public void init(Map<String, Object> params) {
        map.setZoom(12);
        map.setCenter(map.createGeoPoint(53.365092, -2.231649));
        List<GeoPoint> coordinates = PolygonPoints.getAirportPoints(map);
        Polygon polygon = map.createPolygon(coordinates, "#0068A3", 0.6, "#081B42", 1.0, 2);
        polygon.setEditable(true);
        map.addPolygonOverlay(polygon);
        map.setVertexRemovingEnabled(true);
    }
}
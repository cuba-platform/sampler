package com.haulmont.sampler.web.ui.charts.map.vertexremoval;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polygon;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;

@UiController("vertex-removal-map")
@UiDescriptor("vertex-removal-map.xml")
public class VertexRemovalMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setZoom(12);
        map.setCenter(map.createGeoPoint(53.365092, -2.231649));
        List<GeoPoint> coordinates = PolygonPoints.getAirportPoints(map);
        Polygon polygon = map.createPolygon(coordinates, "#0068A3", 0.6, "#081B42", 1.0, 2);
        polygon.setEditable(true);
        map.addPolygonOverlay(polygon);
        map.setVertexRemovingEnabled(true);
    }
}
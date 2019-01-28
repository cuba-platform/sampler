package com.haulmont.sampler.web.ui.charts.map.polyline;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Polyline;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;

@UiController("polyline-map")
@UiDescriptor("polyline-map.xml")
public class PolylineMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setCenter(map.createGeoPoint(51.48068132423847, -0.1640009880065918));
        map.setZoom(17);

        List<GeoPoint> coordinates = PolylinePoints.getPolylinePoints(map);

        Polyline polyline = map.createPolyline(coordinates);
        polyline.setStrokeWeight(5);
        polyline.setStrokeOpacity(0.8);
        map.addPolyline(polyline);
    }
}
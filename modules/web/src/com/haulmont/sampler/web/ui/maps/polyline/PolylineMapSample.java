package com.haulmont.sampler.web.ui.maps.polyline;

import com.haulmont.addon.maps.gis.utils.GeometryUtils;
import com.haulmont.addon.maps.web.gui.components.CanvasLayer;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.PolylineStyle;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineString;

import javax.inject.Inject;

@UiController("polyline-map")
@UiDescriptor("polyline-map.xml")
public class PolylineMapSample extends ScreenFragment {

    @Inject
    private GeoMap map;

    @Subscribe
    protected void onInit(InitEvent event) {
        Coordinate[] coordinates = PolylinePoints.getPolylinePoints();
        LineString polyline = GeometryUtils.getGeometryFactory().createLineString(coordinates);

        CanvasLayer canvas = map.getCanvas();
        canvas.addPolyline(polyline)
                .setStyle(new PolylineStyle()
                        .setStrokeColor("#000")
                        .setStrokeWeight(5)
                        .setStrokeOpacity(0.8));
    }

}
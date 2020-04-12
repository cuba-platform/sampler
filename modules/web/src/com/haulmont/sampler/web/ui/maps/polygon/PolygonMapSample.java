package com.haulmont.sampler.web.ui.maps.polygon;

import com.haulmont.addon.maps.gis.utils.GeometryUtils;
import com.haulmont.addon.maps.web.gui.components.CanvasLayer;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.PolygonStyle;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Polygon;

import javax.inject.Inject;

@UiController("polygon-map")
@UiDescriptor("polygon-map.xml")
public class PolygonMapSample extends ScreenFragment {

    @Inject
    private GeoMap map;

    @Subscribe
    protected void onInit(InitEvent event) {
        CanvasLayer canvas = map.getCanvas();
        map.selectLayer(canvas);

        Coordinate[] coordinates = PolygonPoints.getManchesterPoints();
        Polygon polygon = GeometryUtils.getGeometryFactory().createPolygon(coordinates);
        canvas.addPolygon(polygon)
                .setStyle(new PolygonStyle()
                        .setFillColor("#9CFBA9")
                        .setFillOpacity(0.6)
                        .setStrokeColor("#2CA860")
                        .setStrokeOpacity(1.0)
                        .setStrokeWeight(2));

        coordinates = PolygonPoints.getHydePoints();
        polygon = GeometryUtils.getGeometryFactory().createPolygon(coordinates);
        canvas.addPolygon(polygon)
                .setStyle(new PolygonStyle()
                        .setFillColor("#0068A3")
                        .setFillOpacity(0.6)
                        .setStrokeColor("#081B42")
                        .setStrokeOpacity(1.0)
                        .setStrokeWeight(2))
                .setEditable(true);
    }
}
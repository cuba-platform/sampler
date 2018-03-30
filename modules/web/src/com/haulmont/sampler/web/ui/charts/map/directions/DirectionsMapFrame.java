package com.haulmont.sampler.web.ui.charts.map.directions;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.Polyline;
import com.haulmont.charts.gui.map.model.directions.DirectionsRequest;
import com.haulmont.charts.gui.map.model.directions.DirectionsRoute;
import com.haulmont.charts.gui.map.model.directions.DirectionsStatus;
import com.haulmont.charts.gui.map.model.directions.TravelMode;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class DirectionsMapFrame extends AbstractFrame {

    @Inject
    private MapViewer map;

    @Override
    public void init(Map<String, Object> params) {

        map.setZoom(10);
        map.setCenter(map.createGeoPoint(53.476475, -2.246761));

        addRoute();
    }

    private void addRoute() {
        DirectionsRequest request = map.createDirectionsRequest();
        request.setOrigin(map.createGeoPoint(53.40139, -2.22626));
        request.setDestination(map.createGeoPoint(53.61913, -2.14849));
        request.setTravelMode(TravelMode.DRIVING);

        map.route(request, (result, status) -> {
            if (status == DirectionsStatus.OK && result.getRoutes() != null && !result.getRoutes().isEmpty()) {
                DirectionsRoute route = result.getRoutes().get(0);
                Polyline routeLine = map.createPolyline(route.getOverviewPath());
                routeLine.setStrokeWeight(5);
                routeLine.setStrokeOpacity(0.8);
                map.addPolyline(routeLine);
            }
        });
    }
}
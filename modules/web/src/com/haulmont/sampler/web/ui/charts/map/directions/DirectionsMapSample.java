package com.haulmont.sampler.web.ui.charts.map.directions;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.Polyline;
import com.haulmont.charts.gui.map.model.directions.DirectionsRequest;
import com.haulmont.charts.gui.map.model.directions.DirectionsRoute;
import com.haulmont.charts.gui.map.model.directions.DirectionsStatus;
import com.haulmont.charts.gui.map.model.directions.TravelMode;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("directions-map")
@UiDescriptor("directions-map.xml")
public class DirectionsMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
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
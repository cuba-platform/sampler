package com.haulmont.sampler.web.ui.charts.map.marker;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.InfoWindow;
import com.haulmont.charts.gui.map.model.Marker;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("marker-map")
@UiDescriptor("marker-map.xml")
public class MarkerMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setCenter(map.createGeoPoint(53.590905, -2.24955));
        addMarker(53.590905, -2.24955);

        map.addMapClickListener(mapClickEvent ->
                addMarker(mapClickEvent.getPosition().getLatitude(), mapClickEvent.getPosition().getLongitude()));

        map.addMarkerClickListener(markerClickEvent -> {
            Marker marker = markerClickEvent.getMarker();
            String caption = String.format("Marker click: %.2f, %.2f",
                    marker.getPosition().getLatitude(),
                    marker.getPosition().getLongitude());
            InfoWindow infoWindow = map.createInfoWindow(caption, marker);
            map.openInfoWindow(infoWindow);
        });
    }

    private void addMarker(double latitude, double longitude) {
        Marker marker = map.createMarker("My place", map.createGeoPoint(latitude, longitude), true);
        marker.setClickable(true);
        map.addMarker(marker);
    }
}
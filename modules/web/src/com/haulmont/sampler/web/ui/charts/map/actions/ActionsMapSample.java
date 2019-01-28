package com.haulmont.sampler.web.ui.charts.map.actions;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("actions-map")
@UiDescriptor("actions-map.xml")
public class ActionsMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setCenter(map.createGeoPoint(53.490905, -2.249558));
        map.setZoom(8);
        addMapListeners();
    }

    private String string(GeoPoint p) {
        return p != null ? String.format("(%.2f, %.2f)", p.getLatitude(), p.getLongitude()) : "null";
    }

    private void addMapListeners() {
        map.addMapInitListener(event -> {
            String content = String.format("Map init. center: %s, zoom: %d, boundNE: %s, boundSW: %s",
                    string(event.getCenter()), event.getZoom(), string(event.getBoundNE()), string(event.getBoundSW()));
            notifications.create()
                    .withCaption(content)
                    .show();
        });

        map.addMapClickListener(event -> {
            String caption = String.format("Map left click: %.2f, %.2f", event.getPosition().getLatitude(),
                    event.getPosition().getLongitude());
            notifications.create()
                    .withCaption(caption)
                    .show();
        });

        map.addMapMoveListener(event -> {
            String content = "North-east bound: " + map.getBoundNorthEast().getLatitude() +
                    ", " + map.getBoundNorthEast().getLongitude() + "\n"
                    + "South-west bound: " + map.getBoundSouthWest().getLatitude() +
                    ", " + map.getBoundSouthWest().getLongitude() + "\n";
            notifications.create()
                    .withCaption("Map has been moved")
                    .withDescription(content)
                    .show();
        });

        map.addMapRightClickListener(mapRightClickEvent -> {
            String caption = String.format("Map right click: %.2f, %.2f", mapRightClickEvent.getPosition().getLatitude(),
                    mapRightClickEvent.getPosition().getLongitude());
            notifications.create()
                    .withCaption(caption)
                    .show();
        });
    }
}
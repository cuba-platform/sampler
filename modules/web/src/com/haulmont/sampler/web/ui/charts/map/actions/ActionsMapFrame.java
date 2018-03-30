package com.haulmont.sampler.web.ui.charts.map.actions;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class ActionsMapFrame extends AbstractFrame {

    @Inject
    private MapViewer map;

    @Override
    public void init(Map<String, Object> params) {
        map.setCenter(map.createGeoPoint(53.490905, -2.249558));
        map.setZoom(8);
        addMapListeners();
    }

    private String string(GeoPoint p) {
        return p != null ? String.format("(%.2f, %.2f)", p.getLatitude(), p.getLongitude()) : "null";
    }

    private void addMapListeners() {
        map.addMapInitListener((center, zoom, boundNE, boundSW) -> {
            String content = String.format("Map init. center: %s, zoom: %d, boundNE: %s, boundSW: %s",
                    string(center), zoom, string(boundNE), string(boundSW));
            showNotification(content, NotificationType.HUMANIZED);
        });

        map.addMapClickListener(event -> {
            String caption = String.format("Map left click: %.2f, %.2f", event.getPosition().getLatitude(),
                    event.getPosition().getLongitude());
            showNotification(caption, NotificationType.HUMANIZED);
        });

        map.addMapMoveListener(event -> {
            String content = "North-east bound: " + map.getBoundNorthEast().getLatitude() +
                    ", " + map.getBoundNorthEast().getLongitude() + "\n"
                    + "South-west bound: " + map.getBoundSouthWest().getLatitude() +
                    ", " + map.getBoundSouthWest().getLongitude() + "\n";
            showNotification("Map has been moved", content, NotificationType.HUMANIZED);
        });

        map.addMapRightClickListener(mapRightClickEvent -> {
            String caption = String.format("Map right click: %.2f, %.2f", mapRightClickEvent.getPosition().getLatitude(),
                    mapRightClickEvent.getPosition().getLongitude());
            showNotification(caption, NotificationType.HUMANIZED);
        });
    }
}
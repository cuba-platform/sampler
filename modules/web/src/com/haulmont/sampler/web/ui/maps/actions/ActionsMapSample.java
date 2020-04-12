package com.haulmont.sampler.web.ui.maps.actions;

import com.haulmont.addon.maps.web.gui.components.GeoMap;
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
    private GeoMap map;
    @Inject
    private Notifications notifications;

    @Subscribe("map")
    public void onMapClick(GeoMap.ClickEvent event) {
        String caption = String.format("Map left click: %.2f, %.2f", event.getPoint().getX(),
                event.getPoint().getY());
        notifications.create()
                .withCaption(caption)
                .show();
    }

    @Subscribe("map")
    public void onMapRightClick(GeoMap.RightClickEvent event) {
        String caption = String.format("Map right click: %.2f, %.2f", event.getPoint().getX(),
                event.getPoint().getY());
        notifications.create()
                .withCaption(caption)
                .show();
    }

    @Subscribe("map")
    public void onMapMoveEnd(GeoMap.MoveEndEvent event) {
        String content = String.format(
                "North-east bound: %.8f, %.8f\nSouth-west bound: %.8f, %.8f\nCenter: %.8f, %.8f\nZoom level: %s\n",
                map.getBounds().getNorthEast().getX(),
                map.getBounds().getNorthEast().getY(),
                map.getBounds().getSouthWest().getX(),
                map.getBounds().getSouthWest().getY(),
                event.getCenter().getX(),
                event.getCenter().getY(),
                event.getZoomLevel());
        notifications.create()
                .withCaption("Map has been moved")
                .withDescription(content)
                .show();
    }

    @Subscribe("map")
    public void onMapZoomEnd(GeoMap.ZoomEndEvent event) {
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Map has been zoomed")
                .show();
    }

    @Subscribe("map")
    public void onMapDragEnd(GeoMap.DragEndEvent event) {
        notifications.create(Notifications.NotificationType.TRAY)
                .withCaption("Map has been dragged")
                .show();
    }

}
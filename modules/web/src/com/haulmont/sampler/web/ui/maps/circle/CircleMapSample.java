package com.haulmont.sampler.web.ui.maps.circle;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.Circle;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("circle-map")
@UiDescriptor("circle-map.xml")
public class CircleMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setZoom(11);
        map.setCenter(map.createGeoPoint(53.79, -2.65));

        Circle circle = map.createCircle(map.createGeoPoint(53.79, -2.79), 3000);
        circle.setFillColor("#2222dd");
        circle.setFillOpacity(0.2);

        map.addCircleOverlay(circle);

        circle = map.createCircle(map.createGeoPoint(53.79, -2.5), 4000);
        circle.setEditable(true);
        circle.setFillColor("#22dd22");
        circle.setFillOpacity(0.2);

        map.addCircleOverlay(circle);
    }
}
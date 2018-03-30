package com.haulmont.sampler.web.ui.charts.map.circle;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.Circle;
import com.haulmont.cuba.gui.components.AbstractFrame;

import javax.inject.Inject;
import java.util.Map;

public class CircleMapFrame extends AbstractFrame {

    @Inject
    private MapViewer map;

    @Override
    public void init(Map<String, Object> params) {

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
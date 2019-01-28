package com.haulmont.sampler.web.ui.charts.map.label;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;
import com.haulmont.charts.gui.map.model.Label;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("label-map")
@UiDescriptor("label-map.xml")
public class LabelMapSample extends ScreenFragment {

    @Inject
    private MapViewer map;

    private GeoPoint labelPoint;

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setZoom(12);
        labelPoint = map.createGeoPoint(53.464087, -1.788697);
        map.setCenter(labelPoint);
        Label label = map.createLabel();
        label.setPosition(labelPoint);
        label.setValue(createLabelContent());
        label.setAdjustment(Label.Adjustment.MIDDLE_CENTER);
        label.setContentType(Label.ContentType.HTML);
        map.addLabel(label);

        map.addMapMoveListener(mapMoveEvent ->
                label.setValue(createLabelContent()));
    }

    private String createLabelContent() {
        return "<h1>Distance from this point to the current center: "
                + "<br>latitude: " + (labelPoint.getLatitude() - map.getCenter().getLatitude())
                + "<br>longitude: " + (labelPoint.getLongitude() - map.getCenter().getLongitude()) + "</h1>";
    }
}
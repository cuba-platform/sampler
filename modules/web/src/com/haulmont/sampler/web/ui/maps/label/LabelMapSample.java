package com.haulmont.sampler.web.ui.maps.label;

import com.haulmont.addon.maps.web.gui.components.CanvasLayer;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.DivPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("label-map")
@UiDescriptor("label-map.xml")
public class LabelMapSample extends ScreenFragment {

    @Inject
    private GeoMap map;

    private CanvasLayer.Point labelPoint;

    @Subscribe("map")
    public void onMapMoveEnd(GeoMap.MoveEndEvent event) {
        if (labelPoint == null) {
            labelPoint = map.getCanvas().addPoint(event.getCenter());
        }
        labelPoint.setStyle(new PointStyle(
                new DivPointIcon(createLabelContent(event.getCenter()))
                        .setIconSize(400, 80)
                        .setStyles("my-style")));
    }

    private String createLabelContent(Point center) {
        Point labelPointJts = (Point) labelPoint.getGeometry();
        return String.format(
                "<h1>Distance from this point to the current center: <br>latitude: %s<br>longitude: %s</h1>",
                BigDecimal.valueOf(labelPointJts.getY()).subtract(BigDecimal.valueOf(center.getY())),
                BigDecimal.valueOf(labelPointJts.getX()).subtract(BigDecimal.valueOf(center.getX())));
    }
}
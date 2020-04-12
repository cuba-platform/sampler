package com.haulmont.sampler.web.ui.maps.point;

import com.haulmont.addon.maps.gis.utils.GeometryUtils;
import com.haulmont.addon.maps.web.gui.components.CanvasLayer;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.layer.style.DivPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.FontPointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.ImagePointIcon;
import com.haulmont.addon.maps.web.gui.components.layer.style.PointStyle;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;

@UiController("point-map")
@UiDescriptor("point-map.xml")
public class PointMapSample extends ScreenFragment {

    @Inject
    private GeoMap map;

    private static void accept(CanvasLayer.Point.ModifiedEvent modifiedEvent) {
    }

    @Subscribe
    protected void onInit(InitEvent event) {
        map.setCenter(-2.24955, 53.590905);
        addPoint(-2.24955, 53.590905);

        CanvasLayer.Point pointWithFontIcon = addPoint(-1.54632, 53.79253);
        pointWithFontIcon.setStyle(
                new PointStyle(
                        new FontPointIcon(CubaIcon.CAR)
                                .setIconPathFillColor("#0004e0")
                                .setIconPathStrokeColor("#000")
                                .setIconTextFillColor("#fff")))
                .setPopupContent("Point with font icon");

        CanvasLayer.Point pointWithImageIcon = addPoint(-3.39477, 53.71946);
        pointWithImageIcon.setStyle(
                new PointStyle(
                        new ImagePointIcon("images/platform-logo.png")
                                .setIconSize(200, 34)
                                .setPopupAnchor(0, -17)))
                .setPopupContent("Point with image icon");

        CanvasLayer.Point pointWithDivIcon = addPoint(-3.60351, 53.43408);
        pointWithDivIcon.setStyle(
                new PointStyle(
                        new DivPointIcon("<font size=5 color='#fff' face='Courier'>Label icon</font>")
                                .setIconSize(150, 20)
                                .setPopupAnchor(0, -10)
                                .setStyles("my-div-style")))
                .setPopupContent("Point with div icon");
        map.getCanvas().addPointModifiedListener(PointMapSample::accept);
    }

    @Subscribe("map")
    public void onMapClick(GeoMap.ClickEvent event) {
        Point point = event.getPoint();
        addPoint(point.getX(), point.getY())
                .setTooltipContent("My place");
    }

    private CanvasLayer.Point addPoint(double longitude, double latitude) {
        CanvasLayer canvas = map.getCanvas();
        return canvas.addPoint(GeometryUtils.createPoint(longitude, latitude))
                .setEditable(true)
                .setPopupContent(String.format("Point: %.2f, %.2f", longitude, latitude));
    }
}
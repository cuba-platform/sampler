package com.haulmont.sampler.web.ui.maps.heat;

import com.haulmont.addon.maps.gis.utils.GeometryUtils;
import com.haulmont.addon.maps.web.gui.components.GeoMap;
import com.haulmont.addon.maps.web.gui.components.HeatMapOptions;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.locationtech.jts.geom.Point;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@UiController("heat-map")
@UiDescriptor("heat-map.xml")
public class HeatMapSample extends ScreenFragment {
    @Inject
    private GeoMap map;

    @Subscribe
    protected void onInit(InitEvent event) {
        HeatMapOptions options = new HeatMapOptions()
                .setMinOpacity(0.65)
                .setRadius(20)
                .setMaximumIntensity(1D)
                .setMaxZoom(15D);

        Map<Point, Double> pointIntensityMap = Arrays.stream(HeatPoints.getFirstHeatLayer()).collect(
                Collectors.toMap(coordinate -> GeometryUtils.getGeometryFactory().createPoint(coordinate),
                        coordinate -> 1D));

        map.addHeatMap(pointIntensityMap, options);

        options.setMaximumIntensity(2D);

        pointIntensityMap = Arrays.stream(HeatPoints.getSecondHeatLayer()).collect(
                Collectors.toMap(coordinate -> GeometryUtils.getGeometryFactory().createPoint(coordinate),
                        coordinate -> 1D));

        map.addHeatMap(pointIntensityMap, options);
    }
}
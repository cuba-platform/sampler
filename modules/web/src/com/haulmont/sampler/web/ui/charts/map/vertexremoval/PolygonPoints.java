package com.haulmont.sampler.web.ui.charts.map.vertexremoval;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;

import java.util.Arrays;
import java.util.List;

public class PolygonPoints {

    public static List<GeoPoint> getAirportPoints(MapViewer map) {
        return Arrays.asList(
                map.createGeoPoint(53.396636841332736, -2.2676467895507812),
                map.createGeoPoint(53.37820861585307, -2.2800064086914062),
                map.createGeoPoint(53.3728834210512, -2.2889328002929688),
                map.createGeoPoint(53.36223103384358, -2.296142578125),
                map.createGeoPoint(53.356903841363305, -2.2896194458007812),
                map.createGeoPoint(53.34809202306838, -2.2906494140625),
                map.createGeoPoint(53.3419431640244, -2.2789764404296875),
                map.createGeoPoint(53.34255808983304, -2.2621536254882812),
                map.createGeoPoint(53.337433437129675, -2.2546005249023438),
                map.createGeoPoint(53.32697723595273, -2.2460174560546875),
                map.createGeoPoint(53.32574692612833, -2.2254180908203125),
                map.createGeoPoint(53.33333327155682, -2.2175216674804688),
                map.createGeoPoint(53.343377977116916, -2.1979522705078125),
                map.createGeoPoint(53.35034638254107, -2.2020721435546875),
                map.createGeoPoint(53.361616391774945, -2.20001220703125),
                map.createGeoPoint(53.36714785122388, -2.2103118896484375),
                map.createGeoPoint(53.37575091637391, -2.2106552124023438),
                map.createGeoPoint(53.38660468562689, -2.2240447998046875),
                map.createGeoPoint(53.3982745197761, -2.2254180908203125),
                map.createGeoPoint(53.398069813417244, -2.2388076782226562),
                map.createGeoPoint(53.39458965465115, -2.250823974609375)
        );
    }
}
package com.haulmont.sampler.web.ui.charts.map.heat;

import com.haulmont.charts.gui.components.map.MapViewer;
import com.haulmont.charts.gui.map.model.GeoPoint;

import java.util.Arrays;
import java.util.List;

public class HeatPoints {

    public static List<GeoPoint> getFirstHeatLayer(MapViewer map) {
        return Arrays.asList(
                map.createGeoPoint(53.46408767296994, -1.9886970520019531),
                map.createGeoPoint(53.46470083596062, -1.989426612854004),
                map.createGeoPoint(53.465160702391685, -1.990971565246582),
                map.createGeoPoint(53.464598642743894, -1.9925594329833984),
                map.createGeoPoint(53.464445352457474, -1.990799903869629),
                map.createGeoPoint(53.46388328333828, -1.9923019409179688),
                map.createGeoPoint(53.46304016570603, -1.9920873641967773),
                map.createGeoPoint(53.46355114808806, -1.9908857345581055),
                map.createGeoPoint(53.46388328333828, -1.9895124435424805),
                map.createGeoPoint(53.464138770224096, -1.9884395599365234),
                map.createGeoPoint(53.46367889272259, -1.9873237609863281),
                map.createGeoPoint(53.46334675587328, -1.9886112213134766),
                map.createGeoPoint(53.46296351781824, -1.9898557662963867),
                map.createGeoPoint(53.46229923032746, -1.990971565246582),
                map.createGeoPoint(53.46296351781824, -1.9874095916748047),
                map.createGeoPoint(555553.46237587941455, -1.98891162872314455),
                map.createGeoPoint(53.46199263259525, -1.9907569885253906)
        );
    }

    public static List<GeoPoint> getSecondHeatLayer(MapViewer map) {
        return Arrays.asList(
                map.createGeoPoint(53.46595268290078, -1.9945764541625977),
                map.createGeoPoint(53.46577384988382, -1.9925165176391602),
                map.createGeoPoint(53.466642460337496, -1.9916152954101562),
                map.createGeoPoint(53.465824945108395, -1.9902420043945312),
                map.createGeoPoint(53.46559501611345, -1.9887399673461914),
                map.createGeoPoint(53.464905221656124, -1.987924575805664),
                map.createGeoPoint(53.46436870710672, -1.9861221313476562),
                map.createGeoPoint(53.463985478277124, -1.9850921630859375),
                map.createGeoPoint(53.46350005012661, -1.9829034805297852),
                map.createGeoPoint(53.46268247437912, -1.9842767715454102),
                map.createGeoPoint(53.46199263259525, -1.9856929779052734),
                map.createGeoPoint(53.46168603264886, -1.9861650466918945),
                map.createGeoPoint(53.46114947741487, -1.9896841049194336),
                map.createGeoPoint(53.460664016836425, -1.99127197265625),
                map.createGeoPoint(53.46107282611361, -1.9929027557373047),
                map.createGeoPoint(53.4618137828956, -1.9947052001953125),
                map.createGeoPoint(53.462759122774294, -1.9954347610473633),
                map.createGeoPoint(53.46347450112283, -1.9938468933105469),
                map.createGeoPoint(53.464470900876975, -1.9940614700317383)
        );
    }
}

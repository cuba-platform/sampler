package com.haulmont.sampler.entity;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "SAMPLER_LOCATION")
@Entity(name = "sampler_Location")
public class Location extends StandardEntity {
    private static final long serialVersionUID = 323042070278172012L;

    @Column(name = "NAME")
    protected String name;

    @MetaProperty(datatype = "GeoPoint")
    @Column(name = "POINT")
    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    protected Point point;

    @Column(name = "INTENSITY")
    protected Double intensity;

    public Double getIntensity() {
        return intensity;
    }

    public void setIntensity(Double intensity) {
        this.intensity = intensity;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
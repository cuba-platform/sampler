package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLER_POINT_VALUE")
@Entity(name = "sampler$PointValue")
public class PointValue extends StandardEntity {
    private static final long serialVersionUID = -2901960421510938379L;

    @Column(name = "X")
    protected Double x;

    @Column(name = "Y")
    protected Double y;

    @Column(name = "VALUE_")
    protected Integer value;

    public void setX(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getY() {
        return y;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


}
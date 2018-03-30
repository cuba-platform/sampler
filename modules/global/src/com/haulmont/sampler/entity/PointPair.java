package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLER_POINT_PAIR")
@Entity(name = "sampler$PointPair")
public class PointPair extends StandardEntity {
    private static final long serialVersionUID = 8539277499627353922L;

    @Column(name = "AX", nullable = false)
    protected Double ax;

    @Column(name = "AY", nullable = false)
    protected Double ay;

    @Column(name = "BX", nullable = false)
    protected Double bx;

    @Column(name = "BY_", nullable = false)
    protected Double by;

    public void setAx(Double ax) {
        this.ax = ax;
    }

    public Double getAx() {
        return ax;
    }

    public void setAy(Double ay) {
        this.ay = ay;
    }

    public Double getAy() {
        return ay;
    }

    public void setBx(Double bx) {
        this.bx = bx;
    }

    public Double getBx() {
        return bx;
    }

    public void setBy(Double by) {
        this.by = by;
    }

    public Double getBy() {
        return by;
    }
}
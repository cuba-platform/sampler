package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLER_TRANSPORT_COUNT")
@Entity(name = "sampler$TransportCount")
public class TransportCount extends StandardEntity {
    private static final long serialVersionUID = 6176228877405716101L;

    @Column(name = "YEAR_", nullable = false)
    protected Integer year;

    @Column(name = "CARS", nullable = false)
    protected Integer cars;

    @Column(name = "MOTORCYCLES", nullable = false)
    protected Integer motorcycles;

    @Column(name = "BICYCLES", nullable = false)
    protected Integer bicycles;

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setCars(Integer cars) {
        this.cars = cars;
    }

    public Integer getCars() {
        return cars;
    }

    public void setMotorcycles(Integer motorcycles) {
        this.motorcycles = motorcycles;
    }

    public Integer getMotorcycles() {
        return motorcycles;
    }

    public void setBicycles(Integer bicycles) {
        this.bicycles = bicycles;
    }

    public Integer getBicycles() {
        return bicycles;
    }
}
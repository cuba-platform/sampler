package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import java.util.Date;

@NamePattern("%s - %s - %s|date,value,volume")
@MetaClass(name = "sampler$DateValueVolume")
public class DateValueVolume extends BaseUuidEntity {

    private static final long serialVersionUID = 1644204809967660606L;

    @MetaProperty(mandatory = true)
    protected Date date;

    @MetaProperty(mandatory = true)
    protected Long value;

    @MetaProperty(mandatory = true)
    protected Long volume;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "DateValueVolume{" +
                "date=" + date +
                ", value=" + value +
                ", volume=" + volume +
                '}';
    }
}
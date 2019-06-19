package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import java.util.Date;

@NamePattern("%s %s %s|date,value,gap")
@MetaClass(name = "sampler_DateValueGap")
public class DateValueGap extends BaseUuidEntity {
    private static final long serialVersionUID = -8667642826827916337L;

    @MetaProperty
    protected Date date;

    @MetaProperty
    protected Long value;

    @MetaProperty
    protected Boolean gap;

    public Boolean getGap() {
        return gap;
    }

    public void setGap(Boolean gap) {
        this.gap = gap;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
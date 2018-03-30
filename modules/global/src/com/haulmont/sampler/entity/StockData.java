package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import java.util.Date;

@MetaClass(name = "sampler$StockData")
public class StockData extends BaseUuidEntity {

    private static final long serialVersionUID = 3542845288990992596L;

    @MetaProperty
    private Date date;

    @MetaProperty
    private Long value;

    @MetaProperty
    private Long volume;

    @MetaProperty
    private Long open;

    @MetaProperty
    private Long close;

    @MetaProperty
    private Long high;

    @MetaProperty
    private Long low;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public Long getClose() {
        return close;
    }

    public void setClose(Long close) {
        this.close = close;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "date=" + date +
                ", value=" + value +
                ", volume=" + volume +
                ", open=" + open +
                ", close=" + close +
                ", high=" + high +
                ", low=" + low +
                '}';
    }
}
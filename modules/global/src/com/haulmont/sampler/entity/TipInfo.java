package com.haulmont.sampler.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "SAMPLER_TIP_INFO")
@Entity(name = "sampler$TipInfo")
public class TipInfo extends StandardEntity {
    private static final long serialVersionUID = -3547513826393999071L;

    @Column(name = "TOTAL_BILL", nullable = false)
    protected BigDecimal totalBill;

    @Column(name = "TIP", nullable = false)
    protected BigDecimal tip;

    @Column(name = "SMOKER", nullable = false)
    protected Boolean smoker = false;

    @Column(name = "SIZE_", nullable = false)
    protected Integer size;

    @Column(name = "SEX", nullable = false)
    protected String sex;

    @Column(name = "DAY_", nullable = false)
    protected String day;

    @Column(name = "TIME_", nullable = false)
    protected String time;

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public void setDay(Day day) {
        this.day = day == null ? null : day.getId();
    }

    public Day getDay() {
        return day == null ? null : Day.fromId(day);
    }

    public void setTime(Time time) {
        this.time = time == null ? null : time.getId();
    }

    public Time getTime() {
        return time == null ? null : Time.fromId(time);
    }

    public void setTotalBill(BigDecimal totalBill) {
        this.totalBill = totalBill;
    }

    public BigDecimal getTotalBill() {
        return totalBill;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setSmoker(Boolean smoker) {
        this.smoker = smoker;
    }

    public Boolean getSmoker() {
        return smoker;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
}
package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "SAMPLER_DATE_SEGMENT")
@Entity(name = "sampler$DateSegment")
public class DateSegment extends StandardEntity {
    private static final long serialVersionUID = 178671269800913506L;

    @Temporal(TemporalType.DATE)
    @Column(name = "START_")
    protected Date start;

    @Temporal(TemporalType.DATE)
    @Column(name = "END_")
    protected Date end;

    @Column(name = "COLOR")
    protected String color;

    @Column(name = "TASK_")
    protected String task;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_SPAN_ID")
    protected DateTaskSpan taskSpan;

    public void setTaskSpan(DateTaskSpan taskSpan) {
        this.taskSpan = taskSpan;
    }

    public DateTaskSpan getTaskSpan() {
        return taskSpan;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getStart() {
        return start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnd() {
        return end;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
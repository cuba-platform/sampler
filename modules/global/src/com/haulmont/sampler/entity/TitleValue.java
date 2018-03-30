package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s - %s|title,value")
@Table(name = "SAMPLER_TITLE_VALUE")
@Entity(name = "sampler$TitleValue")
public class TitleValue extends StandardEntity {
    private static final long serialVersionUID = -6869960530604243160L;

    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Column(name = "VALUE_", nullable = false)
    protected Integer value;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
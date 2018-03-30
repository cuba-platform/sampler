package com.haulmont.sampler.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

@MetaClass(name = "sampler$ValueDescription")
public class ValueDescription extends BaseUuidEntity {

    private static final long serialVersionUID = 8637601007414788070L;

    @MetaProperty(mandatory = true)
    protected Integer value;

    @MetaProperty(mandatory = true)
    protected String description;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
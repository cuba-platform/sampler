package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "SAMPLER_COLOR")
@Entity(name = "sampler$Color")
public class Color extends StandardEntity {
    private static final long serialVersionUID = -1981383843541262219L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "HEX")
    protected String hex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }


}
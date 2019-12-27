package com.haulmont.sampler.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

public enum Experience implements EnumClass<Integer> {

    COMMON(10),
    HIGH(20);

    private Integer id;

    Experience(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Experience fromId(Integer id) {
        for (Experience at : Experience.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
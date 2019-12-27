package com.haulmont.sampler.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

public enum Department implements EnumClass<Integer> {

    ACCOUNTING(10),
    PRODUCTION(20);

    private Integer id;

    Department(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Department fromId(Integer id) {
        for (Department at : Department.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
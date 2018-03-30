package com.haulmont.sampler.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;


public enum Direction implements EnumClass<String>{

    N("N"),
    NE("NE"),
    E("E"),
    SE("SE"),
    S("S"),
    SW("SW"),
    W("W"),
    NW("NW");

    private String id;

    Direction (String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    public static Direction fromId(String id) {
        for (Direction at : Direction.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
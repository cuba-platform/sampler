package com.haulmont.sampler.web.ui.components.table.formatter;

import com.haulmont.cuba.gui.components.Formatter;

public class LowercaseFormatter implements Formatter<String> {

    @Override
    public String format(String value) {
        return value.toLowerCase();
    }
}

package com.haulmont.sampler.web.ui.components.datagrid.formatter;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Formatter;

public class DataGridFormatterFrame extends AbstractFrame {

    public static class UppercaseFormatter implements Formatter<String> {
        @Override
        public String format(String value) {
            return value.toUpperCase();
        }
    }
}
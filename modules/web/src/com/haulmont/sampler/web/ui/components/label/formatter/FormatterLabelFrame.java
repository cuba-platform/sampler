package com.haulmont.sampler.web.ui.components.label.formatter;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Label;

import javax.inject.Inject;
import java.util.Map;

public class FormatterLabelFrame extends AbstractLookup {
    @Inject
    private Label dateLabel;
    @Inject
    private Label numberLabel;
    @Inject
    private TimeSource timeSource;

    @Override
    public void init(Map<String, Object> params) {
        dateLabel.setValue(timeSource.currentTimestamp());
        numberLabel.setValue(timeSource.currentTimeMillis());
    }
}
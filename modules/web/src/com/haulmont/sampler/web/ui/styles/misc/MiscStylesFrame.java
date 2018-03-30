package com.haulmont.sampler.web.ui.styles.misc;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.ProgressBar;

import javax.inject.Inject;
import java.util.Date;
import java.util.Map;

public class MiscStylesFrame extends AbstractFrame {
    @Inject
    private ProgressBar defaultPB;
    @Inject
    private ProgressBar pointPB;
    @Inject
    private DateField dateField;

    @Override
    public void init(Map<String, Object> params) {
        defaultPB.setValue(0.4f);
        pointPB.setValue(0.8f);

        dateField.setValue(new Date());
    }
}

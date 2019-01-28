package com.haulmont.sampler.web.ui.components.label.formatter;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Date;

@UiController("formatter-label")
@UiDescriptor("formatter-label.xml")
public class FormatterLabelSample extends ScreenFragment {
    @Inject
    private Label<Date> dateLabel;
    @Inject
    private Label<Long> numberLabel;
    @Inject
    private TimeSource timeSource;

    @Subscribe
    protected void onInit(InitEvent event) {
        dateLabel.setValue(timeSource.currentTimestamp());
        numberLabel.setValue(timeSource.currentTimeMillis());
    }
}
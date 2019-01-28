package com.haulmont.sampler.web.ui.styles.misc;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.ProgressBar;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Date;

@UiController("styles-misc")
@UiDescriptor("styles-misc.xml")
public class StylesMiscSample extends ScreenFragment {
    @Inject
    private ProgressBar defaultPB;
    @Inject
    private ProgressBar pointPB;
    @Inject
    private DateField<Date> dateField;

    @Inject
    private TimeSource timeSource;

    @Subscribe
    protected void onInit(InitEvent event) {
        defaultPB.setValue(0.4);
        pointPB.setValue(0.8);

        dateField.setValue(timeSource.currentTimestamp());
    }
}

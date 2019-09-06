package com.haulmont.sampler.web;

import com.haulmont.cuba.web.AppUI;
import com.haulmont.sampler.web.config.SamplesAppConfig;
import com.vaadin.server.VaadinRequest;
import org.vaadin.googleanalytics.tracking.GoogleAnalyticsTracker;

import javax.inject.Inject;

public class SamplerAppUI extends AppUI {

    @Inject
    private SamplesAppConfig samplesAppConfig;

    private GoogleAnalyticsTracker tracker;

    public static SamplerAppUI getCurrent() {
        return (SamplerAppUI) AppUI.getCurrent();
    }

    @Override
    protected void init(VaadinRequest request) {
        tracker = new GoogleAnalyticsTracker(
                samplesAppConfig.getGoogleAnalyticsTrackerTrackerId(),
                samplesAppConfig.getGoogleAnalyticsTrackerDomainName(),
                "/sampler/");
        tracker.extend(this);

        super.init(request);
    }

    public GoogleAnalyticsTracker getGoogleAnalyticsTracker() {
        return tracker;
    }
}

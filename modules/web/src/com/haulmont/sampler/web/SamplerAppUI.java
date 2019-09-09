package com.haulmont.sampler.web;

import com.haulmont.cuba.web.AppUI;
import com.haulmont.cuba.web.controllers.ControllerUtils;
import com.haulmont.sampler.web.config.SamplesAppConfig;
import com.vaadin.server.VaadinRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.googleanalytics.tracking.GoogleAnalyticsTracker;

import javax.annotation.Nullable;
import javax.inject.Inject;

public class SamplerAppUI extends AppUI {

    private static Logger log = LoggerFactory.getLogger(SamplerAppUI.class);

    @Inject
    private SamplesAppConfig samplesAppConfig;

    private GoogleAnalyticsTracker tracker;

    public static SamplerAppUI getCurrent() {
        return (SamplerAppUI) AppUI.getCurrent();
    }

    @Override
    protected void init(VaadinRequest request) {
        initGoogleAnalyticsTracker();

        super.init(request);
    }

    private void initGoogleAnalyticsTracker() {
        if (!samplesAppConfig.isGoogleAnalyticsTrackerEnabled()) {
            log.info("GoogleAnalyticsTracker disabled");
            return;
        }

        String trackerId = samplesAppConfig.getGoogleAnalyticsTrackerId();
        String domainName = samplesAppConfig.getGoogleAnalyticsTrackerDomainName();
        tracker = new GoogleAnalyticsTracker(trackerId, domainName, "/sampler/");
        tracker.setUniversalTracking(false);
        tracker.extend(this);

        log.info("GoogleAnalyticsTracker enabled. Tracker Id: {}, Domain Name: {}", trackerId, domainName);
    }

    @Nullable
    public GoogleAnalyticsTracker getGoogleAnalyticsTracker() {
        return tracker;
    }
}

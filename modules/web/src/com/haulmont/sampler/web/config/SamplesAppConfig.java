package com.haulmont.sampler.web.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.Default;
import com.haulmont.cuba.core.config.defaults.DefaultBoolean;

@Source(type = SourceType.APP)
public interface SamplesAppConfig extends Config{

    @Property("sampler.developerMode")
    @DefaultBoolean(true)
    boolean isDeveloperMode();

    @Property("sampler.googleAnalyticsTracker.enabled")
    @DefaultBoolean(false)
    boolean isGoogleAnalyticsTrackerEnabled();

    @Property("sampler.googleAnalyticsTracker.trackerId")
    String getGoogleAnalyticsTrackerId();

    @Property("sampler.googleAnalyticsTracker.domainName")
    @Default("none")
    String getGoogleAnalyticsTrackerDomainName();
}
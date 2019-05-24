package com.haulmont.sampler.web;

import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.security.auth.LoginPasswordCredentials;
import com.haulmont.cuba.web.Connection;
import com.haulmont.cuba.web.security.events.AppStartedEvent;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppStartedEventListener implements ApplicationListener<AppStartedEvent> {

    @Override
    public void onApplicationEvent(AppStartedEvent event) {
        if (!BooleanUtils.toBoolean(AppContext.getProperty("sampler.developerMode"))) {
            Connection connection = event.getApp().getConnection();
            if (!connection.isAuthenticated()) {
                Locale locale = event.getApp().getLocale();
                LoginPasswordCredentials credentials = new LoginPasswordCredentials("demo", "cuba123", locale);
                connection.login(credentials);
            }
        }
    }
}

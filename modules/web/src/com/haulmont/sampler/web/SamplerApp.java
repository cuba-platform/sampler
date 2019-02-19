package com.haulmont.sampler.web;

import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.security.auth.LoginPasswordCredentials;
import com.haulmont.cuba.security.global.LoginException;
import com.haulmont.cuba.web.Connection;
import com.haulmont.cuba.web.DefaultApp;
import com.haulmont.cuba.web.security.events.AppStartedEvent;
import com.haulmont.cuba.web.sys.RedirectHandler;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.context.event.EventListener;

import java.util.Locale;

public class SamplerApp extends DefaultApp {

    @Override
    protected String routeTopLevelWindowId() {
        if (BooleanUtils.toBoolean(AppContext.getProperty("sampler.developerMode"))) {
            return super.routeTopLevelWindowId();
        }

        return "mainWindow";
    }

    public RedirectHandler getRedirectHandler() {
        return redirectHandler;
    }

    @EventListener
    protected void onAppStarted(AppStartedEvent event) throws LoginException {
        Connection connection = event.getApp().getConnection();
        if (!connection.isAuthenticated()) {
            Locale locale = event.getApp().getLocale();
            LoginPasswordCredentials credentials = new LoginPasswordCredentials("demo", "cuba123", locale);
            connection.login(credentials);
        }
    }
}
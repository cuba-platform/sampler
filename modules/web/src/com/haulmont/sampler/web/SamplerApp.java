package com.haulmont.sampler.web;

import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.web.DefaultApp;
import com.haulmont.cuba.web.sys.RedirectHandler;
import org.apache.commons.lang3.BooleanUtils;

public class SamplerApp extends DefaultApp {

    private RedirectHandler redirectHandler;

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

    public void setRedirectHandler(RedirectHandler redirectHandler) {
        this.redirectHandler = redirectHandler;
    }
}
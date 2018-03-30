package com.haulmont.sampler.service;

import com.haulmont.cuba.core.global.ClientType;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.security.app.UserSettingServiceBean;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.entity.UserSetting;

import javax.inject.Inject;

public class DemoUserSettingService extends UserSettingServiceBean {

    @Inject
    protected UserSessionSource userSessionSource;

    @Inject
    protected Metadata metadata;

    @Override
    public void saveSetting(ClientType clientType, String name, String value) {
        if (userSessionSource.getUserSession().isEntityOpPermitted(metadata.getClassNN(UserSetting.class), EntityOp.UPDATE)) {
            super.saveSetting(clientType, name, value);
        }
    }
}

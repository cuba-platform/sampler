package com.haulmont.sampler.web.exception;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.web.App;
import com.haulmont.cuba.web.exception.AbstractExceptionHandler;
import com.vaadin.ui.Notification;
import org.apache.commons.lang.StringUtils;

/**
 * @author gorelov
 */
public class SamplerHsqlExceptionHandler extends AbstractExceptionHandler {

    public SamplerHsqlExceptionHandler() {
        super("org.hsqldb.HsqlException");
    }

    @Override
    protected void doHandle(App app, String className, String message, Throwable throwable) {
        Messages messages = AppBeans.get(Messages.NAME);
        String msg = messages.getMainMessage("readOnly.message");
        Notification.show(msg, Notification.Type.ERROR_MESSAGE);
    }

    @Override
    protected boolean canHandle(String className, String message, Throwable throwable) {
        return StringUtils.containsIgnoreCase(message, "read-only SQL-transaction");
    }
}

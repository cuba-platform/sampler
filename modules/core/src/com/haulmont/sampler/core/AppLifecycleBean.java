package com.haulmont.sampler.core;

import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.sys.ServletContextHolder;
import com.haulmont.cuba.core.sys.events.AppContextInitializedEvent;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Component
public class AppLifecycleBean {

    private static final Logger log = LoggerFactory.getLogger(AppLifecycleBean.class);

    @Inject
    protected GlobalConfig globalConfig;

    @EventListener
    protected void appStarted(AppContextInitializedEvent event) {
        ServletContext context = ServletContextHolder.getServletContext();
        String dataDir = globalConfig.getDataDir();

        InputStream platformLogoStream = context.getResourceAsStream("/WEB-INF/filestorage/2015/04/01/61a6a1ee-f13a-f44f-0201-c2f9b3288305.png");
        try {
            File dest = new File(dataDir + "/filestorage/2015/04/01/61a6a1ee-f13a-f44f-0201-c2f9b3288305.png");
            FileUtils.copyInputStreamToFile(platformLogoStream, dest);
        } catch (IOException e) {
            log.error("Cannot copy 61a6a1ee-f13a-f44f-0201-c2f9b3288305.png", e);
        }

        InputStream customerStandardStream = context.getResourceAsStream("/WEB-INF/filestorage/2017/07/19/efc56835-5f5c-6614-bf74-e26e48e2ac5f.svg");
        try {
            File dest = new File(dataDir + "/filestorage/2017/07/19/efc56835-5f5c-6614-bf74-e26e48e2ac5f.svg");
            FileUtils.copyInputStreamToFile(customerStandardStream, dest);
        } catch (IOException e) {
            log.error("Cannot copy efc56835-5f5c-6614-bf74-e26e48e2ac5f.svg", e);
        }

        InputStream cubaLogoStream = context.getResourceAsStream("/WEB-INF/filestorage/2017/07/19/a2ba9e37-9f05-3ee3-4041-e838d505415c.png");
        try {
            File dest = new File(dataDir + "/filestorage/2017/07/19/a2ba9e37-9f05-3ee3-4041-e838d505415c.png");
            FileUtils.copyInputStreamToFile(cubaLogoStream, dest);
        } catch (IOException e) {
            log.error("Cannot copy a2ba9e37-9f05-3ee3-4041-e838d505415c.png", e);
        }
    }
}

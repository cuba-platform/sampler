package com.haulmont.sampler.web.sys;

import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.screen.OpenMode;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.haulmont.cuba.web.App;
import com.haulmont.cuba.web.AppUI;
import com.haulmont.cuba.web.sys.LinkHandler;
import com.haulmont.sampler.web.app.mainwindow.SamplerMainWindow;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Map;

import static com.haulmont.cuba.gui.screen.FrameOwner.WINDOW_CLOSE_ACTION;

public class SamplerLinkHandler extends LinkHandler {
    @Inject
    private SamplesHelper samplesHelper;
    @Inject
    private SamplesMenuConfig samplesMenuConfig;

    private static final Logger log = LoggerFactory.getLogger(SamplerLinkHandler.class);

    public SamplerLinkHandler(App app, String action, Map<String, String> requestParams) {
        super(app, action, requestParams);
    }

    @Override
    public void handle() {
        String screenName = requestParams.get("screen");
        if (screenName == null) {
            log.warn("ScreenId not found in request parameters");
            return;
        }
        // clear requestParams, because after refreshing page this screen always shown
        requestParams.clear();

        MenuItem item = samplesMenuConfig.findItemById(screenName);
        if (item == null) {
            super.handle();
            return;
        }

        Screens.OpenedScreens openedScreens = AppUI.getCurrent().getScreens().getOpenedScreens();
        Screen rootScreen = openedScreens.getRootScreen();
        if (!item.isMenu()) {
            ScreenOptions screenOptions = samplesHelper.getScreenOptions(item);
            AppUI.getCurrent().getScreens()
                    .create(samplesHelper.getSampleBrowserId(), OpenMode.NEW_TAB, screenOptions)
                    .show();
            if (rootScreen instanceof SamplerMainWindow) {
                ((SamplerMainWindow) rootScreen).expandItemsFromDirectLink(item.getId());
            }
        } else if (samplesMenuConfig.isRootItem(item.getId())) {
            if (rootScreen instanceof SamplerMainWindow) {
                openedScreens.getAll().forEach(screen ->
                        screen.close(WINDOW_CLOSE_ACTION));

                ((SamplerMainWindow) rootScreen).initDashboardByRootItemId(item.getId());
                ((SamplerMainWindow) rootScreen).expandItemsFromDirectLink(item.getId());
            }
        }
    }
}

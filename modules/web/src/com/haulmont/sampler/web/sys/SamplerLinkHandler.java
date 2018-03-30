package com.haulmont.sampler.web.sys;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.Window;
import com.haulmont.cuba.web.App;
import com.haulmont.cuba.web.sys.LinkHandler;
import com.haulmont.sampler.web.app.mainwindow.SamplerMainWindow;
import com.haulmont.sampler.web.util.SamplesHelper;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author gorelov
 */
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

        Window.TopLevelWindow window = App.getInstance().getTopLevelWindow();
        if (!item.isMenu()) {
            Map<String, Object> params = samplesHelper.getParams(item);
            App.getInstance().getWindowManager()
                    .openWindow(samplesHelper.getSampleBrowser(), WindowManager.OpenType.NEW_TAB, params);
            if (window instanceof SamplerMainWindow) {
                ((SamplerMainWindow) window).expandItemsFromDirectLink(item.getId());
            }
        } else {
            if (samplesMenuConfig.isRootItem(item.getId())) {
                if (window instanceof SamplerMainWindow) {
                    window.getWindowManager().getOpenWindows().forEach(
                            openWindow -> openWindow.close(Window.CLOSE_ACTION_ID));
                    ((SamplerMainWindow) window).initDashboardByRootItemId(item.getId());
                    ((SamplerMainWindow) window).expandItemsFromDirectLink(item.getId());
                }
            }
        }
    }
}

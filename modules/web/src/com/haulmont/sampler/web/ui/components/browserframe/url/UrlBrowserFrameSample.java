package com.haulmont.sampler.web.ui.components.browserframe.url;

import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.UrlResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;

@UiController("url-browserframe")
@UiDescriptor("url-browserframe.xml")
public class UrlBrowserFrameSample extends ScreenFragment {

    @Inject
    private BrowserFrame browserFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        URL url = null;
        try {
            url = new URL("https://doc.cuba-platform.com/manual-7.2/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        browserFrame.setSource(UrlResource.class).setUrl(url);
    }
}

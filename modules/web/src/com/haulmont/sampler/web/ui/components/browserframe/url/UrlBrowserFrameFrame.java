package com.haulmont.sampler.web.ui.components.browserframe.url;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.UrlResource;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class UrlBrowserFrameFrame extends AbstractFrame {

    @Inject
    private BrowserFrame browserFrame;

    @Override
    public void init(Map<String, Object> params) {
        URL url = null;
        try {
            url = new URL("https://doc.cuba-platform.com/manual-6.9/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        browserFrame.setSource(UrlResource.class).setUrl(url);
    }
}

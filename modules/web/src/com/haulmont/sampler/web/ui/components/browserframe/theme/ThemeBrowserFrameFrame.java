package com.haulmont.sampler.web.ui.components.browserframe.theme;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.ThemeResource;

import javax.inject.Inject;
import java.util.Map;

public class ThemeBrowserFrameFrame extends AbstractFrame {

    @Inject
    private BrowserFrame browserFrame;

    @Override
    public void init(Map<String, Object> params) {
        browserFrame.setSource(ThemeResource.class).setPath("../halo/files/cuba-hands-on-lab.pdf");
    }
}

package com.haulmont.sampler.web.ui.components.browserframe.relative;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.RelativePathResource;

import javax.inject.Inject;
import java.util.Map;

public class RelativeBrowserFrameFrame extends AbstractFrame {

    @Inject
    private BrowserFrame browserFrame;

    @Override
    public void init(Map<String, Object> params) {
        browserFrame.setSource(RelativePathResource.class).setPath("VAADIN/themes/halo/files/cuba-hands-on-lab.pdf");
    }
}

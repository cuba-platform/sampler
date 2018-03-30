package com.haulmont.sampler.web.ui.components.browserframe.classpath;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.ClasspathResource;

import javax.inject.Inject;
import java.util.Map;

public class ClasspathBrowserFrameFrame extends AbstractFrame {

    @Inject
    private BrowserFrame browserFrame;

    @Override
    public void init(Map<String, Object> params) {
        browserFrame.setSource(ClasspathResource.class)
                .setPath("/com/haulmont/sampler/web/ui/components/browserframe/classpath/cart-info.html");
    }
}

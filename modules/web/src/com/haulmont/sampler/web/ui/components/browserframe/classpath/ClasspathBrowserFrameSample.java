package com.haulmont.sampler.web.ui.components.browserframe.classpath;

import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.ClasspathResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("classpath-browserframe")
@UiDescriptor("classpath-browserframe.xml")
public class ClasspathBrowserFrameSample extends ScreenFragment {

    @Inject
    private BrowserFrame browserFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        browserFrame.setSource(ClasspathResource.class)
                .setPath("/com/haulmont/sampler/web/ui/components/browserframe/classpath/cart-info.html");
    }
}

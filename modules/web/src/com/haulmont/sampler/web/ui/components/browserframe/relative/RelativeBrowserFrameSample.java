package com.haulmont.sampler.web.ui.components.browserframe.relative;

import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.RelativePathResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("relative-browserframe")
@UiDescriptor("relative-browserframe.xml")
public class RelativeBrowserFrameSample extends ScreenFragment {

    @Inject
    private BrowserFrame browserFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        browserFrame.setSource(RelativePathResource.class).setPath("VAADIN/themes/halo/files/cuba-hands-on-lab.pdf");
    }
}

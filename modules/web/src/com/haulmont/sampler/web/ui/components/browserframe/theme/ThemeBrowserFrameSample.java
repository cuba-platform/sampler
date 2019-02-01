package com.haulmont.sampler.web.ui.components.browserframe.theme;

import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.ThemeResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("theme-browserframe")
@UiDescriptor("theme-browserframe.xml")
public class ThemeBrowserFrameSample extends ScreenFragment {

    @Inject
    private BrowserFrame browserFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        browserFrame.setSource(ThemeResource.class).setPath("files/cuba-hands-on-lab.pdf");
    }
}

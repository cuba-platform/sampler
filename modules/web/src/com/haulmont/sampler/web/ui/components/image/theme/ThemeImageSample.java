package com.haulmont.sampler.web.ui.components.image.theme;

import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.ThemeResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("theme-image")
@UiDescriptor("theme-image.xml")
public class ThemeImageSample extends ScreenFragment {

    @Inject
    private Image programmaticImage;

    @Subscribe
    protected void onInit(InitEvent event) {
        programmaticImage.setSource(ThemeResource.class).setPath("images/platform-logo.png");
    }
}
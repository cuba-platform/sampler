package com.haulmont.sampler.web.ui.components.image.relativepath;

import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.RelativePathResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("relativepath-image")
@UiDescriptor("relativepath-image.xml")
public class RelativePathImageSample extends ScreenFragment {

    @Inject
    private Image programmaticImage;

    @Subscribe
    protected void onInit(InitEvent event) {
        programmaticImage.setSource(RelativePathResource.class)
                .setPath("VAADIN/themes/halo/images/platform-logo.png");
    }
}
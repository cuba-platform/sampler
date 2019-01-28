package com.haulmont.sampler.web.ui.components.image.classpath;

import com.haulmont.cuba.gui.components.ClasspathResource;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("classpath-image")
@UiDescriptor("classpath-image.xml")
public class ClassPathImageSample extends ScreenFragment {

    @Inject
    private Image programmaticImage;

    @Subscribe
    protected void onInit(InitEvent event) {
        programmaticImage.setSource(ClasspathResource.class)
                .setPath("/com/haulmont/sampler/web/ui/components/image/classpath/platform-logo.png");
    }
}
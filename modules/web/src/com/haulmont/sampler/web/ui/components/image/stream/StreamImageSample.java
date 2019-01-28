package com.haulmont.sampler.web.ui.components.image.stream;

import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.StreamResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("stream-image")
@UiDescriptor("stream-image.xml")
public class StreamImageSample extends ScreenFragment {

    @Inject
    private Image image;

    @Subscribe
    protected void onInit(InitEvent event) {
        image.setSource(StreamResource.class).
                setStreamSupplier(() -> getClass().getResourceAsStream("cuba-logo.png"));
    }
}
package com.haulmont.sampler.web.ui.components.image.stream;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.StreamResource;

import javax.inject.Inject;
import java.util.Map;

public class StreamImageFrame extends AbstractFrame {

    @Inject
    private Image image;

    @Override
    public void init(Map<String, Object> params) {
        image.setSource(StreamResource.class).
                setStreamSupplier(() -> getClass().getResourceAsStream("cuba-logo.png"));
    }
}
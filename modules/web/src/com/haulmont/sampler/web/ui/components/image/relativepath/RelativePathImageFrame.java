package com.haulmont.sampler.web.ui.components.image.relativepath;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.RelativePathResource;

import javax.inject.Inject;
import java.util.Map;

public class RelativePathImageFrame extends AbstractFrame {

    @Inject
    private Image programmaticImage;

    @Override
    public void init(Map<String, Object> params) {
        programmaticImage.setSource(RelativePathResource.class)
                .setPath("VAADIN/themes/halo/images/platform-logo.png");
    }
}
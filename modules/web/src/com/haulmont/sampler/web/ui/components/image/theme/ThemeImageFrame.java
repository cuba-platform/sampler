package com.haulmont.sampler.web.ui.components.image.theme;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.ThemeResource;

import javax.inject.Inject;
import java.util.Map;

public class ThemeImageFrame extends AbstractFrame {

    @Inject
    private Image programmaticImage;

    @Override
    public void init(Map<String, Object> params) {
        programmaticImage.setSource(ThemeResource.class).setPath("images/platform-logo.png");
    }
}
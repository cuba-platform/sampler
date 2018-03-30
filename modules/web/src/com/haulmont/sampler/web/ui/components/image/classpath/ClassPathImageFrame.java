package com.haulmont.sampler.web.ui.components.image.classpath;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.ClasspathResource;
import com.haulmont.cuba.gui.components.Image;

import javax.inject.Inject;
import java.util.Map;

public class ClassPathImageFrame extends AbstractFrame {

    @Inject
    private Image programmaticImage;

    @Override
    public void init(Map<String, Object> params) {
        programmaticImage.setSource(ClasspathResource.class)
                .setPath("/com/haulmont/sampler/web/ui/components/image/classpath/platform-logo.png");
    }
}
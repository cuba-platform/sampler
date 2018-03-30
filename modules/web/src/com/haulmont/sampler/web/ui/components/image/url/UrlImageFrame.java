package com.haulmont.sampler.web.ui.components.image.url;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.UrlResource;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class UrlImageFrame extends AbstractFrame {

    @Inject
    private Image programmaticImage;

    @Override
    public void init(Map<String, Object> params) {
        String address = "https://www.cuba-platform.com/sites/all/themes/cuba_adaptive/img/upper-header-logo.png";
        URL url = null;

        try {
            url = new URL(address);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        programmaticImage.setSource(UrlResource.class).setUrl(url);
    }
}
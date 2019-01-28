package com.haulmont.sampler.web.ui.components.image.url;

import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.UrlResource;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;

@UiController("url-image")
@UiDescriptor("url-image.xml")
public class UrlImageSample extends ScreenFragment {

    @Inject
    private Image programmaticImage;

    @Subscribe
    protected void onInit(InitEvent event) {
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
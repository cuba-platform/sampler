package com.haulmont.sampler.web.ui.components.currencyfield.simple;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Product;

import javax.inject.Inject;

@UiController("simple-currencyfield")
@UiDescriptor("simple-currencyfield.xml")
public class SimpleCurrencyFieldSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Product> productDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Product product = metadata.create(Product.class);
        productDc.setItem(product);
    }
}

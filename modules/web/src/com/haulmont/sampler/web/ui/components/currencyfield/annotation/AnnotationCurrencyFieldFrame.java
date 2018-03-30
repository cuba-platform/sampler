package com.haulmont.sampler.web.ui.components.currencyfield.annotation;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Product;

import javax.inject.Inject;
import java.util.Map;

public class AnnotationCurrencyFieldFrame extends AbstractFrame {

    @Inject
    private Datasource<Product> productDs;

    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Product product = metadata.create(Product.class);
        productDs.setItem(product);
    }
}

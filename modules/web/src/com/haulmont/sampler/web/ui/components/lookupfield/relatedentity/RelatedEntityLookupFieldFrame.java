package com.haulmont.sampler.web.ui.components.lookupfield.relatedentity;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Map;

public class RelatedEntityLookupFieldFrame extends AbstractFrame {

    @Inject
    private Datasource<Order> orderDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDs.setItem(order);

        orderDs.addItemPropertyChangeListener(e -> {
            Object str = e.getValue() instanceof Entity ? ((Entity) e.getValue()).getInstanceName() : e.getValue();
            showNotification(e.getProperty() + " = " + str, NotificationType.HUMANIZED);
        });
    }
}
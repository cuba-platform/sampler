package com.haulmont.sampler.web.ui.components.fieldgroup.simple;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Map;

public class SimpleFieldGroupFrame extends AbstractFrame {

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
    }

    public void showOrder() {
        Order order = orderDs.getItem();
        StringBuilder sb = new StringBuilder();
        sb.append("date = ").append(order.getDate()).append("\n");
        sb.append("customer = ").append(order.getCustomer() != null
                ? order.getCustomer().getInstanceName()
                : null)
                .append("\n");
        sb.append("amount = ").append(order.getAmount()).append("\n");
        sb.append("description = ").append(order.getDescription());
        showNotification(sb.toString(), NotificationType.HUMANIZED);
    }
}
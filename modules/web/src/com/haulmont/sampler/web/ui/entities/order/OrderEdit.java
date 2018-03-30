package com.haulmont.sampler.web.ui.entities.order;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.Order;
import com.haulmont.sampler.entity.OrderItem;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class OrderEdit extends AbstractEditor<Order> {
    @Inject
    private CollectionDatasource<OrderItem, UUID> invoiceDs;

    @Override
    public void init(Map<String, Object> params) {
        invoiceDs.addCollectionChangeListener(e1 -> calculateAmount());
        invoiceDs.addItemPropertyChangeListener(e -> calculateAmount());
    }

    private void calculateAmount() {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderItem invoice : invoiceDs.getItems()) {
            amount = amount.add(invoice.getProduct().getPrice().multiply(invoice.getQuantity()));
        }
        getItem().setAmount(amount);
    }
}
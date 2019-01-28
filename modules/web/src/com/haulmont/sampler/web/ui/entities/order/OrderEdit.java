package com.haulmont.sampler.web.ui.entities.order;

import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;
import com.haulmont.sampler.entity.OrderItem;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("sampler$Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Inject
    private CollectionContainer<OrderItem> itemsDc;

    @Subscribe(id = "itemsDc", target = Target.DATA_CONTAINER)
    protected void onItemsDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderItem> event) {
        calculateAmount();
    }

    @Subscribe(id = "itemsDc", target = Target.DATA_CONTAINER)
    protected void onItemsDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<OrderItem> event) {
        calculateAmount();
    }

    private void calculateAmount() {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderItem invoice : itemsDc.getItems()) {
            amount = amount.add(invoice.getProduct().getPrice().multiply(invoice.getQuantity()));
        }
        getEditedEntity().setAmount(amount);
    }
}
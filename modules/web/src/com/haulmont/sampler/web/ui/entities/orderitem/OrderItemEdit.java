package com.haulmont.sampler.web.ui.entities.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.OrderItem;

@UiController("sampler$OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {
}
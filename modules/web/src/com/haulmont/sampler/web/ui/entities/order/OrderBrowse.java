package com.haulmont.sampler.web.ui.entities.order;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;

@UiController("sampler$Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}
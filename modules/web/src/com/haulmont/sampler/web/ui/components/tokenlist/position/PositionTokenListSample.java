package com.haulmont.sampler.web.ui.components.tokenlist.position;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("position-tokenlist")
@UiDescriptor("position-tokenlist.xml")
@LoadDataBeforeShow
public class PositionTokenListSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);
    }
}
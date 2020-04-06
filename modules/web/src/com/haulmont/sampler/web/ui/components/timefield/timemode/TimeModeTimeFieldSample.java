package com.haulmont.sampler.web.ui.components.timefield.timemode;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("timemode-timefield")
@UiDescriptor("timemode-timefield.xml")
public class TimeModeTimeFieldSample extends ScreenFragment {
    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private Metadata metadata;
    @Inject
    private TimeSource timeSource;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        order.setCreateTs(timeSource.currentTimestamp());
        orderDc.setItem(order);
    }
}
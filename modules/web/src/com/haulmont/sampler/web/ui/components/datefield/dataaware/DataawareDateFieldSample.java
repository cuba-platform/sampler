package com.haulmont.sampler.web.ui.components.datefield.dataaware;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Date;

@UiController("dataaware-datefield")
@UiDescriptor("dataaware-datefield.xml")
public class DataawareDateFieldSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Order> ordersDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        order.setDate(new Date());
        ordersDc.setItem(order);
    }
}
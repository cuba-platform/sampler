package com.haulmont.sampler.web.ui.styles.inputfields.withactions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.List;

@UiController("styles-input-fields-with-actions")
@UiDescriptor("styles-input-fields-with-actions.xml")
@LoadDataBeforeShow
public class StylesWithActionsInputFieldsSample extends ScreenFragment {
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

    @Subscribe(id = "customersDc", target = Target.DATA_CONTAINER)
    protected void onCustomersDcCollectionChange(CollectionContainer.CollectionChangeEvent<Customer> event) {
        if (CollectionChangeType.REFRESH.equals(event.getChangeType())) {
            List<Customer> items = event.getSource().getItems();
            orderDc.getItem().setCustomer(items.isEmpty() ? null : items.get(0));
        }
    }
}

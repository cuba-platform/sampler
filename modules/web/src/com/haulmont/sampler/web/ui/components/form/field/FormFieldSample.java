package com.haulmont.sampler.web.ui.components.form.field;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("form-field")
@UiDescriptor("form-field.xml")
public class FormFieldSample extends ScreenFragment {
    @Inject
    private InstanceContainer<Order> orderDc;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;
    @Inject
    private Metadata metadata;

    @Subscribe
    private void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);
    }

    @Subscribe("showOrderBtn")
    private void onShowOrderBtnClick(Button.ClickEvent event) {
        Order order = orderDc.getItem();
        String sb = "<strong>date:</strong> " + order.getDate() + "<br>" +
                "<strong>customer:</strong> " + (order.getCustomer() != null
                ? metadataTools.getInstanceName(order.getCustomer())
                : null) + "<br>" +
                "<strong>amount:</strong> " + order.getAmount() + "<br>" +
                "<strong>description:</strong> " + order.getDescription();

        notifications.create()
                .withCaption(sb)
                .withContentMode(ContentMode.HTML)
                .show();
    }
}
package com.haulmont.sampler.web.ui.components.fieldgroup.customize;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

public class CustomizeFieldGroupFrame extends AbstractFrame {

    @Named("orderFieldGroup.customer")
    private PickerField customerField;
    @Inject
    private Datasource<Order> orderDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        Order order = metadata.create(Order.class);
        orderDs.setItem(order);

        customerField.removeAllActions();
        customerField.addLookupAction();
        customerField.addOpenAction();
    }
}
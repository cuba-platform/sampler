package com.haulmont.sampler.web.ui.styles.inputfields.withactions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class StylesWithActionsInputFieldsFrame extends AbstractFrame {
    @Inject
    private Datasource<Order> orderDs;
    @Inject
    private CollectionDatasource<Customer, UUID> customersDs;
    @Inject
    private Metadata metadata;

    @Inject
    private LookupField lookupFieldAlignCenter;
    @Inject
    private LookupField lookupFieldAlignRight;
    @Inject
    private LookupField lookupFieldBorderless;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDs.setItem(order);

        customersDs.refresh();
        Iterator<Customer> iterator = customersDs.getItems().iterator();
        order.setCustomer(iterator.hasNext() ? iterator.next() : null);

        lookupFieldAlignCenter.setValue(iterator.hasNext() ? iterator.next() : null);
        lookupFieldAlignRight.setValue(iterator.hasNext() ? iterator.next() : null);
        lookupFieldBorderless.setValue(iterator.hasNext() ? iterator.next() : null);
    }
}

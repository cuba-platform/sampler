package com.haulmont.sampler.web.ui.components.lookupfield.customoptions;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.*;

public class CustomOptionsLookupFieldFrame extends AbstractFrame {

    @Inject
    private LookupField ageLookup;
    @Inject
    private LookupField amountLookup;
    @Inject
    private LookupField gradleLookup;
    @Inject
    private Datasource<Customer> customerDs;
    @Inject
    private Datasource<Order> orderDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDs.setItem(order);
        Customer customer = metadata.create(Customer.class);
        customerDs.setItem(customer);

        List<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.valueOf(1000));
        list.add(BigDecimal.valueOf(2000));
        list.add(BigDecimal.valueOf(3000));
        list.add(BigDecimal.valueOf(4000));
        amountLookup.setOptionsList(list);

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        ageLookup.setOptionsMap(map);

        gradleLookup.setOptionsEnum(CustomerGrade.class);

        orderDs.addItemPropertyChangeListener(new ItemPropertyChangeListener<>());
        customerDs.addItemPropertyChangeListener(new ItemPropertyChangeListener<>());
    }

    private class ItemPropertyChangeListener<T extends Entity> implements Datasource.ItemPropertyChangeListener<T> {
        @Override
        public void itemPropertyChanged(Datasource.ItemPropertyChangeEvent<T> e) {
            String msg = e.getItem().getClass().getSimpleName() + "." + e.getProperty() + " = " + e.getValue();
            showNotification(msg, NotificationType.HUMANIZED);
        }
    }
}
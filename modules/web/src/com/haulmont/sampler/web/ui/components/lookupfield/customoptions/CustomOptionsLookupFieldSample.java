package com.haulmont.sampler.web.ui.components.lookupfield.customoptions;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.CustomerGrade;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@UiController("custom-options-lookupfield")
@UiDescriptor("custom-options-lookupfield.xml")
public class CustomOptionsLookupFieldSample extends ScreenFragment {

    @Inject
    private LookupField<Integer> ageLookup;
    @Inject
    private LookupField<BigDecimal> amountLookup;
    @Inject
    private LookupField<CustomerGrade> gradleLookup;

    @Inject
    private InstanceContainer<Customer> customerDc;
    @Inject
    private InstanceContainer<Order> orderDc;

    @Inject
    private Metadata metadata;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);
        Customer customer = metadata.create(Customer.class);
        customerDc.setItem(customer);

        List<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.valueOf(1000));
        list.add(BigDecimal.valueOf(2000));
        list.add(BigDecimal.valueOf(3000));
        list.add(BigDecimal.valueOf(4000));
        amountLookup.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        ageLookup.setOptionsMap(map);
    }

    @Subscribe(id = "orderDc", target = Target.DATA_CONTAINER)
    protected void onOrderDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Order> event) {
        itemPropertyChanged(event);
    }

    @Subscribe(id = "customerDc", target = Target.DATA_CONTAINER)
    protected void onCustomerDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Customer> event) {
        itemPropertyChanged(event);
    }

    private void itemPropertyChanged(InstanceContainer.ItemPropertyChangeEvent<? extends Entity> event) {
        String msg = event.getItem().getClass().getSimpleName() + "." + event.getProperty() + " = " + event.getValue();
        notifications.create()
                .withCaption(msg)
                .show();
    }
}
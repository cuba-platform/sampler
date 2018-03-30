package com.haulmont.sampler.web.ui.components.pickerfield.actions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;
import java.util.Map;

public class ActionsPickerFieldFrame extends AbstractFrame {

    @Inject
    private PickerField pickerField;
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


        pickerField.addAction(new BaseAction("showGrade") {
            @Override
            public void actionPerform(Component component) {
                Customer customer = pickerField.getValue();
                if (customer != null)
                    showNotification(customer.getName() + "'s grade is " + customer.getGrade(), NotificationType.HUMANIZED);
                else
                    showNotification("Choose a customer", NotificationType.HUMANIZED);
            }

            @Override
            public String getIcon() {
                return "icons/user-group-ok.png";
            }
        });

        PickerField.ClearAction clearAction = pickerField.addClearAction();
        clearAction.setIcon("icons/cancel.png");
    }

    public void greet() {
        Customer customer = pickerField.getValue();
        if (customer != null)
            showNotification("Hello, " + customer.getName(), NotificationType.HUMANIZED);
        else
            showNotification("Choose a customer", NotificationType.HUMANIZED);
    }
}
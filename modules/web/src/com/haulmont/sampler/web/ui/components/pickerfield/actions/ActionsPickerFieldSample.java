package com.haulmont.sampler.web.ui.components.pickerfield.actions;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.actions.picker.ClearAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Actions;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;
import com.haulmont.sampler.entity.Order;

import javax.inject.Inject;

@UiController("actions-pickerfield")
@UiDescriptor("actions-pickerfield.xml")
public class ActionsPickerFieldSample extends ScreenFragment {

    @Inject
    private PickerField<Customer> pickerField;
    @Inject
    private InstanceContainer<Order> orderDc;

    @Inject
    private Metadata metadata;
    @Inject
    private Notifications notifications;
    @Inject
    private Actions actions;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Order order = metadata.create(Order.class);
        orderDc.setItem(order);

        pickerField.addAction(new BaseAction("showGrade")
                .withHandler(actionPerformedEvent -> {
                    Customer customer = pickerField.getValue();
                    if (customer != null) {
                        notifications.create()
                                .withCaption(customer.getName() + "'s grade is " + customer.getGrade())
                                .show();
                    } else {
                        notifications.create()
                                .withCaption("Choose a customer")
                                .show();
                    }
                })
                .withIcon("icons/user-group-ok.png")
        );

        Action clearAction = actions.create(ClearAction.ID);
        clearAction.setIcon("icons/cancel.png");
        pickerField.addAction(clearAction);
    }

    @Subscribe("pickerField.greeting")
    protected void onPickerFieldGreetingActionPerformed(Action.ActionPerformedEvent event) {
        Customer customer = pickerField.getValue();
        if (customer != null)
            notifications.create()
                    .withCaption("Hello, " + customer.getName())
                    .show();
        else
            notifications.create()
                    .withCaption("Choose a customer")
                    .show();
    }
}
package com.haulmont.sampler.web.ui.components.twincolumn.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.TwinColumn;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Collection;

public class SimpleTwinColumnFrame extends AbstractFrame {

    @Inject
    private TwinColumn twinColumn;

    public void showValue() {
        StringBuilder sb = new StringBuilder();
        Collection<Customer> value = twinColumn.getValue();
        if (value == null) {
            sb.append("null");
        } else {
            for (Customer customer : value) {
                sb.append(customer.getInstanceName()).append("\n");
            }
        }
        showNotification(sb.toString(), NotificationType.HUMANIZED);
    }
}

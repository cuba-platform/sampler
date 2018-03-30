package com.haulmont.sampler.web.ui.components.table.style;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.sampler.entity.Customer;
import org.apache.commons.lang.BooleanUtils;

import javax.inject.Inject;
import java.util.Map;

public class StyleTableFrame extends AbstractFrame {

    @Inject
    private Table<Customer> customerTable;

    @Override
    public void init(Map<String, Object> params) {
        customerTable.setStyleProvider((entity, property) -> {
            if (property == null) {
                if (BooleanUtils.isTrue(entity.getActive())) {
                    return "active-customer";
                }
            } else if (property.equals("grade")) {
                switch (entity.getGrade()) {
                    case PREMIUM:
                        return "premium-grade";
                    case HIGH:
                        return "high-grade";
                    case STANDARD:
                        return "standard-grade";
                    default:
                        return null;
                }
            }
            return null;
        });
    }
}
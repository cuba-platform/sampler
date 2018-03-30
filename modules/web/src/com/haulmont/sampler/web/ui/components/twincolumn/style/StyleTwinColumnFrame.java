package com.haulmont.sampler.web.ui.components.twincolumn.style;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.TwinColumn;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class StyleTwinColumnFrame extends AbstractFrame {

    @Inject
    private TwinColumn twinColumn;

    @Override
    public void init(Map<String, Object> params) {
        twinColumn.setStyleProvider(new TwinColumn.StyleProvider() {
            @Override
            public String getStyleName(Entity item, Object property, boolean selected) {
                Customer customer = (Customer) item;
                switch (customer.getGrade()) {
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

            @Override
            public String getItemIcon(Entity item, boolean selected) {
                return "icons/save.png";
            }
        });
    }
}
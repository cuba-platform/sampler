package com.haulmont.sampler.web.ui.components.table.icon;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.sampler.entity.Customer;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.util.Map;

public class IconTableFrame extends AbstractFrame {

    @Inject
    private Table<Customer> customerTable;

    @Override
    public void init(Map<String, Object> params) {
        customerTable.setIconProvider(new Table.IconProvider<Customer>() {
            @Nullable
            @Override
            public String getItemIcon(Customer entity) {
                return entity.getActive() ? "icons/ok.png" : "icons/cancel.png";
            }
        });
    }
}
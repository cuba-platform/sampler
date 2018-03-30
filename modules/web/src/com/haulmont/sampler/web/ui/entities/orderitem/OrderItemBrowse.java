package com.haulmont.sampler.web.ui.entities.orderitem;

import com.haulmont.cuba.gui.WindowParams;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.sampler.entity.OrderItem;

import javax.inject.Inject;
import java.util.Map;

public class OrderItemBrowse extends AbstractLookup {

    @Inject
    private Table<OrderItem> orderItemsTable;

    @Override
    public void init(Map<String, Object> params) {
        if (WindowParams.MULTI_SELECT.getBool(getContext())) {
            orderItemsTable.setMultiSelect(true);
        }
    }
}
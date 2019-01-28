package com.haulmont.sampler.web.ui.entities.orderitem;

import com.haulmont.cuba.gui.WindowParams;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.OrderItem;

import javax.inject.Inject;

@UiController("sampler$OrderItem.browse")
@UiDescriptor("order-item-browse.xml")
@LookupComponent("orderItemsTable")
@LoadDataBeforeShow
public class OrderItemBrowse extends StandardLookup<OrderItem> {
    @Inject
    private Table<OrderItem> orderItemsTable;

    @Subscribe
    protected void onInit(InitEvent event) {
        MapScreenOptions options = (MapScreenOptions) event.getOptions();
        if (Boolean.TRUE.equals(options.getParams().get(WindowParams.MULTI_SELECT.name()))) {
            orderItemsTable.setMultiSelect(true);
        }
    }
}
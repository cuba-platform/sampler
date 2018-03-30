package com.haulmont.sampler.web.ui.components.datagrid.detailsgenerator;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.sampler.entity.Order;
import com.haulmont.sampler.entity.OrderItem;
import com.haulmont.sampler.service.DataGridDetailsGeneratorService;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DataGridDetailsGeneratorFrame extends AbstractFrame {

    @Inject
    private DataGrid<Order> ordersDataGrid;
    @Inject
    private ComponentsFactory factory;
    @Inject
    private DataGridDetailsGeneratorService service;

    @Override
    public void init(Map<String, Object> params) {
        ordersDataGrid.setDetailsGenerator(new DataGrid.DetailsGenerator<Order>() {
            @Nullable
            @Override
            public Component getDetails(Order entity) {
                VBoxLayout mainLayout = factory.createComponent(VBoxLayout.class);
                mainLayout.setWidth("100%");
                mainLayout.setMargin(true);

                HBoxLayout headerBox = factory.createComponent(HBoxLayout.class);
                headerBox.setWidth("100%");

                Label infoLabel = factory.createComponent(Label.class);
                infoLabel.setHtmlEnabled(true);
                infoLabel.setStyleName("h1");
                infoLabel.setValue("Order info:");

                Component closeButton = createCloseButton(entity);
                headerBox.add(infoLabel);
                headerBox.add(closeButton);
                headerBox.expand(infoLabel);

                Component content = getContent(entity);

                mainLayout.add(headerBox);
                mainLayout.add(content);
                mainLayout.expand(content);

                return mainLayout;
            }
        });

        ordersDataGrid.setItemClickAction(new BaseAction("itemClickAction") {
            @Override
            public void actionPerform(Component component) {
                ordersDataGrid.setDetailsVisible(ordersDataGrid.getSingleSelected(), true);
            }
        });
    }

    private Component getContent(Order entity) {
        Label content = factory.createComponent(Label.class);
        content.setHtmlEnabled(true);

        StringBuilder sb = new StringBuilder();
        sb.append("<table cellspacing=3px cellpadding=3px>")
          .append("<tr>")
          .append("<th>Product</th>")
          .append("<th>Quantity</th>")
          .append("<th>Price</th>")
          .append("<th>Total</th>")
          .append("</tr>");

        List<OrderItem> orderItems = service.loadOrderItemsById(entity.getId());
        for (OrderItem item : orderItems) {
            sb.append("<tr>");
            sb.append("<td>").append(item.getProduct().getInstanceName()).append("</td>");
            sb.append("<td>").append(item.getQuantity().setScale(0, BigDecimal.ROUND_HALF_UP)).append("</td>");
            sb.append("<td>").append(item.getProduct().getPrice()).append("</td>");

            BigDecimal total = item.getQuantity().multiply(item.getProduct().getPrice());
            total = total.setScale(2, BigDecimal.ROUND_HALF_UP);
            sb.append("<td>").append(total).append("</td>");
            sb.append("</tr>");
        }

        sb.append("<tr>")
          .append("<th>Total:</th>")
          .append("<th></th>").append("<th></th>")
          .append("<th>").append(entity.getAmount()).append("</th>")
          .append("</tr>")
          .append("</table>");

        content.setValue(sb.toString());

        return content;
    }

    private Component createCloseButton(Order entity) {
        Button closeButton = factory.createComponent(Button.class);
        closeButton.setIcon("icons/close.png");
        BaseAction closeAction = new BaseAction("closeAction") {
            @Override
            public void actionPerform(Component component) {
                ordersDataGrid.setDetailsVisible(entity, false);
            }
        };
        closeAction.withCaption("");
        closeButton.setAction(closeAction);
        return closeButton;
    }
}
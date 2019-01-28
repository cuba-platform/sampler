package com.haulmont.sampler.web.ui.components.datagrid.detailsgenerator;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Order;
import com.haulmont.sampler.entity.OrderItem;
import com.haulmont.sampler.service.DataGridDetailsGeneratorService;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@UiController("datagrid-detailsgenerator")
@UiDescriptor("datagrid-detailsgenerator.xml")
@LoadDataBeforeShow
public class DataGridDetailsGeneratorSample extends ScreenFragment {

    @Inject
    private DataGrid<Order> ordersDataGrid;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private DataGridDetailsGeneratorService service;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        ordersDataGrid.setItemClickAction(new BaseAction("itemClickAction")
                .withHandler(actionPerformedEvent ->
                        ordersDataGrid.setDetailsVisible(ordersDataGrid.getSingleSelected(), true)));
    }

    @Install(to = "ordersDataGrid", subject = "detailsGenerator")
    protected Component ordersDataGridDetailsGenerator(Order order) {
        VBoxLayout mainLayout = uiComponents.create(VBoxLayout.class);
        mainLayout.setWidth("100%");
        mainLayout.setMargin(true);

        HBoxLayout headerBox = uiComponents.create(HBoxLayout.class);
        headerBox.setWidth("100%");

        Label<String> infoLabel = uiComponents.create(Label.TYPE_STRING);
        infoLabel.setHtmlEnabled(true);
        infoLabel.setStyleName("h1");
        infoLabel.setValue("Order info:");

        Component closeButton = createCloseButton(order);
        headerBox.add(infoLabel);
        headerBox.add(closeButton);
        headerBox.expand(infoLabel);

        Component content = getContent(order);

        mainLayout.add(headerBox);
        mainLayout.add(content);
        mainLayout.expand(content);

        return mainLayout;
    }

    private Component getContent(Order entity) {
        Label<String> content = uiComponents.create(Label.TYPE_STRING);
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
            sb.append("<td>").append(metadataTools.getInstanceName(item.getProduct())).append("</td>");
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
        Button closeButton = uiComponents.create(Button.class);
        closeButton.setIcon("icons/close.png");
        BaseAction closeAction = new BaseAction("closeAction")
                .withHandler(actionPerformedEvent ->
                        ordersDataGrid.setDetailsVisible(entity, false))
                .withCaption("");
        closeButton.setAction(closeAction);
        return closeButton;
    }
}
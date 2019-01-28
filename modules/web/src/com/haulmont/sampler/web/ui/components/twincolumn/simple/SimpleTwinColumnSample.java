package com.haulmont.sampler.web.ui.components.twincolumn.simple;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.TwinColumn;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Collection;

@UiController("simple-twincolumn")
@UiDescriptor("simple-twincolumn.xml")
@LoadDataBeforeShow
public class SimpleTwinColumnSample extends ScreenFragment {

    @Inject
    private TwinColumn<Customer> twinColumn;
    @Inject
    private Notifications notifications;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        StringBuilder sb = new StringBuilder();
        Collection<Customer> value = twinColumn.getValue();
        if (value == null) {
            sb.append("null");
        } else {
            for (Customer customer : value) {
                sb.append(metadataTools.getInstanceName(customer))
                        .append("\n");
            }
        }
        notifications.create()
                .withCaption(sb.toString())
                .show();
    }
}

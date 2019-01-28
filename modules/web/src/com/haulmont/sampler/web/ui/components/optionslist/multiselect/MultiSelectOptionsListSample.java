package com.haulmont.sampler.web.ui.components.optionslist.multiselect;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Product;

import javax.inject.Inject;
import java.util.Collection;

@UiController("multiselect-optionslist")
@UiDescriptor("multiselect-optionslist.xml")
@LoadDataBeforeShow
public class MultiSelectOptionsListSample extends ScreenFragment {
    @Inject
    private Notifications notifications;

    @Subscribe("optionsList")
    protected void onOptionsGroupValueChange(HasValue.ValueChangeEvent<Collection<Product>> event) {
        String str = event.getValue() != null
                ? String.valueOf(event.getValue().size())
                : "0";

        notifications.create()
                .withCaption("Selected items: " + str)
                .show();
    }
}
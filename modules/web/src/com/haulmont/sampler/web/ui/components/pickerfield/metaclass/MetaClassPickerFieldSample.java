package com.haulmont.sampler.web.ui.components.pickerfield.metaclass;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("metaclass-pickerfield")
@UiDescriptor("metaclass-pickerfield.xml")
public class MetaClassPickerFieldSample extends ScreenFragment {

    @Inject
    private MetadataTools metadataTools;
    @Inject
    private Notifications notifications;

    @Subscribe("picker")
    protected void onPickerValueChange(HasValue.ValueChangeEvent<Customer> event) {
        String str = event.getValue() == null ? "null" : metadataTools.getInstanceName(event.getValue());
        notifications.create()
                .withCaption("value = " + str)
                .show();
    }
}

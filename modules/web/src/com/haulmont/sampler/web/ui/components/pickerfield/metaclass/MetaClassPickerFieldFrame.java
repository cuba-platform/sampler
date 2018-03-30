package com.haulmont.sampler.web.ui.components.pickerfield.metaclass;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.PickerField;

import javax.inject.Inject;
import java.util.Map;

public class MetaClassPickerFieldFrame extends AbstractFrame {

    @Inject
    private PickerField picker;

    @Override
    public void init(Map<String, Object> params) {
        picker.addValueChangeListener(e -> {
            String str = e.getValue() == null ? "null" : ((Entity) e.getValue()).getInstanceName();
            showNotification("value = " + str, NotificationType.HUMANIZED);
        });
    }
}

package com.haulmont.sampler.web.ui.components.optionsgroup.multiselect;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.OptionsGroup;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;

public class MultiSelectOptionsGroupFrame extends AbstractFrame {

    @Inject
    private OptionsGroup optionsGroup;

    @Override
    public void init(Map<String, Object> params) {
        optionsGroup.addValueChangeListener(e -> {
            String str = e.getValue() == null ? "0" : String.valueOf(((Collection) e.getValue()).size());
            showNotification("selected: " + str, NotificationType.HUMANIZED);
        });
    }
}

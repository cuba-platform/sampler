package com.haulmont.sampler.web.ui.components.optionslist.multiselect;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.OptionsList;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;

public class MultiSelectOptionsListFrame extends AbstractFrame {
    @Inject
    private OptionsList optionsList;

    @Override
    public void init(Map<String, Object> params) {
        optionsList.addValueChangeListener(e -> {
            String str = e.getValue() == null ? "0" : String.valueOf(((Collection) e.getValue()).size());
            showNotification("selected: " + str, NotificationType.HUMANIZED);
        });
    }
}
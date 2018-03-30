package com.haulmont.sampler.web.ui.components.contexthelp.fieldgroupclick;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Named;
import java.util.Map;

public class ContextHelpFieldGroupClickFrame extends AbstractFrame {

    @Named("fieldGroup.name")
    private TextField nameField;

    @Named("fieldGroup.active")
    private CheckBox activeField;

    @Override
    public void init(Map<String, Object> params) {
        nameField.setContextHelpIconClickHandler(event ->
                showNotification(event.getSource().getContextHelpText(), NotificationType.HUMANIZED)
        );

        activeField.setContextHelpIconClickHandler(event ->
                showMessageDialog("Title", event.getSource().getContextHelpText(), MessageType.CONFIRMATION_HTML)
        );
    }
}
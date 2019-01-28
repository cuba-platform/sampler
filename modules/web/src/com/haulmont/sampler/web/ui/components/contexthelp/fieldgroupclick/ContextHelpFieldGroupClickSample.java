package com.haulmont.sampler.web.ui.components.contexthelp.fieldgroupclick;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

public class ContextHelpFieldGroupClickSample extends AbstractFrame {

    @Named("fieldGroup.name")
    private TextField<String> nameField;
    @Named("fieldGroup.active")
    private CheckBox activeField;

    @Inject
    private Notifications notifications;
    @Inject
    private Dialogs dialogs;

    @Override
    public void init(Map<String, Object> params) {
        nameField.setContextHelpIconClickHandler(event ->
                notifications.create()
                        .withCaption(event.getSource().getContextHelpText())
                        .show()
        );

        activeField.setContextHelpIconClickHandler(event ->
                dialogs.createMessageDialog()
                        .withCaption("Title")
                        .withMessage(event.getSource().getContextHelpText())
                        .withType(Dialogs.MessageType.CONFIRMATION)
                        .withContentMode(ContentMode.HTML)
                        .show()
        );
    }
}
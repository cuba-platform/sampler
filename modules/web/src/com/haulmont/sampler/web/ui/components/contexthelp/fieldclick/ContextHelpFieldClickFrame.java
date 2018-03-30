package com.haulmont.sampler.web.ui.components.contexthelp.fieldclick;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class ContextHelpFieldClickFrame extends AbstractFrame {

    @Inject
    private TextField textField;

    @Override
    public void init(Map<String, Object> params) {
        textField.setContextHelpIconClickHandler(event ->
                showMessageDialog("Title", event.getSource().getContextHelpText(), MessageType.CONFIRMATION)
        );
    }
}

package com.haulmont.sampler.web.ui.components.textfield.textchangeeventmode;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.OptionsGroup;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.TextInputField.TextChangeEventMode;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TextChangeEventModeTextFieldFrame extends AbstractFrame {
    @Inject
    private TextField textField;
    @Inject
    private OptionsGroup optionsGroup;

    @Override
    public void init(Map<String, Object> params) {
        initOptionsGroup();

        updateTextFieldCaption(0);
        textField.addTextChangeListener(event ->
                updateTextFieldCaption(event.getText().length()));
    }

    private void initOptionsGroup() {
        Map<String, Object> modes = new HashMap<>();
        Arrays.stream(TextChangeEventMode.values()).forEach(mode -> modes.put(mode.toString(), mode));
        optionsGroup.setOptionsMap(modes);


        optionsGroup.setValue(textField.getTextChangeEventMode());
        optionsGroup.addValueChangeListener(e ->
                textField.setTextChangeEventMode((TextChangeEventMode) e.getValue()));
    }

    private void updateTextFieldCaption(int length) {
        textField.setCaption("Characters left: " + (textField.getMaxLength() - length));
    }
}
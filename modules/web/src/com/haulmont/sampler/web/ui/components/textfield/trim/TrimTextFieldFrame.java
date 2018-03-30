package com.haulmont.sampler.web.ui.components.textfield.trim;

import com.google.common.html.HtmlEscapers;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class TrimTextFieldFrame extends AbstractFrame {

    @Inject
    private CheckBox trim;
    @Inject
    private TextField textField;
    @Inject
    private Label value;

    @Override
    public void init(Map<String, Object> params) {
        trim.setValue(textField.isTrimming());
        trim.addValueChangeListener(e -> textField.setTrimming(trim.getValue()));
    }

    public void show() {
        String value = textField.getValue() == null ?
                "null" : HtmlEscapers.htmlEscaper().escape(textField.getValue());
        this.value.setValue("Value: '" + value.replace(" ", " ") + "'");
    }
}
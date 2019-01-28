package com.haulmont.sampler.web.ui.components.textfield.trim;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.apache.commons.text.StringEscapeUtils;

import javax.inject.Inject;

@UiController("trim-textfield")
@UiDescriptor("trim-textfield.xml")
public class TrimTextFieldSample extends ScreenFragment {

    @Inject
    private CheckBox trim;
    @Inject
    private TextField<String> textField;
    @Inject
    private Label<String> valueLabel;

    @Subscribe
    protected void onInit(InitEvent event) {
        trim.setValue(textField.isTrimming());
    }

    @Subscribe("trim")
    protected void onTrimValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        textField.setTrimming(trim.getValue());
    }

    @Subscribe("show")
    protected void onShowClick(Button.ClickEvent event) {
        String value = textField.getValue() == null ?
                "null" : StringEscapeUtils.escapeHtml4(textField.getValue());
        valueLabel.setValue("Value: '" + value.replace(" ", "&nbsp;") + "'");
    }
}
package com.haulmont.sampler.web.ui.components.textfield.textchangeeventmode;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.RadioButtonGroup;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.TextInputField;
import com.haulmont.cuba.gui.components.TextInputField.TextChangeEventMode;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@UiController("textchangeeventmode-textfield")
@UiDescriptor("textchangeeventmode-textfield.xml")
public class TextChangeEventModeTextFieldSample extends ScreenFragment {
    @Inject
    private TextField<String> textField;
    @Inject
    private RadioButtonGroup<TextChangeEventMode> modeGroup;

    @Subscribe
    protected void onInit(InitEvent event) {
        Map<String, TextChangeEventMode> modes = new HashMap<>();
        Arrays.stream(TextChangeEventMode.values()).forEach(mode -> modes.put(mode.toString(), mode));
        modeGroup.setOptionsMap(modes);
        modeGroup.setValue(textField.getTextChangeEventMode());

        updateTextFieldCaption(0);
    }

    @Subscribe("modeGroup")
    protected void onModeGroupValueChange(HasValue.ValueChangeEvent<TextChangeEventMode> event) {
        textField.setTextChangeEventMode(event.getValue());
    }

    @Subscribe("textField")
    protected void onTextFieldTextChange(TextInputField.TextChangeEvent event) {
        updateTextFieldCaption(event.getText().length());
    }

    private void updateTextFieldCaption(int length) {
        textField.setCaption("Characters left: " + (textField.getMaxLength() - length));
    }


}
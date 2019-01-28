package com.haulmont.sampler.web.ui.components.codeeditor.mode;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.HighlightMode;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.SourceCodeEditor.Mode;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@UiController("mode-codeeditor")
@UiDescriptor("mode-codeeditor.xml")
public class ModeCodeEditorSample extends ScreenFragment {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private LookupField<HighlightMode> modeField;

    @Subscribe
    protected void onInit(InitEvent event) {
        Map<String, HighlightMode> modes = new HashMap<>();
        for (HighlightMode mode : Mode.values()) {
            modes.put(mode.toString(), mode);
        }

        modeField.setOptionsMap(modes);
        modeField.setValue(codeEditor.getMode());
    }

    @Subscribe("modeField")
    protected void onModeFieldValueChange(HasValue.ValueChangeEvent<HighlightMode> event) {
        if (event.getValue() != null) {
            codeEditor.setMode(event.getValue());
        }
    }
}
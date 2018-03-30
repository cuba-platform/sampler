package com.haulmont.sampler.web.ui.components.codeeditor.mode;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.SourceCodeEditor.Mode;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class ModeCodeEditorFrame extends AbstractFrame {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private LookupField modeField;

    @Override
    public void init(Map<String, Object> params) {
        Map<String, Object> modes = new HashMap<>();
        for (Mode mode : Mode.values()) {
            modes.put(mode.toString(), mode);
        }

        modeField.setOptionsMap(modes);
        modeField.setValue(codeEditor.getMode());
        modeField.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                codeEditor.setMode((Mode) e.getValue());
            }
        });
    }
}
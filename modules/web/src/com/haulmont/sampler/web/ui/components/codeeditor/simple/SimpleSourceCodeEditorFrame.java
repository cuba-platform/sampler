package com.haulmont.sampler.web.ui.components.codeeditor.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.SourceCodeEditor;

import javax.inject.Inject;
import java.util.Map;

public class SimpleSourceCodeEditorFrame extends AbstractFrame {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private CheckBox highlightActiveLineCheck;
    @Inject
    private CheckBox printMarginCheck;
    @Inject
    private CheckBox showGutterCheck;

    @Override
    public void init(Map<String, Object> params) {
        highlightActiveLineCheck.setValue(codeEditor.isHighlightActiveLine());
        highlightActiveLineCheck.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                codeEditor.setHighlightActiveLine((Boolean) e.getValue());
            }
        });

        printMarginCheck.setValue(codeEditor.isShowPrintMargin());
        printMarginCheck.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                codeEditor.setShowPrintMargin((Boolean) e.getValue());
            }
        });

        showGutterCheck.setValue(codeEditor.isShowGutter());
        showGutterCheck.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                codeEditor.setShowGutter((Boolean) e.getValue());
            }
        });
    }
}
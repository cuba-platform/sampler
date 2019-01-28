package com.haulmont.sampler.web.ui.components.codeeditor.simple;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-codeeditor")
@UiDescriptor("simple-codeeditor.xml")
public class SimpleSourceCodeEditorSample extends ScreenFragment {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private CheckBox highlightActiveLineCheck;
    @Inject
    private CheckBox printMarginCheck;
    @Inject
    private CheckBox showGutterCheck;

    @Subscribe
    protected void onInit(InitEvent event) {
        highlightActiveLineCheck.setValue(codeEditor.isHighlightActiveLine());
        printMarginCheck.setValue(codeEditor.isShowPrintMargin());
        showGutterCheck.setValue(codeEditor.isShowGutter());
    }

    @Subscribe("highlightActiveLineCheck")
    protected void onHighlightActiveLineCheckValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() != null) {
            codeEditor.setHighlightActiveLine(event.getValue());
        }
    }

    @Subscribe("printMarginCheck")
    protected void onPrintMarginCheckValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() != null) {
            codeEditor.setShowPrintMargin(event.getValue());
        }
    }

    @Subscribe("showGutterCheck")
    protected void onShowGutterCheckValueChange(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() != null) {
            codeEditor.setShowGutter(event.getValue());
        }
    }
}
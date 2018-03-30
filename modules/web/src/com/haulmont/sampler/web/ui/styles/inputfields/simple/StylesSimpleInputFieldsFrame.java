package com.haulmont.sampler.web.ui.styles.inputfields.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.ResizableTextArea;
import com.haulmont.cuba.gui.components.TextField;

import javax.inject.Inject;
import java.util.Map;

public class StylesSimpleInputFieldsFrame extends AbstractFrame {
    @Inject
    private ResizableTextArea textAreaAlignCenter;
    @Inject
    private ResizableTextArea textAreaAlignRight;

    @Inject
    private TextField textFieldAlignCenter;
    @Inject
    private TextField textFieldAlignRight;
    @Inject
    private TextField textFieldBorderless;
    @Inject
    private TextField textFieldInlineIcon;

    @Override
    public void init(Map<String, Object> params) {
        textFieldBorderless.setValue("Borderless");
        textFieldAlignCenter.setValue("Align center");
        textFieldAlignRight.setValue("Align right");
        textFieldInlineIcon.setValue("Inline icon");

        textAreaAlignCenter.setValue("Align center");
        textAreaAlignRight.setValue("Align right");
    }
}

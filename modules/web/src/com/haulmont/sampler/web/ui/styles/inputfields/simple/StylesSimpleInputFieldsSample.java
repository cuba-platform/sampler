package com.haulmont.sampler.web.ui.styles.inputfields.simple;

import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("styles-simple-input-fields")
@UiDescriptor("styles-simple-input-fields.xml")
public class StylesSimpleInputFieldsSample extends ScreenFragment {
    @Inject
    private TextArea<String> textAreaAlignCenter;
    @Inject
    private TextArea<String> textAreaAlignRight;

    @Inject
    private TextField<String> textFieldAlignCenter;
    @Inject
    private TextField<String> textFieldAlignRight;
    @Inject
    private TextField<String> textFieldBorderless;
    @Inject
    private TextField<String> textFieldInlineIcon;

    @Subscribe
    protected void onInit(InitEvent event) {
        textFieldBorderless.setValue("Borderless");
        textFieldAlignCenter.setValue("Align center");
        textFieldAlignRight.setValue("Align right");
        textFieldInlineIcon.setValue("Inline icon");

        textAreaAlignCenter.setValue("Align center");
        textAreaAlignRight.setValue("Align right");
    }
}

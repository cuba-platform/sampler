package com.haulmont.sampler.web.ui.components.contexthelp.fieldclick;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Dialogs.MessageType;
import com.haulmont.cuba.gui.components.HasContextHelp;
import com.haulmont.cuba.gui.screen.Install;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("contexthelp-field-click")
@UiDescriptor("contexthelp-field-click.xml")
public class ContextHelpFieldClickSample extends ScreenFragment {

    @Inject
    private Dialogs dialogs;

    @Install(to = "textField", subject = "contextHelpIconClickHandler")
    protected void textFieldContextHelpIconClickHandler(HasContextHelp.ContextHelpIconClickEvent event) {
        dialogs.createMessageDialog()
                .withCaption("Title")
                .withMessage(event.getSource().getContextHelpText())
                .withType(MessageType.CONFIRMATION)
                .show();
    }
}

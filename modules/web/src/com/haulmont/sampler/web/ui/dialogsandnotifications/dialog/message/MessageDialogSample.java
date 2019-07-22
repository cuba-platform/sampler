package com.haulmont.sampler.web.ui.dialogsandnotifications.dialog.message;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("message-dialog")
@UiDescriptor("message-dialog.xml")
public class MessageDialogSample extends ScreenFragment {
    @Inject
    private Dialogs dialogs;

    @Subscribe("showPlainText")
    protected void onShowPlainTextClick(Button.ClickEvent event) {
        dialogs.createMessageDialog()
                .withCaption("Confirmation")
                .withMessage("You clicked the button")
                .withType(Dialogs.MessageType.CONFIRMATION)
                .show();
    }

    @Subscribe("showHtmlContent")
    protected void onShowHtmlContentClick(Button.ClickEvent event) {
        dialogs.createMessageDialog()
                .withCaption("Warning")
                .withMessage("<i>Something</i> <u>is</u> <b>wrong</b>")
                .withType(Dialogs.MessageType.WARNING)
                .withContentMode(ContentMode.HTML)
                .show();
    }
}
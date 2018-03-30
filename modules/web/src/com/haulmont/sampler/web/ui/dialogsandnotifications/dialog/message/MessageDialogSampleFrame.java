package com.haulmont.sampler.web.ui.dialogsandnotifications.dialog.message;

import com.haulmont.cuba.gui.components.AbstractFrame;

public class MessageDialogSampleFrame extends AbstractFrame {

    public void showPlainText() {
        showMessageDialog("Confirmation", "You clicked the button", MessageType.CONFIRMATION);
    }

    public void showHtmlContent() {
        showMessageDialog("Warning", "<i>Something</i> <u>is</u> <b>wrong</b>", MessageType.WARNING_HTML);
    }
}
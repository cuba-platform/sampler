package com.haulmont.sampler.web.ui.dialogsandnotifications.dialog.option;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.actions.BaseAction;

public class OptionDialogSampleFrame extends AbstractFrame {

    public void okAndCancel() {
        showOptionDialog(
                "Title",
                "Message",
                MessageType.CONFIRMATION,
                new Action[]{
                        new DialogAction(DialogAction.Type.OK) {
                            @Override
                            public void actionPerform(Component component) {
                                showNotification("OK pressed", NotificationType.HUMANIZED);
                            }
                        },
                        new DialogAction(DialogAction.Type.CANCEL)
                }
        );
    }

    public void allActions() {
        showOptionDialog(
                "Title",
                "All available DialogActions",
                MessageType.CONFIRMATION.width("500px"),
                new Action[]{
                        new DialogAction(DialogAction.Type.OK),
                        new DialogAction(DialogAction.Type.CANCEL),
                        new DialogAction(DialogAction.Type.YES),
                        new DialogAction(DialogAction.Type.NO),
                        new DialogAction(DialogAction.Type.CLOSE)
                }
        );
    }

    public void customAction() {
        showOptionDialog(
                "Title",
                "Some <i>custom</i> action",
                MessageType.CONFIRMATION_HTML,
                new Action[]{
                        new BaseAction("customAction") {
                            @Override
                            public void actionPerform(Component component) {
                                showNotification("Done", NotificationType.HUMANIZED);
                            }

                            @Override
                            public String getCaption() {
                                return "Do something";
                            }
                        },
                        new DialogAction(DialogAction.Type.CANCEL)
                }
        );
    }
}
package com.haulmont.sampler.web.ui.dialogsandnotifications.dialog.option;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("option-dialog-sample")
@UiDescriptor("option-dialog-sample.xml")
public class OptionDialogSample extends ScreenFragment {
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;

    @Subscribe("okAndCancel")
    protected void onOkAndCancelClick(Button.ClickEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Title")
                .withMessage("Message")
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withActions(
                        new DialogAction(DialogAction.Type.OK)
                                .withHandler(e ->
                                        notifications.create()
                                                .withCaption("OK pressed")
                                                .show()
                                ),

                        new DialogAction(DialogAction.Type.CANCEL))
                .show();
    }

    @Subscribe("allActions")
    protected void onAllActionsClick(Button.ClickEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Title")
                .withMessage("All available DialogActions")
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withWidth("500px")
                .withActions(
                        new DialogAction(DialogAction.Type.OK),
                        new DialogAction(DialogAction.Type.CANCEL),
                        new DialogAction(DialogAction.Type.YES),
                        new DialogAction(DialogAction.Type.NO),
                        new DialogAction(DialogAction.Type.CLOSE))
                .show();
    }

    @Subscribe("customAction")
    protected void onCustomActionClick(Button.ClickEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Title")
                .withMessage("Message")
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withContentMode(ContentMode.HTML)
                .withActions(
                        new BaseAction("customAction")
                                .withCaption("Do something")
                                .withHandler(e ->
                                        notifications.create()
                                                .withCaption("Done")
                                                .show()
                                ),

                        new DialogAction(DialogAction.Type.CANCEL))
                .show();
    }
}
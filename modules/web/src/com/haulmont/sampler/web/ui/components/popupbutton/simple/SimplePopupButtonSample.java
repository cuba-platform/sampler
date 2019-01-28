package com.haulmont.sampler.web.ui.components.popupbutton.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.PopupButton;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("simple-popupbutton")
@UiDescriptor("simple-popupbutton.xml")
public class SimplePopupButtonSample extends ScreenFragment {

    @Inject
    private PopupButton popupButton3;

    @Inject
    private Notifications notifications;

    @Inject
    private MessageBundle messageBundle;

    @Subscribe
    protected void onInit(InitEvent event) {
        popupButton3.addAction(new BaseAction("saveAsDocAction")
                .withCaption(messageBundle.getMessage("saveAsDocAction"))
                .withHandler(actionPerformedEvent -> saveAsDoc()));

        popupButton3.addAction(new BaseAction("saveAsPdfAction")
                .withCaption(messageBundle.getMessage("saveAsPdfAction"))
                .withHandler(actionPerformedEvent -> saveAsPdf()));
    }

    @Subscribe("popupButton1.popupAction1")
    protected void onPopupButton1PopupAction1ActionPerformed(Action.ActionPerformedEvent event) {
        saveAsDoc();
    }

    @Subscribe("popupButton1.popupAction2")
    protected void onPopupButton1PopupAction2ActionPerformed(Action.ActionPerformedEvent event) {
        saveAsPdf();
    }

    @Subscribe("popupButton2.popupAction1")
    protected void onPopupButton2PopupAction1ActionPerformed(Action.ActionPerformedEvent event) {
        saveAsDoc();
    }

    @Subscribe("popupButton2.popupAction2")
    protected void onPopupButton2PopupAction2ActionPerformed(Action.ActionPerformedEvent event) {
        saveAsPdf();
    }

    public void saveAsDoc() {
        notifications.create()
                .withCaption("Saved as DOC")
                .show();
    }

    public void saveAsPdf() {
        notifications.create()
                .withCaption("Saved as PDF")
                .show();
    }
}
package com.haulmont.sampler.web.ui.components.popupbutton;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;

import javax.inject.Inject;
import java.util.Map;

public class SimplePopupButtonFrame extends AbstractFrame {

    @Inject
    private PopupButton popupButton3;

    @Override
    public void init(Map<String, Object> params) {
        popupButton3.addAction(new BaseAction("saveAsDocAction") {
            @Override
            public void actionPerform(Component component) {
                saveAsDoc();
            }
        });
        popupButton3.addAction(new BaseAction("saveAsPdfAction") {
            @Override
            public void actionPerform(Component component) {
                saveAsPdf();
            }
        });
    }

    public void saveAsDoc() {
        showNotification("Saved as DOC", NotificationType.HUMANIZED);
    }

    public void saveAsPdf() {
        showNotification("Saved as PDF", NotificationType.HUMANIZED);
    }
}
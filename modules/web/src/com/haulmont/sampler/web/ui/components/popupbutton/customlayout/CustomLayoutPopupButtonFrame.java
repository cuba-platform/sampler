package com.haulmont.sampler.web.ui.components.popupbutton.customlayout;

import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;

public class CustomLayoutPopupButtonFrame extends AbstractFrame {

    @Inject
    private PopupButton popupButton;

    @Inject
    private LookupField lookupField;

    @Inject
    private TextField textField;

    public void showSaveMessageAndClose() {
        popupButton.setPopupVisible(false);

        showNotification("Settings saved");
    }

    public void showCancelMessageAndClose() {
        popupButton.setPopupVisible(false);

        lookupField.setValue(null);
        textField.setValue(null);

        showNotification("Cancelled");
    }
}
package com.haulmont.sampler.web.ui.components.popupbutton.customlayout;

import com.haulmont.cuba.core.global.SendingStatus;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.PopupButton;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("customlayout-popupbutton")
@UiDescriptor("customlayout-popupbutton.xml")
public class CustomLayoutPopupButtonSample extends ScreenFragment {

    @Inject
    private PopupButton popupButton;

    @Inject
    private TextField<String> textField;

    @Inject
    private LookupField<SendingStatus> lookupField;

    @Inject
    private Notifications notifications;

    @Subscribe("saveAnsCloseButton")
    protected void onSaveAnsCloseButtonClick(Button.ClickEvent event) {
        popupButton.setPopupVisible(false);

        notifications.create()
                .withCaption("Settings saved")
                .show();
    }

    @Subscribe("cancelAnsCloseButton")
    protected void onCancelAnsCloseButtonClick(Button.ClickEvent event) {
        popupButton.setPopupVisible(false);

        lookupField.setValue(null);
        textField.setValue(null);

        notifications.create()
                .withCaption("Cancelled")
                .show();
    }
}
package com.haulmont.sampler.web.ui.components.textfield.maskedfield;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.MaskedField;

import javax.inject.Inject;

public class MaskedFieldFrame extends AbstractFrame {

    @Inject
    private MaskedField phoneFieldMasked;
    @Inject
    private MaskedField phoneFieldClear;

    public void showMasked() {
        showNotification(phoneFieldMasked.getValue(), NotificationType.HUMANIZED);
    }

    public void showClear() {
        showNotification(phoneFieldClear.getValue(), NotificationType.HUMANIZED);
    }
}
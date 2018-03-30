package com.haulmont.sampler.web.ui.components.popupview.opening;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.PopupView;

import javax.inject.Inject;

public class OpeningPopupViewFrame extends AbstractFrame {

    @Inject
    private PopupView popupView;

    public void openPopup() {
        popupView.setPopupVisible(true);
    }
}

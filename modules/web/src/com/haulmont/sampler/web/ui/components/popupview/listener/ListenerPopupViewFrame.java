package com.haulmont.sampler.web.ui.components.popupview.listener;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.PopupView;

import javax.inject.Inject;
import java.util.Map;

public class ListenerPopupViewFrame extends AbstractFrame {

    @Inject
    private PopupView popupView;

    @Override
    public void init(Map<String, Object> params) {
        popupView.addPopupVisibilityListener(event ->
                showNotification(event.isPopupVisible() ? "The popup is visible" : "The popup is hidden",
                        NotificationType.HUMANIZED));
    }
}

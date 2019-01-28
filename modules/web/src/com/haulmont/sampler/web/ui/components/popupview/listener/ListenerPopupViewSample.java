package com.haulmont.sampler.web.ui.components.popupview.listener;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.PopupView;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("listener-popupview")
@UiDescriptor("listener-popupview.xml")
public class ListenerPopupViewSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("popupView")
    protected void onPopupViewPopupVisibility(PopupView.PopupVisibilityEvent event) {
        notifications.create()
                .withCaption(event.isPopupVisible() ? "The popup is visible" : "The popup is hidden")
                .show();
    }
}

package com.haulmont.sampler.web.ui.containers.buttonspanel.alwaysvisible;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("always-visible-buttonspanel")
@UiDescriptor("always-visible-buttonspanel.xml")
public class AlwaysVisibleButtonsPanelSample extends ScreenFragment {

    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe("showVisible")
    protected void onShowVisibleClick(Button.ClickEvent event) {
        screenBuilders.lookup(Customer.class, this)
                .withScreenId("visible-buttonspanel")
                .withLaunchMode(OpenMode.DIALOG)
                .withSelectHandler(customers -> {})
                .build()
                .show();
    }

    @Subscribe("showInvisible")
    protected void onShowInvisibleClick(Button.ClickEvent event) {
        screenBuilders.lookup(Customer.class, this)
                .withScreenId("invisible-buttonspanel")
                .withLaunchMode(OpenMode.DIALOG)
                .withSelectHandler(customers -> {})
                .build()
                .show();
    }
}
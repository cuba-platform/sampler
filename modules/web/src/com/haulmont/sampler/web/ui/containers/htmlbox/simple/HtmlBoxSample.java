package com.haulmont.sampler.web.ui.containers.htmlbox.simple;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("html-box")
@UiDescriptor("html-box.xml")
public class HtmlBoxSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("addons")
    protected void onAddonsClick(Button.ClickEvent event) {
        click();
    }

    @Subscribe("buy")
    protected void onBuyClick(Button.ClickEvent event) {
        click();
    }

    @Subscribe("support")
    protected void onSupportClick(Button.ClickEvent event) {
        click();
    }

    public void click() {
        notifications.create()
                .withCaption("Button clicked")
                .show();
    }
}
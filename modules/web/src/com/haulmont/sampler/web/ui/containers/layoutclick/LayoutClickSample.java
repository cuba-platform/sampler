package com.haulmont.sampler.web.ui.containers.layoutclick;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.LayoutClickNotifier;
import com.haulmont.cuba.gui.components.MouseEventDetails;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("layout-click")
@UiDescriptor("layout-click.xml")
public class LayoutClickSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Subscribe("layout")
    protected void onBoxLayoutLayoutClick(LayoutClickNotifier.LayoutClickEvent event) {
        notifications.create()
                .withCaption(getMessage(event.getMouseEventDetails()))
                .withContentMode(ContentMode.HTML)
                .show();
    }


    private String getMessage(MouseEventDetails mouseEventDetails) {
        return "<strong>Button:</strong> " + mouseEventDetails.getButton()
                + "<br><strong>Client X:</strong> " + mouseEventDetails.getClientX()
                + "<br><strong>Client Y</strong>" + mouseEventDetails.getClientY();
    }
}
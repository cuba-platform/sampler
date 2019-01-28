package com.haulmont.sampler.web.ui.containers.layoutshortcut;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.GroupBoxLayout;
import com.haulmont.cuba.gui.components.ShortcutAction;
import com.haulmont.cuba.gui.components.ShortcutTriggeredEvent;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("layout-shortcut")
@UiDescriptor("layout-shortcut.xml")
public class LayoutShortcutSample extends ScreenFragment {

    @Inject
    private Notifications notifications;

    @Inject
    private GroupBoxLayout groupBox;

    @Subscribe
    protected void onInit(InitEvent event) {
        groupBox.addShortcutAction(new ShortcutAction("SHIFT-A", shortcutTriggeredEvent ->
                notifications.create()
                        .withCaption(getMessage(shortcutTriggeredEvent))
                        .withContentMode(ContentMode.HTML)
                        .show()
        ));
    }

    private String getMessage(ShortcutTriggeredEvent shortcutEvent) {
        return "<strong>Source id:</strong> " + shortcutEvent.getSource().getId()
                + "<br><strong>Target id:</strong> " + shortcutEvent.getTarget().getId();
    }
}
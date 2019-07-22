package com.haulmont.sampler.web.ui.components.contexthelp.formclick;

import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("contexthelp-form-click")
@UiDescriptor("contexthelp-form-click.xml")
public class ContextHelpFormClickSample extends ScreenFragment {

    @Inject
    private TextField<String> nameField;
    @Inject
    private CheckBox activeField;

    @Inject
    private Notifications notifications;
    @Inject
    private Dialogs dialogs;

    @Subscribe
    private void onInit(InitEvent event) {
        nameField.setContextHelpIconClickHandler(clickEvent ->
                notifications.create()
                        .withCaption(clickEvent.getSource().getContextHelpText())
                        .show()
        );

        activeField.setContextHelpIconClickHandler(clickEvent ->
                dialogs.createMessageDialog()
                        .withCaption("Title")
                        .withMessage(clickEvent.getSource().getContextHelpText())
                        .withType(Dialogs.MessageType.CONFIRMATION)
                        .withContentMode(ContentMode.HTML)
                        .show()
        );
    }
}
package com.haulmont.sampler.web.ui.components.textfield.maskedfield;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.MaskedField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("masked-field")
@UiDescriptor("masked-field.xml")
public class MaskedFieldSample extends ScreenFragment {

    @Inject
    private MaskedField<String> phoneFieldMasked;
    @Inject
    private MaskedField<String> phoneFieldClear;

    @Inject
    private Notifications notifications;

    @Subscribe("showMasked")
    protected void onShowMaskedClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(phoneFieldMasked.getValue())
                .show();
    }

    @Subscribe("showClear")
    protected void onShowClearClick(Button.ClickEvent event) {
        notifications.create()
                .withCaption(phoneFieldClear.getValue())
                .show();
    }
}
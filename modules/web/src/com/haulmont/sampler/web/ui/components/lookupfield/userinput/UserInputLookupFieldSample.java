package com.haulmont.sampler.web.ui.components.lookupfield.userinput;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UiController("user-input-lookupfield")
@UiDescriptor("user-input-lookupfield.xml")
public class UserInputLookupFieldSample extends ScreenFragment {

    @Inject
    private LookupField<String> lookup;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        final List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        lookup.setOptionsList(list);

        lookup.setNewOptionHandler(caption -> {
            list.add(caption);
            lookup.setOptionsList(list);

            notifications.create()
                    .withCaption(caption + " added")
                    .show();
        });
    }
}
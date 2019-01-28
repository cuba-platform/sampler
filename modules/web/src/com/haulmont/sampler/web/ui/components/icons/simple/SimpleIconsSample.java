package com.haulmont.sampler.web.ui.components.icons.simple;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.GroupBoxLayout;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-icons")
@UiDescriptor("simple-icons.xml")
public class SimpleIconsSample extends ScreenFragment {

    @Inject
    private GroupBoxLayout groupProgrammatic;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        Label<String> dollarLabel = uiComponents.create(Label.TYPE_STRING);
        dollarLabel.setIcon("font-icon:DOLLAR");
        dollarLabel.setValue("DOLLAR");
        groupProgrammatic.add(dollarLabel);

        Label<String> yenLabel = uiComponents.create(Label.TYPE_STRING);
        yenLabel.setIconFromSet(CubaIcon.YEN);
        yenLabel.setValue("YEN");
        groupProgrammatic.add(yenLabel);

        Label<String> gearLabel = uiComponents.create(Label.TYPE_STRING);
        gearLabel.setIcon("icons/gear.png");
        gearLabel.setValue("GEAR");
        groupProgrammatic.add(gearLabel);
    }
}
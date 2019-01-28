package com.haulmont.sampler.web.ui.components.icons.all;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component.Alignment;
import com.haulmont.cuba.gui.components.CssLayout;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.VBoxLayout;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("all-icons")
@UiDescriptor("all-icons.xml")
public class AllIconsSample extends ScreenFragment {

    private static final String TEXT_STYLE = "name-label";
    private static final String SOURCE_TEXT_STYLE = "source-label";
    private static final String ICON_STYLE = "icon-label";
    private static final String VBOX_STYLE = "vbox-icon";

    @Inject
    private CssLayout cssLayout;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        for (CubaIcon icon : CubaIcon.values()) {
            if (icon.source().isEmpty()) {
                continue;
            }

            cssLayout.add(createIconInfo(icon));
        }
    }

    private VBoxLayout createIconInfo(CubaIcon icon) {
        VBoxLayout vbox = uiComponents.create(VBoxLayout.class);
        vbox.setAlignment(Alignment.MIDDLE_CENTER);
        vbox.setWidth("210px");
        vbox.setStyleName(VBOX_STYLE);

        Label iconLabel = uiComponents.create(Label.class);
        iconLabel.setIconFromSet(icon);
        iconLabel.setAlignment(Alignment.MIDDLE_CENTER);
        iconLabel.addStyleName("h1");
        iconLabel.addStyleName(ICON_STYLE);

        Label<String> nameLabel = uiComponents.create(Label.TYPE_STRING);
        nameLabel.setAlignment(Alignment.MIDDLE_CENTER);
        nameLabel.setStyleName(TEXT_STYLE);
        nameLabel.setValue(icon.name());

        Label<String> sourceLabel = uiComponents.create(Label.TYPE_STRING);
        sourceLabel.setAlignment(Alignment.MIDDLE_CENTER);
        sourceLabel.setStyleName(SOURCE_TEXT_STYLE);
        sourceLabel.setValue(icon.source());

        vbox.add(iconLabel);
        vbox.add(nameLabel);
        vbox.add(sourceLabel);

        return vbox;
    }
}
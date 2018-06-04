package com.haulmont.sampler.web.ui.components.icons.all;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class AllIconsFrame extends AbstractFrame {

    private static final String TEXT_STYLE = "name-label";
    private static final String SOURCE_TEXT_STYLE = "source-label";
    private static final String ICON_STYLE = "icon-label";
    private static final String VBOX_STYLE = "vbox-icon";

    @Inject
    private CssLayout cssLayout;

    @Inject
    private ComponentsFactory factory;

    @Override
    public void init(Map<String, Object> params) {
        getWrappedFrame().addStyleName("sampler-scroll");

        for (CubaIcon icon : CubaIcon.values()) {
            if (icon.source().isEmpty()) {
                continue;
            }

            cssLayout.add(createIconInfo(icon));
        }
    }

    protected VBoxLayout createIconInfo(CubaIcon icon) {
        VBoxLayout vbox = factory.createComponent(VBoxLayout.class);
        vbox.setAlignment(Alignment.MIDDLE_CENTER);
        vbox.setWidth("210px");
        vbox.setStyleName(VBOX_STYLE);

        Label iconLabel = factory.createComponent(Label.class);
        iconLabel.setIconFromSet(icon);
        iconLabel.setAlignment(Alignment.MIDDLE_CENTER);
        iconLabel.addStyleName("h1");
        iconLabel.addStyleName(ICON_STYLE);

        Label nameLabel = factory.createComponent(Label.class);
        nameLabel.setAlignment(Alignment.MIDDLE_CENTER);
        nameLabel.setStyleName(TEXT_STYLE);
        nameLabel.setValue(icon.name());

        Label sourceLabel = factory.createComponent(Label.class);
        sourceLabel.setAlignment(Alignment.MIDDLE_CENTER);
        sourceLabel.setStyleName(SOURCE_TEXT_STYLE);
        sourceLabel.setValue(icon.source());

        vbox.add(iconLabel);
        vbox.add(nameLabel);
        vbox.add(sourceLabel);

        return vbox;
    }
}
package com.haulmont.sampler.web.ui.components.icons.simple;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.GroupBoxLayout;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.Map;

public class SimpleIconsFrame extends AbstractFrame {

    @Inject
    private GroupBoxLayout groupFont;

    @Inject
    private GroupBoxLayout groupSimple;

    @Inject
    private ComponentsFactory factory;

    @Override
    public void init(Map<String, Object> params) {
        Label dollarLabel = factory.createComponent(Label.class);
        dollarLabel.setIcon("font-icon:DOLLAR");
        dollarLabel.setValue("DOLLAR");
        groupFont.add(dollarLabel);

        Label yenLabel = factory.createComponent(Label.class);
        yenLabel.setIconFromSet(CubaIcon.YEN);
        yenLabel.setValue("YEN");
        groupFont.add(yenLabel);

        Label gearLabel = factory.createComponent(Label.class);
        gearLabel.setIcon("icons/gear.png");
        gearLabel.setValue("GEAR");
        groupSimple.add(gearLabel);
    }
}
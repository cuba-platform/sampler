package com.haulmont.sampler.web.ui.components.icons.all;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllIconsFrame extends AbstractFrame {

    private static final String TEXT_STYLE = "text-label";
    private static final String FONT_ICON = "font-icon:";

    @Inject
    private CssLayout cssLayout;

    @Inject
    private ComponentsFactory factory;

    private List<String> visibleSources = new ArrayList<>(20);

    @Override
    public void init(Map<String, Object> params) {
        getWrappedFrame().addStyleName("sampler-scroll");

        for (CubaIcon icon : CubaIcon.values()) {
            if (icon.source().isEmpty() || isSourceAdded(icon.source())) {
                continue;
            }

            visibleSources.add(icon.source());
            cssLayout.add(createIconInfo(icon));
        }
    }

    protected VBoxLayout createIconInfo(CubaIcon icon) {
        VBoxLayout vbox = factory.createComponent(VBoxLayout.class);
        vbox.setWidth(AUTO_SIZE);
        vbox.setAlignment(Alignment.MIDDLE_CENTER);
        vbox.setWidth("160px");

        Label iconLabel = factory.createComponent(Label.class);
        iconLabel.setIconFromSet(icon);
        iconLabel.setAlignment(Alignment.MIDDLE_CENTER);
        iconLabel.setStyleName("h1");

        Label nameLabel = factory.createComponent(Label.class);
        nameLabel.setAlignment(Alignment.MIDDLE_CENTER);
        nameLabel.setStyleName(TEXT_STYLE);
        nameLabel.setValue(FONT_ICON + "\n" + getSourceName(icon.source()));

        vbox.add(iconLabel);
        vbox.add(nameLabel);

        return vbox;
    }

    protected String getSourceName(String source) {
        return source.substring(FONT_ICON.length());
    }

    protected boolean isSourceAdded(String source) {
        return visibleSources.indexOf(source) != -1;
    }
}
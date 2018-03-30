package com.haulmont.sampler.web.ui.components.image.click;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.Label;

import javax.inject.Inject;
import java.util.Map;

public class ClickImageFrame extends AbstractFrame {

    @Inject
    private Image imageClick;
    @Inject
    private Image imageDoubleClick;
    @Inject
    private Label infoLabel;
    @Inject
    private Label doubleInfoLabel;

    @Override
    public void init(Map<String, Object> params) {
        infoLabel.setValue("<strong>Click info:</strong>");
        doubleInfoLabel.setValue("<strong>Click info:</strong>");

        imageClick.addClickListener(event -> {
            if (!event.isDoubleClick()) {
                infoLabel.setValue(getEventMessage(event));
            }
        });
        imageDoubleClick.addClickListener(event -> {
            if (event.isDoubleClick()) {
                doubleInfoLabel.setValue(getEventMessage(event));
            }
        });
    }

    private String getEventMessage(Image.ClickEvent event) {
        return String.format("<strong>Click info:</strong>"
                        + "<br><strong>Client X:</strong> %s"
                        + "<br><strong>Client Y:</strong> %s"
                        + "<br><strong>Is Ctrl click:</strong> %s"
                        + "<br><strong>Is Alt click:</strong> %s<br>"
                        + "<strong>Is Shift click:</strong> %s",
                event.getClientX(), event.getClientY(),
                event.isCtrlKey(), event.isAltKey(), event.isShiftKey());
    }
}
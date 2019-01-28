package com.haulmont.sampler.web.ui.components.image.click;

import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("click-image")
@UiDescriptor("click-image.xml")
public class ClickImageSample extends ScreenFragment {

    @Inject
    private Image imageClick;
    @Inject
    private Image imageDoubleClick;
    @Inject
    private Label<String> infoLabel;
    @Inject
    private Label<String> doubleInfoLabel;

    @Subscribe("imageClick")
    protected void onImageClickClick(Image.ClickEvent event) {
        if (!event.isDoubleClick()) {
            infoLabel.setValue(getEventMessage(event));
        }
    }

    @Subscribe("imageDoubleClick")
    protected void onImageDoubleClickClick(Image.ClickEvent event) {
        if (event.isDoubleClick()) {
            doubleInfoLabel.setValue(getEventMessage(event));
        }
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
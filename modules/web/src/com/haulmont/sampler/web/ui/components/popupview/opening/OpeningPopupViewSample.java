package com.haulmont.sampler.web.ui.components.popupview.opening;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PopupView;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("opening-popupview")
@UiDescriptor("opening-popupview.xml")
@LoadDataBeforeShow
public class OpeningPopupViewSample extends ScreenFragment {

    @Inject
    private PopupView popupView;

    @Subscribe("button")
    protected void onButtonClick(Button.ClickEvent event) {
        popupView.setPopupVisible(true);
    }
}

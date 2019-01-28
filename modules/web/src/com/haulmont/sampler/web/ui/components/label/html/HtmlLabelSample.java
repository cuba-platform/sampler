package com.haulmont.sampler.web.ui.components.label.html;

import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("html-label")
@UiDescriptor("html-label.xml")
public class HtmlLabelSample extends ScreenFragment {

    private static final String HTML = "In HTML mode, all HTML formatting tags, such as \n" +
            "<ul>" +
            "  <li><b>bold</b></li>" +
            "  <li>itemized lists</li>" +
            "  <li>etc.</li>" +
            "</ul> " +
            "are preserved.";

    @Inject
    private Label<String> htmlLabel;

    @Subscribe
    protected void onInit(InitEvent event) {
        htmlLabel.setValue(HTML);
    }
}
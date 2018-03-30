package com.haulmont.sampler.web.ui.components.label.html;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Label;

import javax.inject.Inject;
import java.util.Map;

public class HtmlLabelFrame extends AbstractFrame {

    private static final String HTML = "In HTML mode, all HTML formatting tags, such as \n" +
            "<ul>" +
            "  <li><b>bold</b></li>" +
            "  <li>itemized lists</li>" +
            "  <li>etc.</li>" +
            "</ul> " +
            "are preserved.";

    @Inject
    private Label htmlLabel;

    @Override
    public void init(Map<String, Object> params) {
        htmlLabel.setValue(HTML);
    }
}
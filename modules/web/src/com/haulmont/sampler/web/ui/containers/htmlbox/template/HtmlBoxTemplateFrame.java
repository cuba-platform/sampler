package com.haulmont.sampler.web.ui.containers.htmlbox.template;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.HtmlBoxLayout;

import javax.inject.Inject;
import java.util.Map;

public class HtmlBoxTemplateFrame extends AbstractFrame {

    @Inject
    private HtmlBoxLayout htmlSample;

    @Override
    public void init(Map<String, Object> params) {
        htmlSample.setTemplateContents(
                "<div class=\"box-container\">\n" +
                "    <img src=\"../images/platform-logo.png\" class=\"logo\">\n" +
                "    <div class=\"button-container\">\n" +
                "        <div class=\"sample-button addons-button\" location=\"addons\"></div>\n" +
                "        <div class=\"sample-button buy-button\" location=\"buy\"></div>\n" +
                "        <div class=\"sample-button support-button\" location=\"support\"></div>\n" +
                "    </div>\n" +
                "</div>");
    }

    public void click() {
        showNotification("Button clicked", NotificationType.HUMANIZED);
    }
}

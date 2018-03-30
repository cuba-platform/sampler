package com.haulmont.sampler.web.ui.components.richtextarea;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.RichTextArea;

import javax.inject.Inject;
import java.util.Map;

public class SimpleRichTextAreaFrame extends AbstractFrame {

    @Inject
    private RichTextArea richTextArea;

    @Override
    public void init(Map<String, Object> params) {
        richTextArea.setValue("<i>Jackdaws </i><u>love</u> <font color=\"#0000ff\">my</font> " +
                "<font size=\"7\">big</font> <sup>sphinx</sup> " +
                "<font face=\"Verdana\">of</font> <span style=\"background-color: " +
                "red;\">quartz</span>");
    }
}
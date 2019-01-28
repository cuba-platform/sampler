package com.haulmont.sampler.web.ui.components.richtextarea;

import com.haulmont.cuba.gui.components.RichTextArea;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("simple-richtextarea")
@UiDescriptor("simple-richtextarea.xml")
public class SimpleRichTextAreaSample extends ScreenFragment {

    @Inject
    private RichTextArea richTextArea;

    @Subscribe
    protected void onInit(InitEvent event) {
        richTextArea.setValue("<i>Jackdaws </i><u>love</u> <font color=\"#0000ff\">my</font> " +
                "<font size=\"7\">big</font> <sup>sphinx</sup> " +
                "<font face=\"Verdana\">of</font> <span style=\"background-color: " +
                "red;\">quartz</span>");
    }
}
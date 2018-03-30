package com.haulmont.sampler.web.ui.components.button.programmaticaction;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;

import javax.inject.Inject;
import java.util.Map;

public class ProgrammaticActionButtonFrame extends AbstractFrame {

    @Inject
    private Button button;

    @Override
    public void init(Map<String, Object> params) {
        button.setAction(new BaseAction("theAction") {
            @Override
            public void actionPerform(Component component) {
                showNotification("Action performed", NotificationType.HUMANIZED);
            }
            @Override
            public String getCaption() {
                return "Click Me!";
            }
        });
    }
}
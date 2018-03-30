package com.haulmont.sampler.web.ui.containers.buttonspanel.alwaysvisible;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Window;

public class AlwaysVisibleButtonsPanelFrame extends AbstractFrame {

    private final Window.Lookup.Handler dummyLookupHandler = items -> {
    };

    public void showVisible() {
        openLookup("visible-buttonspanel", dummyLookupHandler, WindowManager.OpenType.DIALOG);
    }

    public void showInvisible() {
        openLookup("invisible-buttonspanel", dummyLookupHandler, WindowManager.OpenType.DIALOG);
    }
}
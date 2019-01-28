package com.haulmont.sampler.web.ui.containers.buttonspanel.alwaysvisible;

import com.haulmont.cuba.gui.screen.*;

@UiController("invisible-buttonspanel")
@UiDescriptor("invisible-buttonspanel.xml")
@LookupComponent("customerTable")
@LoadDataBeforeShow
public class InvisibleButtonsPanel extends StandardLookup {
}
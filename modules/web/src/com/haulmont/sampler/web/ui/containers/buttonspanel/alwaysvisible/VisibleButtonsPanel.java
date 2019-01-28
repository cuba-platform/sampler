package com.haulmont.sampler.web.ui.containers.buttonspanel.alwaysvisible;

import com.haulmont.cuba.gui.screen.*;

@UiController("visible-buttonspanel")
@UiDescriptor("visible-buttonspanel.xml")
@LookupComponent("customerTable")
@LoadDataBeforeShow
public class VisibleButtonsPanel extends StandardLookup {
}
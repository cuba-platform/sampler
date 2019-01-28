package com.haulmont.sampler.web.ui.containers.tabsheet.lazy;

import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TabSheet;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("lazy-tabsheet")
@UiDescriptor("lazy-tabsheet.xml")
public class LazyTabSheetSample extends ScreenFragment {

    @Inject
    private Label<String> info;

    @Subscribe
    protected void onInit(InitEvent event) {
        checkComponents();
    }

    @Subscribe("tabSheet")
    protected void onTabSheetSelectedTabChange(TabSheet.SelectedTabChangeEvent event) {
        if (event.getSelectedTab().getName().equals("tab2")) {
            checkComponents();
        }
    }

    private void checkComponents() {
        StringBuilder sb = new StringBuilder("Created components:\n");

        sb.append("label1 = ");
        Label label1 = (Label) getFragment().getComponent("label1");
        sb.append(label1 == null ? null : (String) label1.getValue());

        sb.append(", label2 = ");
        Label label2 = (Label) getFragment().getComponent("label2");
        sb.append(label2 == null ? null : (String) label2.getValue());

        info.setValue(sb.toString());
    }
}
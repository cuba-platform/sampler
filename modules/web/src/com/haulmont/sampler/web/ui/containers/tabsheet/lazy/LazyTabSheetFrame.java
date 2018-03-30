package com.haulmont.sampler.web.ui.containers.tabsheet.lazy;

import com.haulmont.cuba.gui.components.*;

import javax.inject.Inject;
import java.util.Map;

public class LazyTabSheetFrame extends AbstractFrame {

    @Inject
    private TabSheet tabSheet;
    @Inject
    private Label info;

    @Override
    public void init(Map<String, Object> params) {
        checkComponents();

        tabSheet.addSelectedTabChangeListener(newTab -> {
            if (newTab.getSelectedTab().getName().equals("tab2"))
                checkComponents();
        });
    }

    private void checkComponents() {
        StringBuilder sb = new StringBuilder("Created components:\n");

        sb.append("label1 = ");
        Label label1 = (Label) getComponent("label1");
        sb.append(label1 == null ? null : (String) label1.getValue());

        sb.append(", label2 = ");
        Label label2 = (Label) getComponent("label2");
        sb.append(label2 == null ? null : (String) label2.getValue());

        info.setValue(sb.toString());
    }
}
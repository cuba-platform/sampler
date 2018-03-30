package com.haulmont.sampler.web.ui.styles.tabsheet;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.TabSheet;

import javax.inject.Inject;
import java.util.Map;

public class TabSheetStylesFrame extends AbstractFrame {
    @Inject
    private TabSheet tabSheet;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        for (Component component : getComponents()) {
            if (component instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) component;
                checkBox.addValueChangeListener(this::changeTableStyle);
            }
        }

        for (TabSheet.Tab tab : tabSheet.getTabs()) {
            tab.setClosable(true);
        }
    }

    private void changeTableStyle(ValueChangeEvent e) {
        String id = e.getComponent().getId();
        Object value = e.getValue();
        if (value != null) {
            Boolean checked = (Boolean) value;
            if (checked) {
                tabSheet.addStyleName(prepareStyleName(id));
            } else {
                tabSheet.removeStyleName(prepareStyleName(id));
            }
        }
    }

    private String prepareStyleName(String stylename) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stylename.length(); i++) {
            char c = stylename.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("-").append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
package com.haulmont.sampler.web.ui.styles.tabsheet;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TabSheet;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("styles-tabsheet")
@UiDescriptor("styles-tabsheet.xml")
public class TabSheetStylesSample extends ScreenFragment {
    @Inject
    private TabSheet tabSheet;

    @Subscribe
    protected void onInit(InitEvent event) {
        for (Component component : getFragment().getComponents()) {
            if (component instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) component;
                checkBox.addValueChangeListener(this::changeTableStyle);
            }
        }

        for (TabSheet.Tab tab : tabSheet.getTabs()) {
            tab.setClosable(true);
        }
    }

    private void changeTableStyle(HasValue.ValueChangeEvent e) {
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
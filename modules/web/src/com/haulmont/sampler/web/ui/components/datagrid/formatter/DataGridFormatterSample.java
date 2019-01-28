package com.haulmont.sampler.web.ui.components.datagrid.formatter;

import com.haulmont.cuba.gui.components.Formatter;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("datagrid-formatter")
@UiDescriptor("datagrid-formatter.xml")
@LoadDataBeforeShow
public class DataGridFormatterSample extends ScreenFragment {

    public static class UppercaseFormatter implements Formatter<String> {
        @Override
        public String format(String value) {
            return value.toUpperCase();
        }
    }
}
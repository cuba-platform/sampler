package com.haulmont.sampler.web.ui.components.table.formatter;

import com.haulmont.cuba.gui.components.Formatter;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("formatter-table")
@UiDescriptor("formatter-table.xml")
@LoadDataBeforeShow
public class FormatterTableSample extends ScreenFragment {

    public static class UppercaseFormatter implements Formatter<String> {

        @Override
        public String format(String value) {
            return value.toUpperCase();
        }
    }
}
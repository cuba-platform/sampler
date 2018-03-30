package com.haulmont.sampler.web.ui.charts.charts.responsive;

import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Map;

public class ChartResponsiveFrame extends AbstractFrame {
    @Inject
    private LookupField resolutionsField;
    @Inject
    private Chart stackedArea;

    @Override
    public void init(Map<String, Object> params) {
        resolutionsField.setTextInputAllowed(false);
        resolutionsField.setNullOptionVisible(false);
        resolutionsField.setOptionsList(Arrays.asList(
                "800x500", "800x300", "800x200", "800x100",
                "350x500", "200x500", "100x500",
                "100x30", "30x100"
        ));

        resolutionsField.addValueChangeListener(e -> {
            if (e.getValue() != null) {
                String[] size = ((String) e.getValue()).split("x");
                stackedArea.setWidth(size[0] + "px");
                stackedArea.setHeight(size[1] + "px");
            }
        });

        resolutionsField.setValue("800x500");
    }
}

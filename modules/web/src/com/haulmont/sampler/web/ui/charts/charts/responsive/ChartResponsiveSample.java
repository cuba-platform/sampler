package com.haulmont.sampler.web.ui.charts.charts.responsive;

import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.Arrays;

@UiController("chart-responsive")
@UiDescriptor("chart-responsive.xml")
@LoadDataBeforeShow
public class ChartResponsiveSample extends ScreenFragment {
    @Inject
    private LookupField<String> resolutionsField;
    @Inject
    private SerialChart stackedArea;

    @Subscribe
    protected void onInit(InitEvent event) {
        resolutionsField.setTextInputAllowed(false);
        resolutionsField.setNullOptionVisible(false);
        resolutionsField.setOptionsList(Arrays.asList(
                "800x500", "800x300", "800x200", "800x100",
                "350x500", "200x500", "100x500",
                "100x30", "30x100"
        ));

        resolutionsField.setValue("800x500");
    }

    @Subscribe("resolutionsField")
    protected void onResolutionsFieldValueChange(HasValue.ValueChangeEvent<String> event) {
        if (event.getValue() != null) {
            String[] size = event.getValue().split("x");
            stackedArea.setWidth(size[0] + "px");
            stackedArea.setHeight(size[1] + "px");
        }
    }
}

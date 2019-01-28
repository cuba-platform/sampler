package com.haulmont.sampler.web.ui.components.lookupfield.filtermode;

import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@UiController("filter-mode-lookupfield")
@UiDescriptor("filter-mode-lookupfield.xml")
public class FilterModeLookupFieldSample extends ScreenFragment {

    @Inject
    private LookupField<String> containsFilterLookup;
    @Inject
    private LookupField<String> noFilterLookup;
    @Inject
    private LookupField<String> startsWithFilterLookup;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<String> list = Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        );

        noFilterLookup.setOptionsList(list);
        startsWithFilterLookup.setOptionsList(list);
        containsFilterLookup.setOptionsList(list);
    }
}
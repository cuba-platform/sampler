package com.haulmont.sampler.web.ui.components.lookupfield.filtermode;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;

import javax.inject.Inject;
import java.util.*;

public class FilterModeLookupFieldFrame extends AbstractFrame {

    @Inject
    private LookupField containsFilterLookup;
    @Inject
    private LookupField noFilterLookup;
    @Inject
    private LookupField startsWithFilterLookup;

    @Override
    public void init(Map<String, Object> params) {
        List<String> list = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        noFilterLookup.setOptionsList(list);
        startsWithFilterLookup.setOptionsList(list);
        containsFilterLookup.setOptionsList(list);
    }
}
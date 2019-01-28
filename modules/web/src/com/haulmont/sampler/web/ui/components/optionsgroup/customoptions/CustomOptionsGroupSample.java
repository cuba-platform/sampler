package com.haulmont.sampler.web.ui.components.optionsgroup.customoptions;

import com.haulmont.cuba.gui.components.OptionsGroup;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@UiController("custom-options-optionsgroup")
@UiDescriptor("custom-options-optionsgroup.xml")
public class CustomOptionsGroupSample extends ScreenFragment {

    @Inject
    private OptionsGroup<Integer, Integer> optionsGroupWithList;
    @Inject
    private OptionsGroup<Integer, Integer> optionsGroupWithMap;
    @Inject
    private OptionsGroup<CustomerGrade, CustomerGrade> optionsGroupWithEnum;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        optionsGroupWithList.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        optionsGroupWithMap.setOptionsMap(map);

        optionsGroupWithEnum.setOptionsEnum(CustomerGrade.class);
    }
}
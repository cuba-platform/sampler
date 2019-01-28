package com.haulmont.sampler.web.ui.components.optionslist.customoptions;

import com.haulmont.cuba.gui.components.OptionsList;
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

@UiController("custom-options-optionslist")
@UiDescriptor("custom-options-optionslist.xml")
public class CustomOptionsListSample extends ScreenFragment {
    @Inject
    private OptionsList<Integer, Integer> optionsListWithList;
    @Inject
    private OptionsList<Integer, Integer> optionsListWithMap;
    @Inject
    private OptionsList<CustomerGrade, CustomerGrade> optionsListWithEnum;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        optionsListWithList.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        optionsListWithMap.setOptionsMap(map);

        optionsListWithEnum.setOptionsEnum(CustomerGrade.class);
    }
}
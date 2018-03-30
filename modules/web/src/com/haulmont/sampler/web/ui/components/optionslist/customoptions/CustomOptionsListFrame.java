package com.haulmont.sampler.web.ui.components.optionslist.customoptions;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.OptionsList;
import com.haulmont.sampler.entity.CustomerGrade;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomOptionsListFrame extends AbstractFrame {
    @Inject
    private OptionsList optionsListWithList;
    @Inject
    private OptionsList optionsListWithMap;
    @Inject
    private OptionsList optionsListWithEnum;

    @Override
    public void init(Map<String, Object> params) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        optionsListWithList.setOptionsList(list);

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        optionsListWithMap.setOptionsMap(map);

        optionsListWithEnum.setOptionsEnum(CustomerGrade.class);
    }
}
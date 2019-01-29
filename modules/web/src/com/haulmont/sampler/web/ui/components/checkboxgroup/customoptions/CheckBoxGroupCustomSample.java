package com.haulmont.sampler.web.ui.components.checkboxgroup.customoptions;

import com.haulmont.cuba.gui.components.CheckBoxGroup;
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

@UiController("checkboxgroup-custom-options")
@UiDescriptor("checkboxgroup-custom-options.xml")
public class CheckBoxGroupCustomSample extends ScreenFragment {

    @Inject
    private CheckBoxGroup<Integer> checkBoxGroupWithList;
    @Inject
    private CheckBoxGroup<Integer> checkBoxGroupWithMap;
    @Inject
    private CheckBoxGroup<CustomerGrade> checkBoxGroupWithEnum;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        checkBoxGroupWithList.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        checkBoxGroupWithMap.setOptionsMap(map);

        checkBoxGroupWithEnum.setOptionsEnum(CustomerGrade.class);
    }
}
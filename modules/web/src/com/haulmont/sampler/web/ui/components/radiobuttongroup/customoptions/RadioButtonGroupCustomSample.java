package com.haulmont.sampler.web.ui.components.radiobuttongroup.customoptions;

import com.haulmont.cuba.gui.components.RadioButtonGroup;
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

@UiController("radiobuttongroup-custom-options")
@UiDescriptor("radiobuttongroup-custom-options.xml")
public class RadioButtonGroupCustomSample extends ScreenFragment {

    @Inject
    private RadioButtonGroup<Integer> radioButtonGroupWithList;
    @Inject
    private RadioButtonGroup<Integer> radioButtonGroupWithMap;
    @Inject
    private RadioButtonGroup<CustomerGrade> radioButtonGroupWithEnum;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        radioButtonGroupWithList.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        radioButtonGroupWithMap.setOptionsMap(map);

        radioButtonGroupWithEnum.setOptionsEnum(CustomerGrade.class);
    }
}
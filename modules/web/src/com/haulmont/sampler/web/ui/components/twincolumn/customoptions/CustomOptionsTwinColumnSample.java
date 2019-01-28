package com.haulmont.sampler.web.ui.components.twincolumn.customoptions;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.TwinColumn;
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

@UiController("custom-options-twincolumn")
@UiDescriptor("custom-options-twincolumn.xml")
public class CustomOptionsTwinColumnSample extends ScreenFragment {

    @Inject
    private TwinColumn<Integer> twinColumnWithOptionsList;
    @Inject
    private TwinColumn<Integer> twinColumnWithOptionsMap;
    @Inject
    private TwinColumn<CustomerGrade> twinColumnWithOptionsEnum;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        twinColumnWithOptionsList.setOptionsList(list);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("two", 2);
        map.put("four", 4);
        map.put("five", 5);
        map.put("seven", 7);
        twinColumnWithOptionsMap.setOptionsMap(map);

        twinColumnWithOptionsEnum.setOptionsEnum(CustomerGrade.class);
    }

    @Subscribe("showOptionsListValue")
    protected void onShowOptionsListValueClick(Button.ClickEvent event) {
        showValue(twinColumnWithOptionsList.getValue());
    }

    @Subscribe("showOptionsMapValue")
    protected void onShowOptionsMapValueClick(Button.ClickEvent event) {
        showValue(twinColumnWithOptionsMap.getValue());
    }

    @Subscribe("showOptionsEnumValue")
    protected void onShowOptionsEnumValueClick(Button.ClickEvent event) {
        showValue(twinColumnWithOptionsEnum.getValue());
    }

    private void showValue(Object value) {
        notifications.create()
                .withCaption(String.valueOf(value))
                .show();
    }
}
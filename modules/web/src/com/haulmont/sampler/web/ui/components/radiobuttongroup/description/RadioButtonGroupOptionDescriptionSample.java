package com.haulmont.sampler.web.ui.components.radiobuttongroup.description;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Experience;

@UiController("radiobuttongroup-option-description")
@UiDescriptor("radiobuttongroup-option-description.xml")
public class RadioButtonGroupOptionDescriptionSample extends ScreenFragment {

    @Install(to = "radioButtonGroup", subject = "optionDescriptionProvider")
    private String radioButtonGroupOptionDescriptionProvider(Experience experience) {
        switch (experience) {
            case HIGH:
                return "Senior";
            case COMMON:
                return "Middle";
            default:
                return "Junior";
        }
    }

}

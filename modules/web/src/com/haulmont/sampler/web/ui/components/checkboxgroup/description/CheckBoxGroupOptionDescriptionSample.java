package com.haulmont.sampler.web.ui.components.checkboxgroup.description;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Product;

@UiController("checkboxgroup-option-description")
@UiDescriptor("checkboxgroup-option-description.xml")
@LoadDataBeforeShow
public class CheckBoxGroupOptionDescriptionSample extends ScreenFragment {

    @Install(to = "checkBoxGroup", subject = "optionDescriptionProvider")
    private String checkBoxGroupOptionDescriptionProvider(Product product) {
        return "Price: " + product.getPrice();
    }
    
}

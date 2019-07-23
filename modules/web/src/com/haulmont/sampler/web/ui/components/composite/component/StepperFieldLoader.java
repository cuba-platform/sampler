package com.haulmont.sampler.web.ui.components.composite.component;

import com.google.common.base.Strings;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractFieldLoader;

import java.math.BigDecimal;

public class StepperFieldLoader extends AbstractFieldLoader<StepperField> {

    @Override
    public void createComponent() {
        resultComponent = factory.create(StepperField.NAME);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {
        super.loadComponent();
        String incrementStr = element.attributeValue("step");
        if (!Strings.isNullOrEmpty(incrementStr)) {
            resultComponent.setStep(new BigDecimal(incrementStr));
        }
    }
}

package com.haulmont.sampler.web.ui.components.composite.component;

import com.haulmont.bali.events.Subscription;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.data.ValueSource;
import com.haulmont.cuba.web.gui.components.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.function.Consumer;

@CompositeDescriptor("stepper-component.xml")
public class StepperField extends CompositeComponent<CssLayout> implements Field<BigDecimal>,
        CompositeWithCaption, CompositeWithHtmlCaption, CompositeWithHtmlDescription,
        CompositeWithIcon, CompositeWithContextHelp {

    public static final String NAME = "stepperField";

    private TextField<BigDecimal> valueField;
    private Button upBtn;
    private Button downBtn;

    private BigDecimal step = BigDecimal.ONE;

    public StepperField() {
        addCreateListener(this::onCreate);
    }

    private void onCreate(CreateEvent createEvent) {
        valueField = getInnerComponent("valueField");
        upBtn = getInnerComponent("upBtn");
        downBtn = getInnerComponent("downBtn");

        upBtn.addClickListener(clickEvent -> updateValue(step));
        downBtn.addClickListener(clickEvent -> updateValue(step.negate()));
    }

    private void updateValue(BigDecimal delta) {
        BigDecimal value = getValue();
        setValue(value != null ? value.add(delta) : delta);
    }

    public BigDecimal getStep() {
        return step;
    }

    public void setStep(BigDecimal step) {
        this.step = step != null ? step : BigDecimal.ONE;
    }

    @Override
    public boolean isRequired() {
        return valueField.isRequired();
    }

    @Override
    public void setRequired(boolean required) {
        valueField.setRequired(required);
        getComposition().setRequiredIndicatorVisible(required);
    }

    @Override
    public String getRequiredMessage() {
        return valueField.getRequiredMessage();
    }

    @Override
    public void setRequiredMessage(String msg) {
        valueField.setRequiredMessage(msg);
    }

    @Override
    public void addValidator(Consumer<? super BigDecimal> validator) {
        valueField.addValidator(validator);
    }

    @Override
    public void removeValidator(Consumer<BigDecimal> validator) {
        valueField.removeValidator(validator);
    }

    @Override
    public Collection<Consumer<BigDecimal>> getValidators() {
        return valueField.getValidators();
    }

    @Override
    public boolean isEditable() {
        return valueField.isEditable();
    }

    @Override
    public void setEditable(boolean editable) {
        valueField.setEditable(editable);
        upBtn.setEnabled(editable);
        downBtn.setEnabled(editable);
    }

    @Override
    public BigDecimal getValue() {
        return valueField.getValue();
    }

    @Override
    public void setValue(BigDecimal value) {
        valueField.setValue(value);
    }

    @Override
    public Subscription addValueChangeListener(Consumer<ValueChangeEvent<BigDecimal>> listener) {
        return valueField.addValueChangeListener(listener);
    }

    @Override
    public void removeValueChangeListener(Consumer<ValueChangeEvent<BigDecimal>> listener) {
        valueField.removeValueChangeListener(listener);
    }

    @Override
    public boolean isValid() {
        return valueField.isValid();
    }

    @Override
    public void validate() throws ValidationException {
        valueField.validate();
    }

    @Override
    public void setValueSource(ValueSource<BigDecimal> valueSource) {
        valueField.setValueSource(valueSource);
        getComposition().setRequiredIndicatorVisible(valueField.isRequired());
    }

    @Override
    public ValueSource<BigDecimal> getValueSource() {
        return valueField.getValueSource();
    }
}

package com.haulmont.sampler.web.ui.components.textfield.validator;

import com.haulmont.cuba.gui.components.Field;
import com.haulmont.cuba.gui.components.ValidationException;

public class PositiveIntegerValidator implements Field.Validator {
    @Override
    public void validate(Object value) throws ValidationException {
        Integer i = (Integer) value;
        if (i <= 0) {
            throw new ValidationException("Value must be positive");
        }
    }
}

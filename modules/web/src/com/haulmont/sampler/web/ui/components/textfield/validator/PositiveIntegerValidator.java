package com.haulmont.sampler.web.ui.components.textfield.validator;

import com.haulmont.cuba.gui.components.Field;
import com.haulmont.cuba.gui.components.ValidationException;

import javax.annotation.Nullable;

public class PositiveIntegerValidator implements Field.Validator {
    @Override
    public void validate(@Nullable Object value) throws ValidationException {
        if (value != null) {
            Integer i = (Integer) value;
            if (i <= 0) {
                throw new ValidationException("Value must be positive");
            }
        }
    }
}

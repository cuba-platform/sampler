package com.haulmont.sampler.web.ui.components.suggestionfield.optiontype;

import com.haulmont.cuba.core.global.SendingStatus;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.SuggestionField;
import org.apache.commons.lang.StringUtils;

import javax.inject.Inject;
import java.util.stream.Collectors;
import java.util.*;

import static com.haulmont.cuba.gui.components.SuggestionField.OptionWrapper;

public class OptionTypeSuggestionFieldFrame extends AbstractFrame {

    @Inject
    private SuggestionField stringSuggestionField;

    @Inject
    private SuggestionField enumSuggestionField;

    @Inject
    private SuggestionField optionWrapperSuggestionField;

    @Override
    public void init(Map<String, Object> params) {
        List<String> strings = Arrays.asList("John", "Andy", "Dora", "Martin", "Peter", "George");
        stringSuggestionField.setSearchExecutor((searchString, searchParams) ->
                strings.stream()
                        .filter(str -> StringUtils.containsIgnoreCase(str, searchString))
                        .collect(Collectors.toList()));

        List<SendingStatus> enums = Arrays.asList(SendingStatus.values());
        enumSuggestionField.setSearchExecutor((searchString, searchParams) ->
                enums.stream()
                        .map(sendingStatus -> messages.getMessage(sendingStatus))
                        .filter(str -> StringUtils.containsIgnoreCase(str, searchString))
                        .collect(Collectors.toList()));

        List<OptionWrapper> wrappers = Arrays.asList(
                new OptionWrapper("One", 1),
                new OptionWrapper("Two", 2),
                new OptionWrapper("Three", 3));
        optionWrapperSuggestionField.setSearchExecutor((searchString, searchParams) ->
                wrappers.stream()
                        .filter(optionWrapper -> StringUtils.containsIgnoreCase(optionWrapper.getCaption(), searchString))
                        .collect(Collectors.toList()));
    }
}
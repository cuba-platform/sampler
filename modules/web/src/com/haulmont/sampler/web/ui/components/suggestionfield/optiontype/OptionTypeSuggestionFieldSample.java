package com.haulmont.sampler.web.ui.components.suggestionfield.optiontype;

import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.SendingStatus;
import com.haulmont.cuba.gui.components.SuggestionField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.haulmont.cuba.gui.components.SuggestionField.OptionWrapper;

@UiController("optiontype-suggestionfield")
@UiDescriptor("optiontype-suggestionfield.xml")
public class OptionTypeSuggestionFieldSample extends ScreenFragment {

    @Inject
    private SuggestionField<String> stringSuggestionField;
    @Inject
    private SuggestionField<SendingStatus> enumSuggestionField;
    @Inject
    private SuggestionField<Integer> optionWrapperSuggestionField;

    @Inject
    private Messages messages;

    @Subscribe
    protected void onInit(InitEvent event) {
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
                new OptionWrapper<>("One", 1),
                new OptionWrapper<>("Two", 2),
                new OptionWrapper<>("Three", 3));
        optionWrapperSuggestionField.setSearchExecutor((searchString, searchParams) ->
                wrappers.stream()
                        .filter(optionWrapper -> StringUtils.containsIgnoreCase(optionWrapper.getCaption(), searchString))
                        .collect(Collectors.toList()));
    }
}
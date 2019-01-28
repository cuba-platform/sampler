package com.haulmont.sampler.web.ui.components.codeeditor.suggester;

import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.autocomplete.AutoCompleteSupport;
import com.haulmont.cuba.gui.components.autocomplete.Suggestion;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("suggester-codeeditor")
@UiDescriptor("suggester-codeeditor.xml")
@LoadDataBeforeShow
public class SuggesterCodeEditorSample extends ScreenFragment {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private CollectionContainer<Customer> customersDc;
    @Inject
    private CollectionLoader<Customer> customersLoader;
    @Inject
    private MetadataTools metadataTools;

    @Install(to = "codeEditor", subject = "suggester")
    protected List<Suggestion> codeEditorSuggester(AutoCompleteSupport source, String text, int cursorPosition) {
        List<Suggestion> suggestions = new ArrayList<>();
        customersLoader.load();
        for (Customer customer : customersDc.getItems()) {
            String customerName = metadataTools.getInstanceName(customer);
            suggestions.add(new Suggestion(source, customerName, customerName, null, -1, -1));
        }
        return suggestions;
    }


}
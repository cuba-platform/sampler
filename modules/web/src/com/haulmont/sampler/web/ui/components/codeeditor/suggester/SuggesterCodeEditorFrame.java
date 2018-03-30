package com.haulmont.sampler.web.ui.components.codeeditor.suggester;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.SourceCodeEditor;
import com.haulmont.cuba.gui.components.autocomplete.Suggestion;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SuggesterCodeEditorFrame extends AbstractFrame {
    @Inject
    private SourceCodeEditor codeEditor;
    @Inject
    private CollectionDatasource<Customer, UUID> customersDs;

    @Override
    public void init(Map<String, Object> params) {
        codeEditor.setSuggester((source, text, cursorPosition) -> {
            List<Suggestion> suggestions = new ArrayList<>();
            customersDs.refresh();
            for (Customer customer : customersDs.getItems()) {
                String customerName = customer.getInstanceName();
                suggestions.add(new Suggestion(source, customerName, customerName, null, -1, -1));
            }
            return suggestions;
        });
    }
}
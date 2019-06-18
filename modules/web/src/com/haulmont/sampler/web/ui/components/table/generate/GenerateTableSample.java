package com.haulmont.sampler.web.ui.components.table.generate;

import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("generate-table")
@UiDescriptor("generate-table.xml")
@LoadDataBeforeShow
public class GenerateTableSample extends ScreenFragment {

    @Inject
    private Table<Customer> customerTable;
    @Inject
    private UiComponents uiComponents;
    @Inject
    private GlobalConfig globalConfig;
    @Inject
    private MetadataTools metadataTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        customerTable.addGeneratedColumn("language", entity -> {
            LookupField<String> lookupField = uiComponents.create(LookupField.TYPE_STRING);
            List<String> locales = new ArrayList<>(globalConfig.getAvailableLocales().keySet());
            lookupField.setOptionsList(locales);
            lookupField.setWidth("100%");
            return lookupField;
        });

        customerTable.getColumn("fullName").setCaption("Full Name");
        customerTable.getColumn("language").setCaption("Language");
    }

    public Component generateFullNameCell(Customer entity) {
        return new Table.PlainTextCell(metadataTools.getInstanceName(entity));
    }
}
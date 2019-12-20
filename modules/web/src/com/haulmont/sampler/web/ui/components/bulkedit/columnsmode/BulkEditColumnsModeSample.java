package com.haulmont.sampler.web.ui.components.bulkedit.columnsmode;

import com.haulmont.cuba.gui.actions.list.BulkEditAction;
import com.haulmont.cuba.gui.app.core.bulk.ColumnsMode;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.LinkedHashMap;
import java.util.Map;

@UiController("bulk-edit-columns-mode")
@UiDescriptor("bulk-edit-columns-mode.xml")
@LoadDataBeforeShow
public class BulkEditColumnsModeSample extends ScreenFragment {

    @Inject
    private LookupField<ColumnsMode> columnsModeField;
    @Named("customersTable.bulkEdit")
    private BulkEditAction customersTableBulkEdit;

    @Subscribe
    public void onInit(InitEvent event) {
        Map<String, ColumnsMode> optionsMap = new LinkedHashMap<>();
        for (ColumnsMode mode : ColumnsMode.values()) {
            optionsMap.put(mode.name(), mode);
        }
        columnsModeField.setOptionsMap(optionsMap);
        columnsModeField.setValue(ColumnsMode.TWO_COLUMNS);
    }

    @Subscribe("columnsModeField")
    public void onColumnsModeFieldValueChange(HasValue.ValueChangeEvent<ColumnsMode> event) {
        customersTableBulkEdit.setColumnsMode(event.getValue());
    }


}

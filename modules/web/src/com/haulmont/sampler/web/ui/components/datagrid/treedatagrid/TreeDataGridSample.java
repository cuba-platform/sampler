package com.haulmont.sampler.web.ui.components.datagrid.treedatagrid;

import com.haulmont.chile.core.model.MetaPropertyPath;
import com.haulmont.cuba.core.global.MessageTools;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.TreeDataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Task;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@UiController("tree-datagrid")
@UiDescriptor("tree-datagrid.xml")
@LoadDataBeforeShow
public class TreeDataGridSample extends ScreenFragment {
    @Inject
    private LookupField<String> columnSelector;
    @Inject
    private TreeDataGrid<Task> taskDataGrid;

    @Inject
    private MetadataTools metadataTools;
    @Inject
    private MessageTools messageTools;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<DataGrid.Column<Task>> columns = taskDataGrid.getColumns();
        Map<String, String> columnsMap = columns.stream()
                .collect(Collectors.toMap(
                        column -> {
                            MetaPropertyPath propertyPath = column.getPropertyPath();
                            return propertyPath != null
                                    ? messageTools.getPropertyCaption(propertyPath.getMetaProperty())
                                    : column.getId();
                        },
                        DataGrid.Column::getId,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        columnSelector.setOptionsMap(columnsMap);

        columnSelector.setValue(columns.get(0).getId());
    }

    @Subscribe("columnSelector")
    protected void onColumnSelectorValueChange(HasValue.ValueChangeEvent<String> event) {
        taskDataGrid.setHierarchyColumn(event.getValue());
    }
}
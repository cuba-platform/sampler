package com.haulmont.sampler.web.ui.components.datagrid.editorevents;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Notifications.NotificationType;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("datagrid-editor-events")
@UiDescriptor("datagrid-editor-events.xml")
@LoadDataBeforeShow
public class DataGridEditorEventsSample extends ScreenFragment {
    @Inject
    private Notifications notifications;

    @Subscribe("customersDataGrid")
    protected void onCustomersDataGridEditorOpen(DataGrid.EditorOpenEvent event) {
        notifications.create()
                .withCaption("Editor will open")
                .withType(NotificationType.TRAY)
                .show();
    }

    @Subscribe("customersDataGrid")
    protected void onCustomersDataGridEditorPreCommit(DataGrid.EditorPreCommitEvent event) {
        notifications.create()
                .withCaption("Pre Commit")
                .show();
    }

    @Subscribe("customersDataGrid")
    protected void onCustomersDataGridEditorPostCommit(DataGrid.EditorPostCommitEvent event) {
        notifications.create()
                .withCaption("Post Commit")
                .show();
    }

    @Subscribe("customersDataGrid")
    protected void onCustomersDataGridEditorClose(DataGrid.EditorCloseEvent event) {
        notifications.create()
                .withCaption("Editor closed")
                .withType(NotificationType.TRAY)
                .show();
    }
}

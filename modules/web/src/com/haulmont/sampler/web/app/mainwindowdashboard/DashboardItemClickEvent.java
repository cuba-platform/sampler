package com.haulmont.sampler.web.app.mainwindowdashboard;

import com.haulmont.cuba.gui.components.Component;

import java.util.EventObject;

public class DashboardItemClickEvent extends EventObject {

    private String menuItemId;

    public DashboardItemClickEvent(Component clickedComponent, String menuItemId) {
        super(clickedComponent);
        this.menuItemId = menuItemId;
    }

    @Override
    public Component getSource() {
        return (Component) super.getSource();
    }

    public String getMenuItemId() {
        return menuItemId;
    }
}

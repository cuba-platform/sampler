package com.haulmont.sampler.web.app.mainwindowdashboard;

import com.haulmont.cuba.gui.components.Component;

public interface DashboardItemClickListener {

    void onClick(ItemClickEvent event);

    class ItemClickEvent {

        private Component clickedComponent;
        private String menuItemId;

        public ItemClickEvent(Component clickedComponent, String menuItemId) {
            this.clickedComponent = clickedComponent;
            this.menuItemId = menuItemId;
        }

        public Component getClickedComponent() {
            return clickedComponent;
        }

        public String getMenuItemId() {
            return menuItemId;
        }
    }
}

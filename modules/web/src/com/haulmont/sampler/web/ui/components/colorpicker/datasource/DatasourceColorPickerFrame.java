package com.haulmont.sampler.web.ui.components.colorpicker.datasource;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.sampler.entity.Color;

import javax.inject.Inject;
import java.util.Map;

public class DatasourceColorPickerFrame extends AbstractFrame {

    @Inject
    private Datasource<Color> colorDs;
    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        // Datasource initialization. It is usually done automatically if the screen is
        // inherited from AbstractEditor and is used as an entity editor.
        Color color = metadata.create(Color.class);
        color.setHex("006bac");
        colorDs.setItem(color);
    }
}
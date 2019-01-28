package com.haulmont.sampler.web.ui.components.colorpicker.dataaware;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.sampler.entity.Color;

import javax.inject.Inject;

@UiController("dataaware-colorpicker")
@UiDescriptor("dataaware-colorpicker.xml")
public class DataawareColorPickerSample extends ScreenFragment {

    @Inject
    private InstanceContainer<Color> colorDc;
    @Inject
    private Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Color color = metadata.create(Color.class);
        color.setHex("006bac");
        colorDc.setItem(color);
    }
}
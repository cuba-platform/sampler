package com.haulmont.sampler.web.ui.components.image.scale;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.Map;

@UiController("scale-image")
@UiDescriptor("scale-image.xml")
public class ScaleImageSample extends ScreenFragment {

    @Inject
    private LookupField<Image.ScaleMode> scaleLookupField;

    @Inject
    private Image image;

    @Subscribe
    protected void onInit(InitEvent event) {
        Map<String, Image.ScaleMode> modeMap = new LinkedHashMap<>();
        for (Image.ScaleMode mode : Image.ScaleMode.values()) {
            modeMap.put(mode.name(), mode);
        }
        scaleLookupField.setOptionsMap(modeMap);
        scaleLookupField.setValue(Image.ScaleMode.NONE);
    }

    @Subscribe("scaleLookupField")
    protected void onScaleLookupFieldValueChange(HasValue.ValueChangeEvent<Image.ScaleMode> event) {
        image.setScaleMode(event.getValue());
    }


}
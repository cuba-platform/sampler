package com.haulmont.sampler.web.ui.components.image.scale;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.LookupField;

import javax.inject.Inject;
import java.util.LinkedHashMap;
import java.util.Map;

public class ScaleImageFrame extends AbstractFrame {

    @Inject
    private LookupField scaleLookupField;

    @Inject
    private Image image;

    @Override
    public void init(Map<String, Object> params) {
        Map<String, Image.ScaleMode> modeMap = new LinkedHashMap<>();
        for(Image.ScaleMode mode: Image.ScaleMode.values()){
            modeMap.put(mode.name(), mode);
        }
        scaleLookupField.setOptionsMap(modeMap);
        scaleLookupField.addValueChangeListener(e -> image.setScaleMode((Image.ScaleMode) e.getValue()));
        scaleLookupField.setValue(Image.ScaleMode.NONE);
    }
}
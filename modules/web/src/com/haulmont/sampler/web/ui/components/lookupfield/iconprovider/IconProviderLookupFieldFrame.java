package com.haulmont.sampler.web.ui.components.lookupfield.iconprovider;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.LookupField;
import com.vaadin.server.FontAwesome;

import javax.inject.Inject;
import java.util.*;

public class IconProviderLookupFieldFrame extends AbstractFrame {

    @Inject
    private LookupField lookup;

    @Override
    public void init(Map<String, Object> params) {
        Map<String, Object> map = ParamsMap.of(
                "Archive file", FontAwesome.FILE_ARCHIVE_O,
                "PDF file", FontAwesome.FILE_PDF_O,
                "TXT file", FontAwesome.FILE_TEXT_O);
        lookup.setOptionsMap(map);
        lookup.setOptionIconProvider(o -> "font-icon:" + String.valueOf(o));
    }
}
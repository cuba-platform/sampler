package com.haulmont.sampler.web.ui.components.lookupfield.iconprovider;

import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;
import com.vaadin.server.FontAwesome;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@UiController("icon-provider-lookupfield")
@UiDescriptor("icon-provider-lookupfield.xml")
public class IconProviderLookupFieldSample extends ScreenFragment {

    @Inject
    private LookupField<FontAwesome> lookup;

    @Subscribe
    protected void onInit(InitEvent event) {
        Map<String, FontAwesome> map = new HashMap<>();
        map.put("Archive file", FontAwesome.FILE_ARCHIVE_O);
        map.put("PDF file", FontAwesome.FILE_PDF_O);
        map.put("TXT file", FontAwesome.FILE_TEXT_O);
        lookup.setOptionsMap(map);
    }

    @Install(to = "lookup", subject = "optionIconProvider")
    protected String lookupOptionIconProvider(FontAwesome icon) {
        return "font-icon:" + icon;
    }
}
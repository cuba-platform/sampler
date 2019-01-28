package com.haulmont.sampler.web.util;

import com.haulmont.bali.util.Dom4j;
import com.haulmont.cuba.core.global.Resources;
import com.haulmont.cuba.gui.components.Window;
import com.haulmont.cuba.gui.config.WindowConfig;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.gui.screen.MapScreenOptions;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.haulmont.cuba.gui.xml.XmlInheritanceProcessor;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Component(SamplesHelper.NAME)
public class SamplesHelper {
    public static final String NAME = "sampler_SamplesHelper";

    private static final Map<String, Object> EMPTY_MAP = new HashMap<>();
    private static final Log logger = LogFactory.getLog(SamplesHelper.class);

    @Inject
    private Resources resources;

    @Inject
    private WindowConfig windowConfig;

    @Inject
    private SamplesMenuConfig samplesMenuConfig;

    public String getSampleBrowserId() {
        return "sample-browser";
    }

    public ScreenOptions getScreenOptions(MenuItem item) {
        WindowInfo info = windowConfig.getWindowInfo(item.getId());
        Map<String, Object> params = new HashMap<>();
        params.put("windowId", item.getId());
        params.put("caption", samplesMenuConfig.getMenuItemCaption(item.getId()));
        params.put("controller", item.getController());
        params.put("sampleHeight", item.getSampleHeight());
        params.put("splitEnabled", item.getSplitEnabled());
        params.put("otherFiles", item.getOtherFiles());
        params.put("screenParams", item.getScreenParams());
        params.put("descriptionsPack", item.getDescriptionsPack());
        params.put("screenSrc", info.getTemplate());
        params.put("docUrlSuffix", item.getUrl());
        params.put("image", item.getImage());
        Element root = getWindowElement(info.getTemplate());
        if (root != null) {
            params.put("messagesPack", getMessagePack(root));
        }

        return new MapScreenOptions(params);
    }

    public String getFileContent(String src) {
        return resources.getResourceAsString(src);
    }

    private String getMessagePack(Element root) {
        return root.attributeValue("messagesPack");
    }

    public String packageToPath(String pkg) {
        return pkg.replaceAll("[.]", "/");
    }

    public String getFileName(String src) {
        Path p = Paths.get(src);
        return p.getFileName().toString();
    }

    @Nullable
    public String getFileExtension(String src) {
        String fileName = getFileName(src);
        int index = fileName.lastIndexOf(".");
        if (index >= 0) {
            return fileName.substring(index + 1);
        }
        return null;
    }

    @Nullable
    private Element getWindowElement(String src) {
        String text = resources.getResourceAsString(src);
        if (StringUtils.isNotEmpty(text)) {
            try {
                Document document = Dom4j.readDocument(text);
                XmlInheritanceProcessor processor = new XmlInheritanceProcessor(document, EMPTY_MAP);
                Element root = processor.getResultRoot();
                if (root.getName().equals(Window.NAME))
                    return root;
            } catch (RuntimeException e) {
                logger.error("Can't parse screen file: " + src);
            }
        } else {
            logger.error("File doesn't exist or empty: " + src);
        }
        return null;
    }
}

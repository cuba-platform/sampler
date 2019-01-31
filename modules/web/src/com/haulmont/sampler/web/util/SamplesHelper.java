package com.haulmont.sampler.web.util;

import com.google.common.collect.ImmutableMap;
import com.haulmont.bali.util.Dom4j;
import com.haulmont.cuba.core.global.Resources;
import com.haulmont.cuba.gui.components.Window;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.gui.screen.MapScreenOptions;
import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.haulmont.cuba.gui.xml.XmlInheritanceProcessor;
import com.haulmont.sampler.web.config.MenuItem;
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

    public String getSampleBrowserId() {
        return "sample-browser";
    }

    public ScreenOptions getScreenOptions(MenuItem item) {
        return new MapScreenOptions(ImmutableMap.of("windowId", item.getId()));
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
    public String findMessagePack(WindowInfo info) {
        Element root = getWindowElement(info.getTemplate());
        return (root != null)
                ? getMessagePack(root)
                : null;
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

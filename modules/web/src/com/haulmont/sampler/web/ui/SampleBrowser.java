package com.haulmont.sampler.web.ui;

import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.global.MessageTools;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.controllers.ControllerUtils;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.haulmont.cuba.web.toolkit.ui.CubaSourceCodeEditor;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.vaadin.aceeditor.AceMode;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SampleBrowser extends AbstractWindow {

    private static final String DESCRIPTION_BOX_STYLE = "description-box";
    private static final String DOC_URL_MESSAGES_KEY = "docUrl";
    private static final int SPLIT_POSITION_SPACING = 30;

    @Inject
    private Label spacer;

    @Inject
    private TabSheet tabSheet;

    @Inject
    private ComponentsFactory componentsFactory;

    @Inject
    private SamplesHelper samplesHelper;

    @Inject
    private Messages messages;

    @Inject
    private MessageTools messageTools;

    @Inject
    private GlobalConfig globalConfig;

    @Inject
    private UserSessionSource userSessionSource;

    @SuppressWarnings("unchecked")
    @Override
    public void init(Map<String, Object> params) {
        String id = (String) params.get("windowId");
        Map<String, Object> screenParams = (Map<String, Object>) params.get("screenParams");
        Frame frame = openFrame(null, id, screenParams);
        frame.setId("sampleFrame");

        String sampleHeight = (String) params.get("sampleHeight");
        String splitEnabled = (String) params.get("splitEnabled");
        if (BooleanUtils.toBoolean(splitEnabled)) {

            remove(spacer);
            remove(tabSheet);

            SplitPanel split = componentsFactory.createComponent(SplitPanel.class);
            split.setSettingsEnabled(false);
            split.setOrientation(SplitPanel.ORIENTATION_VERTICAL);
            split.setWidth("100%");
            split.setHeight("100%");

            Container vBox = createContainer(false, false, true, false);
            vBox.add(frame);

            split.add(vBox);
            split.add(tabSheet);

            if (StringUtils.isNotEmpty(sampleHeight)) {
                if (sampleHeight.contains("px")) {
                    String height = sampleHeight.replace("px", "");
                    split.setSplitPosition(Integer.valueOf(height) + SPLIT_POSITION_SPACING, UNITS_PIXELS);
                } else {
                    frame.setHeight("100%");
                    split.setSplitPosition(Integer.valueOf(sampleHeight));
                }
            } else {
                frame.setHeight("100%");
            }

            add(split);
        } else {
            add(frame, 0);
        }


        String caption = (String) params.get("caption");
        if (StringUtils.isEmpty(caption))
            caption = id;
        setCaption(caption);

        String descriptionsPack = (String) params.get("descriptionsPack");
        if (StringUtils.isNotEmpty(descriptionsPack)) {
            String docUrlSuffix = (String) params.get("docUrlSuffix");
            addTab(messages.getMessage(getClass(), "sampleBrowser.description"),
                    createDescription(descriptionsPack, docUrlSuffix, id));
        }

        String screenSrc = (String) params.get("screenSrc");
        addSourceTab(screenSrc);

        String controller = (String) params.get("controller");
        if (StringUtils.isNotEmpty(controller)) {
            addSourceTab(controller);
        }

        List<String> otherFiles = (List<String>) params.get("otherFiles");
        if (CollectionUtils.isNotEmpty(otherFiles)) {
            otherFiles.forEach(this::addSourceTab);
        }

        String messagesPack = (String) params.get("messagesPack");
        if (StringUtils.isNotEmpty(messagesPack)) {
            createMessagesContainers(messagesPack);
        }
    }

    private Container createContainer() {
        return createContainer(true, true, true, true);
    }

    private Container createContainer(boolean topEnable, boolean rightEnable, boolean bottomEnable, boolean leftEnable) {
        VBoxLayout vBox = componentsFactory.createComponent(VBoxLayout.class);
        vBox.setMargin(topEnable, rightEnable, bottomEnable, leftEnable);
        vBox.setHeight("100%");

        return vBox;
    }

    private Component createDescription(String descriptionsPack, String docUrlSuffix, String frameId) {
        ScrollBoxLayout scrollBoxLayout = componentsFactory.createComponent(ScrollBoxLayout.class);
        scrollBoxLayout.addStyleName(DESCRIPTION_BOX_STYLE);
        scrollBoxLayout.setWidth("100%");
        scrollBoxLayout.setHeight("100%");
        scrollBoxLayout.setSpacing(true);

        scrollBoxLayout.add(descriptionText(frameId, descriptionsPack));

        HBoxLayout hbox = componentsFactory.createComponent(HBoxLayout.class);
        hbox.setWidth("100%");

        if (StringUtils.isNotEmpty(docUrlSuffix)) {
            Component docLinks = documentLinks(descriptionsPack, docUrlSuffix);
            hbox.add(docLinks);
        }

        hbox.add(permalink(frameId));

        scrollBoxLayout.add(hbox);

        return scrollBoxLayout;
    }

    private Component descriptionText(String frameId, String descriptionsPack) {
        StringBuilder sb = new StringBuilder();
        String text = samplesHelper.getFileContent(getDescriptionFileName(descriptionsPack, frameId));
        if (StringUtils.isNotEmpty(text)) {
            sb.append(text);
            sb.append("<hr>");
        }
        Label doc = componentsFactory.createComponent(Label.class);
        doc.setHtmlEnabled(true);
        doc.setWidth("100%");
        doc.setValue(sb.toString());
        return doc;
    }

    private Component documentLinks(String descriptionsPack, String docUrlSuffix) {
        Link docLink = componentsFactory.createComponent(Link.class);
        Locale locale = userSessionSource.getLocale();
        String url = String.format(messages.getMessage(descriptionsPack, DOC_URL_MESSAGES_KEY, locale), docUrlSuffix);
        docLink.setUrl(url);
        docLink.setCaption(messages.getMessage(getClass(), "sampleBrowser.documentation"));
        docLink.setTarget("_blank");
        return docLink;
    }

    private Component permalink(String frameId) {
        PopupView permalink = componentsFactory.createComponent(PopupView.class);
        permalink.setAlignment(Alignment.TOP_RIGHT);
        permalink.setHideOnMouseOut(false);
        permalink.setDescription(getMessage("sampleBrowser.permalink.description"));
        permalink.setStyleName("external-link");

        TextField content = componentsFactory.createComponent(TextField.class);
        String value = ControllerUtils.getLocationWithoutParams() + "open?screen=" + frameId;
        content.setValue(value);
        content.setWidth((value.length() * 8) + "px");
        content.setEditable(false);
        content.selectAll();
        permalink.setPopupContent(content);

        permalink.addPopupVisibilityListener(event -> {
            if (event.isPopupVisible()) {
                content.requestFocus();
            }
        });

        return permalink;
    }

    private String getDescriptionFileName(String descriptionsPack, String frameId) {
        StringBuilder sb = new StringBuilder(descriptionsPack);
        if (!descriptionsPack.endsWith("/"))
            sb.append("/");
        sb.append(frameId).append("-");
        sb.append(getUserLocale().toString());
        sb.append(".html");
        return sb.toString();
    }

    private SourceCodeEditor createSourceCodeEditor(AceMode mode) {
        SourceCodeEditor editor = componentsFactory.createComponent(SourceCodeEditor.class);
        editor.setStyleName("sample-browser");
        editor.setShowPrintMargin(false);
        CubaSourceCodeEditor codeEditor = (CubaSourceCodeEditor) WebComponentsHelper.unwrap(editor);
        codeEditor.setMode(mode);
        editor.setEditable(false);
        editor.setWidth("100%");
        editor.setHeight("100%");

        return editor;
    }

    private void createMessagesContainers(String messagesPack) {
        Locale defaultLocale = messageTools.getDefaultLocale();
        for (Locale locale : globalConfig.getAvailableLocales().values()) {
            SourceCodeEditor sourceCodeEditor = createSourceCodeEditor(AceMode.properties);
            String tabTitle;
            if (defaultLocale.equals(locale)) {
                tabTitle = "messages.properties";
            } else {
                tabTitle = String.format("messages_%s.properties", locale.toString());
            }

            String content = samplesHelper.getFileContent(samplesHelper.packageToPath(messagesPack) + "/" + tabTitle);
            if (StringUtils.isNotBlank(content)) {
                sourceCodeEditor.setValue(content);
                addTab(tabTitle, sourceCodeEditor);
            }
        }
    }

    private void addTab(String name, Component component) {
        Container container = createContainer();
        container.add(component);
        tabSheet.addTab(name, container);
        TabSheet.Tab tab = tabSheet.getTab(name);
        tab.setCaption(name);
    }

    private void addSourceTab(String src) {
        if (StringUtils.isNotEmpty(src)) {
            SourceCodeEditor sourceCodeEditor = createSourceCodeEditor(getAceMode(src));
            sourceCodeEditor.setValue(samplesHelper.getFileContent(src));
            addTab(samplesHelper.getFileName(src), sourceCodeEditor);
        }
    }

    private AceMode getAceMode(String src) {
        String fileExtension = samplesHelper.getFileExtension(src);
        return fileExtension != null ? AceMode.forFileEnding(fileExtension) : AceMode.text;
    }

    private Locale getUserLocale() {
        return userSessionSource.getUserSession().getLocale();
    }
}
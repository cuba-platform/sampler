package com.haulmont.sampler.web.ui;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.core.global.MessageTools;
import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.*;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.config.WindowConfig;
import com.haulmont.cuba.gui.config.WindowInfo;
import com.haulmont.cuba.gui.navigation.UrlParamsChangedEvent;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.AppUI;
import com.haulmont.cuba.web.controllers.ControllerUtils;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.haulmont.cuba.web.sys.navigation.UrlIdSerializer;
import com.haulmont.cuba.web.widgets.CubaSourceCodeEditor;
import com.haulmont.cuba.web.widgets.addons.aceeditor.AceMode;
import com.haulmont.sampler.web.app.mainwindow.SamplerMainWindow;
import com.haulmont.sampler.web.config.MenuItem;
import com.haulmont.sampler.web.config.SamplesMenuConfig;
import com.haulmont.sampler.web.util.SamplesHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Route("sample")
@UiController("sample-browser")
@UiDescriptor("sample-browser.xml")
public class SampleBrowser extends Screen {

    private static final String DESCRIPTION_BOX_STYLE = "description-box";
    private static final String DOC_URL_MESSAGES_KEY = "docUrl";
    private static final int SPLIT_POSITION_SPACING = 30;

    @Inject
    private UiComponents uiComponents;
    @Inject
    private SamplesHelper samplesHelper;
    @Inject
    private SamplesMenuConfig samplesMenuConfig;
    @Inject
    private Messages messages;
    @Inject
    private MessageBundle messageBundle;
    @Inject
    private MessageTools messageTools;
    @Inject
    private GlobalConfig globalConfig;
    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private Fragments fragments;
    @Inject
    private UrlRouting urlRouting;
    @Inject
    private WindowConfig windowConfig;

    private String sampleId;
    private TabSheet tabSheet;

    @Subscribe
    protected void onInit(InitEvent event) {
        if (!(event.getOptions() instanceof MapScreenOptions)) {
            return;
        }

        MapScreenOptions options = (MapScreenOptions) event.getOptions();
        Map<String, Object> params = options.getParams();

        sampleId = (String) params.get("windowId");
        updateSample(sampleId);
    }

    private void updateSample(String sampleId) {
        MenuItem item = samplesMenuConfig.getItemById(sampleId);

        ScreenFragment screenFragment = fragments
                .create(this, sampleId, new MapScreenOptions(item.getScreenParams()))
                .init();
        Fragment fragment = screenFragment.getFragment();
        fragment.setId("sampleFrame");

        loadScreenData(screenFragment, fragment);
        updateLayout(fragment, item);
        updateCaption(sampleId, item);
        updateTabs(sampleId, item);
        focusFirstPossibleComponent(fragment);
    }

    private void focusFirstPossibleComponent(Fragment fragment) {
        fragment.getComponents().stream()
                .filter(component ->
                        component instanceof Component.Focusable)
                .findFirst()
                .ifPresent(component ->
                        ((Component.Focusable) component).focus());
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        // When a locale is changed, UrlParamsChangedEvent is fired after AfterShowEvent
        // See cuba-platform/cuba#1665
        if (sampleId == null) {
            return;
        }

        String serializedSampleId = UrlIdSerializer.serializeId(sampleId);
        urlRouting.replaceState(this, ImmutableMap.of("id", serializedSampleId));
    }

    @Subscribe
    protected void onUrlParamsChanged(UrlParamsChangedEvent event) {
        String serializedSampleId = event.getParams().get("id");
        sampleId = (String) UrlIdSerializer.deserializeId(String.class, serializedSampleId);
        updateSample(sampleId);

        Screens.OpenedScreens openedScreens = AppUI.getCurrent().getScreens().getOpenedScreens();
        Screen rootScreen = openedScreens.getRootScreen();
        if (rootScreen instanceof SamplerMainWindow) {
            ((SamplerMainWindow) rootScreen).expandItemsFromDirectLink(sampleId);
        }
    }

    private void updateCaption(String id, MenuItem item) {
        String caption = samplesMenuConfig.getMenuItemCaption(item.getId());
        if (Strings.isNullOrEmpty(caption)) {
            caption = id;
        }
        getWindow().setCaption(caption);
    }

    private void updateLayout(Fragment fragment, MenuItem item) {
        getWindow().removeAll();

        TabSheet tabSheet = createTabSheet();

        String splitEnabled = item.getSplitEnabled();
        if (BooleanUtils.toBoolean(splitEnabled)) {
            SplitPanel split = uiComponents.create(SplitPanel.class);
            split.setSettingsEnabled(false);
            split.setOrientation(SplitPanel.ORIENTATION_VERTICAL);
            split.setWidth("100%");
            split.setHeight("100%");

            ComponentContainer vBox = createContainer(false, false, true, false);
            vBox.add(fragment);

            split.add(vBox);
            split.add(tabSheet);

            String sampleHeight = item.getSampleHeight();
            if (!Strings.isNullOrEmpty(sampleHeight)) {
                if (sampleHeight.contains("px")) {
                    String height = sampleHeight.replace("px", "");
                    split.setSplitPosition(Integer.parseInt(height) + SPLIT_POSITION_SPACING, SizeUnit.PIXELS);
                } else {
                    fragment.setHeight("100%");
                    split.setSplitPosition(Integer.parseInt(sampleHeight));
                }
            } else {
                fragment.setHeight("100%");
            }

            getWindow().add(split);
        } else {
            getWindow().add(fragment);
            getWindow().add(createSpacer());
            getWindow().add(tabSheet);
            getWindow().expand(tabSheet);
        }
    }

    private TabSheet createTabSheet() {
        tabSheet = uiComponents.create(TabSheet.NAME);
        tabSheet.setId("tabSheet");
        tabSheet.setHeightFull();
        return tabSheet;
    }

    private Component createSpacer() {
        Component spacer = uiComponents.create(Label.TYPE_STRING);
        spacer.setId("spacer");
        spacer.setHeight("10px");
        return spacer;
    }

    private void updateTabs(String id, MenuItem item) {
        tabSheet.removeAllTabs();

        String descriptionsPack = item.getDescriptionsPack();
        if (!Strings.isNullOrEmpty(descriptionsPack)) {
            String docUrlSuffix = item.getUrl();
            addTab(messageBundle.getMessage("sampleBrowser.description"),
                    createDescription(descriptionsPack, docUrlSuffix, id));
        }

        WindowInfo info = windowConfig.getWindowInfo(item.getId());
        String screenSrc = info.getTemplate();
        addSourceTab(screenSrc);

        String controller = item.getController();
        if (!Strings.isNullOrEmpty(controller)) {
            addSourceTab(controller);
        }

        List<String> otherFiles = item.getOtherFiles();
        if (CollectionUtils.isNotEmpty(otherFiles)) {
            otherFiles.forEach(this::addSourceTab);
        }

        String messagesPack = samplesHelper.findMessagePack(info);
        if (StringUtils.isNotEmpty(messagesPack)) {
            createMessagesContainers(messagesPack);
        }
    }

    private void loadScreenData(ScreenFragment screenFragment, Fragment fragment) {
        LoadDataBeforeShow annotation = screenFragment.getClass().getAnnotation(LoadDataBeforeShow.class);
        if (annotation != null && annotation.value()) {
            UiControllerUtils.getScreenData(fragment.getFrameOwner())
                    .loadAll();
        }
    }

    private ComponentContainer createContainer() {
        return createContainer(true, true, true, true);
    }

    private ComponentContainer createContainer(boolean topEnable, boolean rightEnable,
                                               boolean bottomEnable, boolean leftEnable) {
        VBoxLayout vBox = uiComponents.create(VBoxLayout.class);
        vBox.setMargin(topEnable, rightEnable, bottomEnable, leftEnable);
        vBox.setHeight("100%");

        return vBox;
    }

    private Component createDescription(String descriptionsPack, String docUrlSuffix, String frameId) {
        ScrollBoxLayout scrollBoxLayout = uiComponents.create(ScrollBoxLayout.class);
        scrollBoxLayout.addStyleName(DESCRIPTION_BOX_STYLE);
        scrollBoxLayout.setWidth("100%");
        scrollBoxLayout.setHeight("100%");
        scrollBoxLayout.setSpacing(true);

        scrollBoxLayout.add(descriptionText(frameId, descriptionsPack));

        HBoxLayout hbox = uiComponents.create(HBoxLayout.class);
        hbox.setWidth("100%");

        if (!Strings.isNullOrEmpty(docUrlSuffix)) {
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
        if (!Strings.isNullOrEmpty(text)) {
            sb.append(text);
            sb.append("<hr>");
        }
        Label<String> doc = uiComponents.create(Label.TYPE_STRING);
        doc.setHtmlEnabled(true);
        doc.setHtmlSanitizerEnabled(false);
        doc.setWidth("100%");
        doc.setValue(sb.toString());
        return doc;
    }

    private Component documentLinks(String descriptionsPack, String docUrlSuffix) {
        Link docLink = uiComponents.create(Link.class);
        Locale locale = userSessionSource.getLocale();
        String url = String.format(messages.getMessage(descriptionsPack, DOC_URL_MESSAGES_KEY, locale), docUrlSuffix);
        docLink.setUrl(url);
        docLink.setCaption(messages.getMessage(getClass(), "sampleBrowser.documentation"));
        docLink.setTarget("_blank");
        return docLink;
    }

    private Component permalink(String frameId) {
        PopupView permalink = uiComponents.create(PopupView.class);
        permalink.setAlignment(Component.Alignment.TOP_RIGHT);
        permalink.setHideOnMouseOut(false);
        permalink.setDescription(messages.getMessage(this.getClass(), "sampleBrowser.permalink.description"));
        permalink.setStyleName("external-link");

        TextField<String> content = uiComponents.create(TextField.TYPE_STRING);
        String value = ControllerUtils.getLocationWithoutParams() + "open?screen=" + frameId;
        content.setValue(value);
        content.setWidth((value.length() * 8) + "px");
        content.setEditable(false);
        content.selectAll();
        permalink.setPopupContent(content);

        permalink.addPopupVisibilityListener(event -> {
            if (event.isPopupVisible()) {
                content.focus();
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
        SourceCodeEditor editor = uiComponents.create(SourceCodeEditor.class);
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
        ComponentContainer container = createContainer();
        container.add(component);
        tabSheet.addTab(name, container);
        TabSheet.Tab tab = tabSheet.getTab(name);
        tab.setCaption(name);
    }

    private void addSourceTab(String src) {
        if (!Strings.isNullOrEmpty(src)) {
            SourceCodeEditor sourceCodeEditor = createSourceCodeEditor(getAceMode(src));
            sourceCodeEditor.setValue(samplesHelper.getFileContent(src));
            addTab(samplesHelper.getFileName(src), sourceCodeEditor);
        }
    }

    private AceMode getAceMode(String src) {
        String fileExtension = samplesHelper.getFileExtension(src);
        if ("xsd".equals(fileExtension)) {
            fileExtension = "xml";
        }
        return fileExtension != null ? AceMode.forFileEnding(fileExtension) : AceMode.text;
    }

    private Locale getUserLocale() {
        return userSessionSource.getUserSession().getLocale();
    }
}
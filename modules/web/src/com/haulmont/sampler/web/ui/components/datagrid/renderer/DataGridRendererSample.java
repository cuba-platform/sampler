package com.haulmont.sampler.web.ui.components.datagrid.renderer;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.ContentMode;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.Install;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.web.gui.components.renderers.WebImageRenderer;
import com.haulmont.cuba.web.gui.components.renderers.WebNumberRenderer;
import com.haulmont.sampler.entity.CountryGrowth;

import javax.inject.Inject;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@UiController("datagrid-renderer")
@UiDescriptor("datagrid-renderer.xml")
@LoadDataBeforeShow
public class DataGridRendererSample extends ScreenFragment {

    @Inject
    protected UserSessionSource userSessionSource;

    @Inject
    protected DataGrid<CountryGrowth> dataGrid;

    protected DecimalFormat percentFormat;
    @Inject
    protected Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        initPercentFormat();
        initRenderers();
    }

    protected void initPercentFormat() {
        percentFormat = (DecimalFormat) NumberFormat.getPercentInstance(userSessionSource.getLocale());
        percentFormat.setMultiplier(1);
        percentFormat.setMaximumFractionDigits(2);
    }

    protected void initRenderers() {
        dataGrid.getColumnNN("flag").setRenderer(new WebImageRenderer<>());
        dataGrid.getColumnNN("year2015").setRenderer(new WebNumberRenderer(percentFormat));

        DataGrid.ClickableTextRenderer<CountryGrowth> clickableTextRenderer =
                dataGrid.createRenderer(DataGrid.ClickableTextRenderer.class);
        clickableTextRenderer.setRendererClickListener(clickEvent -> {
            CountryGrowth item = clickEvent.getItem();
            notifications.create()
                    .withContentMode(ContentMode.HTML)
                    .withCaption("<b>" + item.getCountry() + "</b>")
                    .show();
        });
        dataGrid.getColumnNN("country").setRenderer(clickableTextRenderer);
    }

    @Install(to = "dataGrid.growth", subject = "columnGenerator")
    protected String dataGridGrowthColumnGenerator(DataGrid.ColumnGeneratorEvent<CountryGrowth> event) {
        CountryGrowth item = event.getItem();
        double growth = item.getYear2015() - item.getYear2014();

        return growth > 0
                ? "<font color='green'>" + percentFormat.format(growth) + "</font>"
                : "<font color='red'>" + percentFormat.format(growth) + "</font>";
    }
}
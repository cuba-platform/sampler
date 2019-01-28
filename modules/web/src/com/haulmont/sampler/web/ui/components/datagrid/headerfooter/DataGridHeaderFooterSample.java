package com.haulmont.sampler.web.ui.components.datagrid.headerfooter;

import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.DataGrid.FooterRow;
import com.haulmont.cuba.gui.components.DataGrid.HeaderCell;
import com.haulmont.cuba.gui.components.DataGrid.HeaderRow;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.gui.components.renderers.WebNumberRenderer;
import com.haulmont.sampler.entity.CountryGrowth;

import javax.inject.Inject;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;

@UiController("datagrid-header-footer")
@UiDescriptor("datagrid-header-footer.xml")
public class DataGridHeaderFooterSample extends ScreenFragment {
    @Inject
    private DataGrid<CountryGrowth> dataGrid;
    @Inject
    private CollectionContainer<CountryGrowth> countryGrowthDc;
    @Inject
    private CollectionLoader<CountryGrowth> countryGrowthLoader;
    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private MessageBundle messageBundle;

    private DecimalFormat percentFormat;

    @Subscribe
    protected void onInit(InitEvent event) {
        countryGrowthLoader.load();

        initPercentFormat();
        initHeader();
        initFooter();
        initRenderers();
    }

    private void initPercentFormat() {
        percentFormat = (DecimalFormat) NumberFormat.getPercentInstance(userSessionSource.getLocale());
        percentFormat.setMultiplier(1);
        percentFormat.setMaximumFractionDigits(2);
    }

    private void initRenderers() {
        dataGrid.getColumnNN("year2014").setRenderer(new WebNumberRenderer(percentFormat));
        dataGrid.getColumnNN("year2015").setRenderer(new WebNumberRenderer(percentFormat));
    }

    private void initHeader() {
        HeaderRow headerRow = dataGrid.prependHeaderRow();
        HeaderCell headerCell = headerRow.join("year2014", "year2015");
        headerCell.setText("GDP growth");
        headerCell.setStyleName("center-bold");
    }

    private void initFooter() {
        FooterRow footerRow = dataGrid.appendFooterRow();
        footerRow.getCell("country").setHtml("<strong>" + messageBundle.getMessage("average") + "</strong>");
        footerRow.getCell("year2014").setText(percentFormat.format(getAverage("year2014")));
        footerRow.getCell("year2015").setText(percentFormat.format(getAverage("year2015")));
    }

    private double getAverage(String propertyId) {
        double average = 0.0;
        Collection<CountryGrowth> items = countryGrowthDc.getItems();
        for (CountryGrowth countryGrowth : items) {
            Double value = countryGrowth.getValue(propertyId);
            average += value != null ? value : 0.0;
        }
        return average / items.size();
    }
}

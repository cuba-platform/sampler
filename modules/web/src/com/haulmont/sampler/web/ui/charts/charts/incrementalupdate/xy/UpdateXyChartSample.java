package com.haulmont.sampler.web.ui.charts.charts.incrementalupdate.xy;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Facets;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.PointValue;
import org.apache.commons.lang3.RandomUtils;

import javax.inject.Inject;
import java.util.List;

@UiController("update-xy-chart")
@UiDescriptor("update-xy-chart.xml")
@LoadDataBeforeShow
public class UpdateXyChartSample extends ScreenFragment {

    @Inject
    private CollectionContainer<PointValue> pointsDc;
    @Inject
    private Metadata metadata;
    @Inject
    private Label<String> statusLabel;
    @Inject
    private Facets facets;

    private Timer timer;

    @Subscribe
    protected void onInit(InitEvent event) {
        timer = facets.create(Timer.class);
        timer.setDelay(5000);
        timer.setRepeating(true);
        getHostScreen().getWindow().addFacet(timer);

        timer.addTimerActionListener(timerActionEvent -> {
            addDate();
            removeDate();
        });
        timer.start();
    }

    @Subscribe("startTimer")
    protected void onStartTimerClick(Button.ClickEvent event) {
        timer.start();
        statusLabel.setValue("Update enabled");
    }

    @Subscribe("stopTimer")
    protected void onStopTimerClick(Button.ClickEvent event) {
        timer.stop();
        statusLabel.setValue("Update disabled");
    }

    private void addDate() {
        pointsDc.getMutableItems().add(generatePointValue());
    }

    private void removeDate() {
        List<PointValue> items = pointsDc.getMutableItems();
        if (!items.isEmpty()) {
            items.remove(0);
        }
    }

    private PointValue generatePointValue() {
        PointValue pointValue = metadata.create(PointValue.class);
        pointValue.setX((RandomUtils.nextInt(0, 20) - 5) * RandomUtils.nextDouble(0, 1));
        pointValue.setY((RandomUtils.nextInt(0, 40) - 20) * RandomUtils.nextDouble(0, 1));
        pointValue.setValue(RandomUtils.nextInt(10, 100));
        return pointValue;
    }
}
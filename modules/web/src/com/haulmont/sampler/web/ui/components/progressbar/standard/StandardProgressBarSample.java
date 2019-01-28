package com.haulmont.sampler.web.ui.components.progressbar.standard;

import com.haulmont.cuba.gui.components.ProgressBar;
import com.haulmont.cuba.gui.executors.BackgroundTask;
import com.haulmont.cuba.gui.executors.BackgroundTaskHandler;
import com.haulmont.cuba.gui.executors.BackgroundWorker;
import com.haulmont.cuba.gui.executors.TaskLifeCycle;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.TimeUnit;

@UiController("standard-progressbar")
@UiDescriptor("standard-progressbar.xml")
public class StandardProgressBarSample extends ScreenFragment {

    private static final int ITERATIONS = 5;

    @Inject
    private ProgressBar progressBar;
    @Inject
    private BackgroundWorker backgroundWorker;

    @Subscribe
    protected void onInit(InitEvent event) {
        BackgroundTask<Integer, Void> task = new BackgroundTask<Integer, Void>(300, TimeUnit.SECONDS, getHostScreen()) {
            @Override
            public Void run(TaskLifeCycle<Integer> taskLifeCycle) throws Exception {
                for (int i = 1; i <= ITERATIONS; i++) {
                    TimeUnit.SECONDS.sleep(2);
                    taskLifeCycle.publish(i);
                }
                return null;
            }

            @Override
            public void progress(List<Integer> changes) {
                double lastValue = changes.get(changes.size() - 1);
                progressBar.setValue(lastValue / ITERATIONS);
            }
        };

        BackgroundTaskHandler taskHandler = backgroundWorker.handle(task);
        taskHandler.execute();
    }
}
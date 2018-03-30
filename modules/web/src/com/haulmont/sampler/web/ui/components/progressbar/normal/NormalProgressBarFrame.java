package com.haulmont.sampler.web.ui.components.progressbar.normal;

import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.ProgressBar;
import com.haulmont.cuba.gui.executors.*;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NormalProgressBarFrame extends AbstractFrame {

    private static final int ITERATIONS = 5;

    @Inject
    private ProgressBar progressBar;
    @Inject
    private BackgroundWorker backgroundWorker;

    @Override
    public void init(Map<String, Object> params) {
        BackgroundTask<Integer, Void> task = new BackgroundTask<Integer, Void>(300, TimeUnit.SECONDS, getFrame()) {
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
                float lastValue = changes.get(changes.size() - 1);
                progressBar.setValue(lastValue / ITERATIONS);
            }
        };

        BackgroundTaskHandler taskHandler = backgroundWorker.handle(task);
        taskHandler.execute();
    }
}
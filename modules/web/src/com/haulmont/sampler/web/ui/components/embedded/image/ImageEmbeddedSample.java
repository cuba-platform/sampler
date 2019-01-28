package com.haulmont.sampler.web.ui.components.embedded.image;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Embedded;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.UUID;

@UiController("image-embedded")
@UiDescriptor("image-embedded.xml")
public class ImageEmbeddedSample extends ScreenFragment {

    @Inject
    private Embedded imageFromFileStorage;

    @Inject
    private FileStorageService fileStorageService;
    @Inject
    private Metadata metadata;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        loadImageFromFileStorage();
    }

    private void loadImageFromFileStorage() {
        // A file descriptor entity is usually stored in the database and referenced by an attribute of your data
        // model entity. Here we simply create it for the purpose of the example.
        FileDescriptor imageFile = metadata.create(FileDescriptor.class);
        imageFile.setId(UUID.fromString("61a6a1ee-f13a-f44f-0201-c2f9b3288305"));
        imageFile.setName("platform-logo.png");
        imageFile.setCreateDate(new Date(1427857200503L));
        imageFile.setExtension("png");

        byte[] bytes = null;
        try {
            bytes = fileStorageService.loadFile(imageFile);
        } catch (FileStorageException e) {
            notifications.create()
                    .withCaption("Unable to load image file")
                    .show();
        }
        if (bytes != null) {
            imageFromFileStorage.setSource(imageFile.getName(), new ByteArrayInputStream(bytes));
            imageFromFileStorage.setType(Embedded.Type.IMAGE);
        } else {
            imageFromFileStorage.setVisible(false);
        }
    }
}
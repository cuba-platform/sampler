package com.haulmont.sampler.web.ui.components.image.filedescriptor;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component.Alignment;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.Image.ScaleMode;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.data.value.ContainerValueSource;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;

@UiController("filedescriptor-image")
@UiDescriptor("filedescriptor-image.xml")
@LoadDataBeforeShow
public class FileDescriptorImageSample extends ScreenFragment {

    @Inject
    private Table<Customer> table;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        table.addGeneratedColumn("avatar", customer -> {
            if (customer.getAvatar() != null) {
                Image avatarImage = uiComponents.create(Image.class);
                avatarImage.setScaleMode(ScaleMode.SCALE_DOWN);
                avatarImage.setAlignment(Alignment.MIDDLE_CENTER);
                avatarImage.setWidth("100%");
                avatarImage.setHeight("30px");

                avatarImage.setValueSource(new ContainerValueSource<>(table.getInstanceContainer(customer), "avatar"));
                return avatarImage;
            }
            return null;
        });
    }
}
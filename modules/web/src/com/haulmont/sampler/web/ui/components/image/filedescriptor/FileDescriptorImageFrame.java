package com.haulmont.sampler.web.ui.components.image.filedescriptor;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.sampler.entity.Customer;

import javax.inject.Inject;
import java.util.Map;

public class FileDescriptorImageFrame extends AbstractFrame {

    @Inject
    private Table<Customer> table;

    @Inject
    private ComponentsFactory factory;

    @Override
    public void init(Map<String, Object> params) {
        table.addGeneratedColumn("avatar", customer -> {
            if (customer.getAvatar() != null) {
                Image avatarImage = factory.createComponent(Image.class);
                avatarImage.setScaleMode(Image.ScaleMode.SCALE_DOWN);
                avatarImage.setAlignment(Alignment.MIDDLE_CENTER);
                avatarImage.setWidth("100%");
                avatarImage.setHeight("30px");

                avatarImage.setDatasource(table.getItemDatasource(customer), "avatar");
                return avatarImage;
            }
            return null;
        });
    }
}
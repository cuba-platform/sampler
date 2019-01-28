package com.haulmont.sampler.web.ui.entities.product;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Product;

@UiController("sampler$Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}
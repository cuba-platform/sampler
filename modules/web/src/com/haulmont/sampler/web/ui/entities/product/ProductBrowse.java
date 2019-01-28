package com.haulmont.sampler.web.ui.entities.product;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.sampler.entity.Product;

@UiController("sampler$Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}
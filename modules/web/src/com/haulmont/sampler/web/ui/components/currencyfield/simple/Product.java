package com.haulmont.sampler.web.ui.components.currencyfield.simple;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "SAMPLER_PRODUCT")
@Entity(name = "sampler$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 4256660269544840258L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

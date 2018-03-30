package com.haulmont.sampler.service;


import com.haulmont.sampler.entity.OrderItem;

import java.util.List;
import java.util.UUID;

public interface DataGridDetailsGeneratorService {
    String NAME = "sampler_DataGridDetailsGeneratorService";

    List<OrderItem> loadOrderItemsById(UUID orderId);
}
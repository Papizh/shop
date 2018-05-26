package com.example.first.service;

import com.example.first.dto.*;

import java.util.List;

public interface DeliveryService {


    void findOne(Long id);
    DeliveryResponse save(DeliveryRequest deliveryRequest);
    List<DeliveryResponse> findAll();
    DeliveryResponse update(Long id, DeliveryRequest deliveryRequest);

    SubCategoryResponse update(Long id, SubCategoryRequest subCategoryRequest);

    void delete(Long id);
}

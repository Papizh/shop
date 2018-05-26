package com.example.first.service;

import com.example.first.dto.GoodsForOrdersRequest;
import com.example.first.dto.GoodsForOrdersRequest;
import com.example.first.dto.GoodsForOrdersResponse;
import com.example.first.entity.Goods;
import com.example.first.entity.GoodsForOrders;

import java.util.List;

public interface GoodsForOrdersService {

    GoodsForOrders findOne(Long id);
    GoodsForOrdersResponse save(GoodsForOrdersRequest goodsForOrdersRequest);
    List<GoodsForOrdersResponse> findAll();
    GoodsForOrdersResponse update(Long id, GoodsForOrdersRequest goodsForOrdersRequest);
    void delete(Long id);
}

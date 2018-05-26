package com.example.first.service;

import com.example.first.dto.OrderShopRequest;
import com.example.first.dto.OrderShopResponse;
import com.example.first.entity.OrderShop;
import java.util.List;

public interface OrderShopService {

    List<OrderShop> findAll();
    OrderShop findOne(Long id);
    OrderShopResponse save(OrderShopRequest orderShopRequest);
    void delete(Long id);
    OrderShopResponse update(Long id, OrderShopRequest orderShopRequest);
}

package com.example.first.service.serviceImpl;

import com.example.first.dto.*;
import com.example.first.entity.OrderShop;
import com.example.first.repository.DeliveryRepository;
import com.example.first.repository.OrderShopRepository;
import com.example.first.repository.UserRepository;
import com.example.first.service.OrderShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderShopServiceImpl implements OrderShopService {

    @Autowired
    OrderShopRepository orderShopRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    DeliveryRepository deliveryRepository;

    @Override
    public OrderShopResponse save(OrderShopRequest orderShopRequest) {
        OrderShop orderShop = new OrderShop();

        orderShop.setId(orderShop.getId());
        orderShop.setData(orderShop.getData());
        orderShop.setConfirm(orderShop.isConfirm());
        orderShop.setQuantity(orderShop.getQuantity());
        orderShop = orderShopRepository.save(orderShop);
        orderShop.setUser(userRepository.findOne(orderShopRequest.getIdUser()));
        orderShop.setDelivery(deliveryRepository.findOne(orderShopRequest.getIdDelivery()));
        return new OrderShopResponse(orderShopRepository.save(orderShop));
    }

    @Override
    public List<OrderShop> findAll() {
        return null;
    }

    @Override
    public OrderShop findOne(Long id) {
        return null;
    }

    @Override
    public OrderShopResponse update(Long id, OrderShopRequest orderShopRequest) {
        return null;
    }

    @Override
    public void delete(Long id){
        orderShopRepository.delete(id);
    }
}


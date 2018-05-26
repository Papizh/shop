package com.example.first.controller;


import com.example.first.dto.GuestRequest;
import com.example.first.dto.GuestResponse;
import com.example.first.dto.OrderShopRequest;
import com.example.first.dto.OrderShopResponse;
import com.example.first.entity.Guest;
import com.example.first.entity.OrderShop;
import com.example.first.service.OrderShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orderShop")
public class OrderShopController {

    @Autowired
    OrderShopService orderShopService;

    @PostMapping
    public OrderShopResponse save(@RequestBody OrderShopRequest orderShopRequest){
        return orderShopService.save(orderShopRequest);
    }

    @GetMapping
    public List<OrderShop> getAll(){
        return orderShopService.findAll();
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        orderShopService.delete(id);
    }

}


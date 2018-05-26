package com.example.first.controller;


import com.example.first.dto.*;
import com.example.first.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
@CrossOrigin
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public DeliveryResponse save(@RequestBody DeliveryRequest deliveryRequest){
        return deliveryService.save(deliveryRequest);
    }


    @GetMapping
    public List<DeliveryResponse> getAll() {
        return deliveryService.findAll();
    }

    @PutMapping("/{id}")
    public DeliveryResponse update(@PathVariable Long id, @RequestBody DeliveryRequest deliveryRequest){
        return deliveryService.update(id,deliveryRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        deliveryService.delete(id);
    }

}




package com.example.first.controller;


import com.example.first.dto.GoodsForOrdersRequest;
import com.example.first.dto.GoodsForOrdersResponse;
import com.example.first.service.GoodsForOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/goodsForOrder")
public class GoodsForOrdersController {


    @Autowired
    private GoodsForOrdersService goodsForOrdersService;


    @PostMapping
    public GoodsForOrdersResponse save(@RequestBody GoodsForOrdersRequest goodsForOrdersRequest){
        return goodsForOrdersService.save(goodsForOrdersRequest);
    }

    @GetMapping
    public List<GoodsForOrdersResponse> getAll() {
        return goodsForOrdersService.findAll();
    }

    @PutMapping("/{id}")
    public GoodsForOrdersResponse update(@PathVariable Long id, @RequestBody GoodsForOrdersRequest goodsForOrdersRequest){
        return goodsForOrdersService.update(id,goodsForOrdersRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        goodsForOrdersService.delete(id);
    }
}


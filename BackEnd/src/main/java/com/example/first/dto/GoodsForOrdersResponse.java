package com.example.first.dto;

import com.example.first.entity.GoodsForOrders;

public class GoodsForOrdersResponse {

    private Long id;
    private Long count;
    private Long unitPrice;

    private GoodsResponse goodsResponse;

    public GoodsForOrdersResponse(GoodsForOrders goodsForOrders) {
        this.id=goodsForOrders.getId();
        this.count=goodsForOrders.getCount();
        this.unitPrice=goodsForOrders.getUnitPrice();
        this.goodsResponse = new GoodsResponse(goodsForOrders.getGoods());
        } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public GoodsResponse getGoodsResponse() {
        return goodsResponse;
    }

    public void setGoodsResponse(GoodsResponse goodsResponse) {
        this.goodsResponse = goodsResponse;
    }
}

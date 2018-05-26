package com.example.first.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GoodsForOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long count;
    private Long unitPrice;

    @ManyToMany(mappedBy = "goodsForOrders")
    private Set<OrderShop> orderShops = new HashSet<OrderShop>();


    @ManyToOne
    private Goods goods;

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

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsForOrders() {

    }

}

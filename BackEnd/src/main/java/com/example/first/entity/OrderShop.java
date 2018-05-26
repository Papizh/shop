package com.example.first.entity;

import javax.persistence.*;
import java.security.acl.Group;
import java.util.*;

@Entity
public class OrderShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;
    private boolean confirm;
    private int quantity;

    @ManyToOne
    Delivery delivery;

    @ManyToOne
    User user;

    @ManyToMany
    @JoinTable(
            name = "orderShopGoodsForOrder",
            joinColumns = { @JoinColumn(name = "orderShop_id") },
            inverseJoinColumns = { @JoinColumn(name = "goodsForOrders_id") }
    )
    private Set<GoodsForOrders> goodsForOrders = new HashSet<GoodsForOrders>();

    public OrderShop() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;

    }

    public Set<GoodsForOrders> getGoodsForOrders() {
        return goodsForOrders;
    }

    public void setGoodsForOrders(Set<GoodsForOrders> goodsForOrders) {
        this.goodsForOrders = goodsForOrders;
    }
}

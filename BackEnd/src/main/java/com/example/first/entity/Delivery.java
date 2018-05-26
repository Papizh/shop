package com.example.first.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameDeliveryPerson;
    private String address;
    private Long time;
    private Long date;
    private Long price;
    private String statusDelivery;


    @OneToMany(mappedBy = "delivery")
    private List<OrderShop> orderShopList = new ArrayList<>();

    public Delivery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDeliveryPerson() {
        return nameDeliveryPerson;
    }

    public void setNameDeliveryPerson(String nameDeliveryPerson) {
        this.nameDeliveryPerson = nameDeliveryPerson;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getStatusDelivery() {
        return statusDelivery;
    }

    public void setStatusDelivery(String statusDelivery) {
        this.statusDelivery = statusDelivery;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OrderShop> getOrderShopList() {
        return orderShopList;
    }

    public void setOrderShopList(List<OrderShop> orderShopList) {
        this.orderShopList = orderShopList;
    }
}

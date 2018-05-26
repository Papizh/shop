package com.example.first.dto;

import com.example.first.entity.Delivery;

public class DeliveryResponse {

    private Long id;
    private String nameDeliveryPerson;
    private String address;
    private Long time;
    private Long date;
    private Long price;
    private String statusDelivery;

    public DeliveryResponse(Delivery delivery) {
        this.id = delivery.getId();
        this.nameDeliveryPerson = delivery.getNameDeliveryPerson();
        this.address = delivery.getAddress();
        this.date = delivery.getDate();
        this.price = delivery.getPrice();
        this.statusDelivery = delivery.getStatusDelivery();
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
}

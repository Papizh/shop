package com.example.first.dto;

import com.example.first.entity.OrderShop;

import java.util.Date;

public class OrderShopResponse {

    private Long id;

    private Date    data;
    private boolean confirm;
    private int     quantity;

    private DeliveryResponse deliveryResponse;
    private UserResponse userResponse;

    public OrderShopResponse(OrderShop orderShop) {
        this.data = orderShop.getData();
        this.confirm = orderShop.isConfirm();
        this.quantity = orderShop.getQuantity();
        this.userResponse = new UserResponse(orderShop.getUser());
        this.deliveryResponse = new DeliveryResponse(orderShop.getDelivery());
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

    public UserResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }

    public DeliveryResponse getDeliveryResponse() {
        return deliveryResponse;
    }

    public void setDeliveryResponse(DeliveryResponse deliveryResponse) {
        this.deliveryResponse = deliveryResponse;
    }
}


package com.example.first.dto;

import com.example.first.entity.Servises;


public class ServisesResponse {

    private Long id;

    private String nameServises;

    public ServisesResponse(Servises servises) {
        this.id= servises.getId();
        this.nameServises= servises.getNameServises();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameServises() {
        return nameServises;
    }

    public void setNameServises(String nameServises) {
        this.nameServises = nameServises;
    }
}

package com.example.first.dto;

import com.example.first.entity.SubServises;

public class SubServisesResponse {

    private Long id;

    private String nameSubServises;

    private ServisesResponse servisesResponse;

    public SubServisesResponse(SubServises subServises) {
        this.id = subServises.getId();
        this.nameSubServises = subServises.getNameSubServises();

        this.servisesResponse = new ServisesResponse(subServises.getServises());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSubServises() {
        return nameSubServises;
    }

    public void setNameSubServises(String nameSubServises) {
        this.nameSubServises = nameSubServises;
    }

    public ServisesResponse getServisesResponse() {
        return servisesResponse;
    }


    public void setServisesResponse(ServisesResponse servisesResponse) {
        this.servisesResponse = servisesResponse;
    }
}
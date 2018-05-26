package com.example.first.service;

import com.example.first.dto.ServisesRequest;
import com.example.first.dto.ServisesResponse;
import com.example.first.entity.Servises;

import java.util.List;

public interface ServisesService {

    List<Servises> findAll();
    Servises findOne(Long id);
    ServisesResponse save(ServisesRequest servisesRequest);
    void delete(Long id);
    ServisesResponse update(Long id, ServisesRequest servisesRequest);
}



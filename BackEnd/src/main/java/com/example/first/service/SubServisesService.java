package com.example.first.service;

import com.example.first.dto.SubServisesRequest;
import com.example.first.dto.SubServisesResponse;

import java.util.List;

public interface SubServisesService {

    SubServisesResponse save(SubServisesRequest subServisesRequest);
    List<SubServisesResponse> findAll();
    SubServisesResponse update(Long id, SubServisesRequest subServisesRequest);
    void delete(Long id);


}

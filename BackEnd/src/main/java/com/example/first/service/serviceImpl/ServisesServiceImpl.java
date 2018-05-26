package com.example.first.service.serviceImpl;


import com.example.first.dto.ServisesRequest;
import com.example.first.dto.ServisesResponse;
import com.example.first.entity.Servises;
import com.example.first.repository.ServisesRepository;
import com.example.first.service.ServisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServisesServiceImpl implements ServisesService {

    @Autowired
    private ServisesRepository servisesRepository;


    @Override
    public List<Servises> findAll() {
        return servisesRepository.findAll();
    }

    @Override
    public Servises findOne(Long id) {
        return null;
    }


    @Override
    public ServisesResponse save(ServisesRequest servisesRequest) {
        Servises servises = new Servises();
        servises.setNameServises(servisesRequest.getNameServises());

        servises = servisesRepository.save(servises);
        return new ServisesResponse(servises);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ServisesResponse update(Long id, ServisesRequest servisesRequest) {
        Servises servises = servisesRepository.findOne(id);
        servises.setNameServises(servisesRequest.getNameServises());
        return new ServisesResponse(servisesRepository.save(servises));
    }
}

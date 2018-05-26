package com.example.first.service.serviceImpl;

import com.example.first.dto.SubServisesRequest;
import com.example.first.dto.SubServisesResponse;
import com.example.first.entity.SubServises;
import com.example.first.repository.ServisesRepository;
import com.example.first.repository.SubServisesRepository;
import com.example.first.service.SubServisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubServisesServiceImpl implements SubServisesService {

    @Autowired
    private ServisesRepository servisesRepository;

    @Autowired
    private SubServisesRepository subServisesRepository;

    @Override
    public SubServisesResponse save(SubServisesRequest subServisesRequest) {
        SubServises subServises = new SubServises();
        subServises.setNameSubServises(subServisesRequest.getNameSubServises());
        subServises.setServises(servisesRepository.findOne(subServisesRequest.getIdServises()));
        return new SubServisesResponse(subServisesRepository.save(subServises));
    }



    @Override
    public List<SubServisesResponse> findAll() {
        List<SubServises> subServisesList = subServisesRepository.findAll();
        List<SubServisesResponse> subServisesResponses =new ArrayList<>();
        for(SubServises subServises:subServisesList){
            subServisesResponses.add(new SubServisesResponse(subServises));
        }
        return subServisesResponses;
    }

    @Override
    public SubServisesResponse update(Long id, SubServisesRequest subServisesRequest) {
        return null;
    }

    @Override
    public void delete(Long id){
        subServisesRepository.delete(id);
    }
}


package com.example.first.service.serviceImpl;

import com.example.first.dto.DeliveryRequest;
import com.example.first.dto.DeliveryResponse;
import com.example.first.dto.SubCategoryRequest;
import com.example.first.dto.SubCategoryResponse;
import com.example.first.entity.Delivery;
import com.example.first.repository.DeliveryRepository;
import com.example.first.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public void findOne(Long id) {

    }

    @Override
    public DeliveryResponse save(DeliveryRequest deliveryRequest) {
        Delivery delivery = new Delivery();
        delivery.setId(deliveryRequest.getId());
        delivery.setAddress(deliveryRequest.getAddress());
        delivery.setNameDeliveryPerson(delivery.getNameDeliveryPerson());
        delivery.setDate(delivery.getDate());
        delivery.setPrice(delivery.getPrice());
        delivery.setStatusDelivery(delivery.getStatusDelivery());
        delivery = deliveryRepository.save(delivery);
        return new DeliveryResponse(deliveryRepository.save(delivery));
    }

    @Override
    public List<DeliveryResponse> findAll() {
        return null;
    }

    @Override
    public DeliveryResponse update(Long id, DeliveryRequest deliveryRequest) {
        return null;
    }

    @Override
    public SubCategoryResponse update(Long id, SubCategoryRequest subCategoryRequest) {
        return null;
    }

    @Override
    public void delete(Long id){
        deliveryRepository.delete(id);
    }
}



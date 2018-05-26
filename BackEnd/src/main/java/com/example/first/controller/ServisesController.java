package com.example.first.controller;

import com.example.first.dto.ServisesRequest;
import com.example.first.dto.ServisesResponse;

import com.example.first.entity.Servises;
import com.example.first.service.ServisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @CrossOrigin
    @RequestMapping("/servises")
    public class ServisesController {


    @Autowired
    private ServisesService servisesService;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ServisesResponse save(@RequestBody ServisesRequest categoryRequest){
        return servisesService.save(categoryRequest);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<Servises> getAll(){
        return servisesService.findAll();
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public ServisesResponse update(@PathVariable Long id, @RequestBody ServisesRequest servisesRequest){
        return servisesService.update(id,servisesRequest);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void delete(@PathVariable Long id){
        servisesService.delete(id);
    }


}

package com.example.first.controller;

import com.example.first.dto.SubCategoryRequest;
import com.example.first.dto.SubCategoryResponse;
import com.example.first.dto.SubServisesRequest;
import com.example.first.dto.SubServisesResponse;
import com.example.first.entity.SubServises;
import com.example.first.service.SubCategoryService;
import com.example.first.service.SubServisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/subServises")
public class SubServisesController {

    @Autowired
    private SubServisesService subServisesService;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public SubServisesResponse save(@RequestBody SubServisesRequest subServisesRequest) {
        return subServisesService.save(subServisesRequest);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public SubServisesResponse update(@PathVariable Long id, @RequestBody SubServisesRequest subServisesRequest) {
        return subServisesService.update(id, subServisesRequest);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void delete(@PathVariable Long id) {
        subServisesService.delete(id);
    }

    @GetMapping @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<SubServisesResponse> getAll() {
        return subServisesService.findAll();
    }
}
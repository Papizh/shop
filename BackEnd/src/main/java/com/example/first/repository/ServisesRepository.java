package com.example.first.repository;

import com.example.first.entity.Servises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServisesRepository extends JpaRepository<Servises, Long>{
}

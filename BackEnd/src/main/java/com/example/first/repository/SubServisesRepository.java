package com.example.first.repository;

import com.example.first.entity.SubServises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubServisesRepository extends JpaRepository<SubServises, Long> {
}

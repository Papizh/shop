package com.example.first.repository;

import com.example.first.entity.GoodsForOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsForOrdersRepository extends JpaRepository<GoodsForOrders, Long>{
}

package com.example.first.repository;

import com.example.first.entity.OrderShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderShopRepository extends JpaRepository<OrderShop,Long> {
}

package com.br.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
    
} 
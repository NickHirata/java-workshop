package com.br.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
    
} 
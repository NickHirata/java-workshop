package com.br.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    
} 
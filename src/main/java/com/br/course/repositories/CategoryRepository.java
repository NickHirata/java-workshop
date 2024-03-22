package com.br.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    
} 
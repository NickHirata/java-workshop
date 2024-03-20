package com.br.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    
} 
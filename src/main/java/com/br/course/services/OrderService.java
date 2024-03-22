package com.br.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.course.entities.Order;
import com.br.course.repositories.OrderRepository;

@Service
public class OrderService {

    //faz a injeção de dependencias 
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj= repository.findById(id);
        return obj.get();
    }

    
}

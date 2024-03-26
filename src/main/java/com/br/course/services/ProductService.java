package com.br.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.course.entities.Product;
import com.br.course.repositories.ProductRepository;

@Service
public class ProductService {

    //faz a injeção de dependencias 
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj= repository.findById(id);
        return obj.get();
    }

    
}

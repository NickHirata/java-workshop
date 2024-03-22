package com.br.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.course.entities.Category;
import com.br.course.repositories.CategoryRepository;

@Service
public class CategoryService {

    //faz a injeção de dependencias 
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj= repository.findById(id);
        return obj.get();
    }

    
}

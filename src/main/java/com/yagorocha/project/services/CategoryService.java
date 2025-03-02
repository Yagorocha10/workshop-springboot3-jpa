package com.yagorocha.project.services;

import com.yagorocha.project.entities.Category;
import com.yagorocha.project.entities.User;
import com.yagorocha.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    public List<Category> findALL() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }



}

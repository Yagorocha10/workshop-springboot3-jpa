package com.yagorocha.project.services;

import com.yagorocha.project.entities.Order;
import com.yagorocha.project.entities.User;
import com.yagorocha.project.repositories.OrderRepository;
import com.yagorocha.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    @Autowired
    private OrderRepository repository;

    public List<Order> findALL() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }



}

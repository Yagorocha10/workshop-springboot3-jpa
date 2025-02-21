package com.yagorocha.project.repositories;

import com.yagorocha.project.entities.Order;
import com.yagorocha.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {



}

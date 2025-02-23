package com.yagorocha.project.repositories;

import com.yagorocha.project.entities.OrderItem;
import com.yagorocha.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}

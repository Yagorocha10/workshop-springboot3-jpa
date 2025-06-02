package com.yagorocha.course.repositories;

import com.yagorocha.course.entities.Order;
import com.yagorocha.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

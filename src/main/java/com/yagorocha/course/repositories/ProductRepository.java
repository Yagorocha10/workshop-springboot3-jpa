package com.yagorocha.course.repositories;

import com.yagorocha.course.entities.Category;
import com.yagorocha.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.yagorocha.project.repositories;

import com.yagorocha.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {



}

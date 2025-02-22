package com.yagorocha.project.repositories;

import com.yagorocha.project.entities.Category;
import com.yagorocha.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {



}

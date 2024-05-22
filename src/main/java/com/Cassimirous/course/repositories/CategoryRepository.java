package com.Cassimirous.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cassimirous.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

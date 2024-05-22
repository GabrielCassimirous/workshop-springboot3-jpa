package com.Cassimirous.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cassimirous.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}

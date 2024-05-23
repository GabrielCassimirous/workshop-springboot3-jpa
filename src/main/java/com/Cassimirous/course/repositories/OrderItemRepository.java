package com.Cassimirous.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cassimirous.course.entities.OrderItem;
import com.Cassimirous.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

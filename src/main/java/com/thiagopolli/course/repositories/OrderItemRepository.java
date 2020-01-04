package com.thiagopolli.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thiagopolli.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long> {
	
	

}

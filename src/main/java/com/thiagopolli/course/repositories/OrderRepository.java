package com.thiagopolli.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thiagopolli.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {
	
	

}

package com.thiagopolli.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thiagopolli.course.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {
	
	

}

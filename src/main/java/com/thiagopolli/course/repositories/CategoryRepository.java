package com.thiagopolli.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thiagopolli.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {
	
	

}

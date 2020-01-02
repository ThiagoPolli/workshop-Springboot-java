package com.thiagopolli.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thiagopolli.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
	
	

}

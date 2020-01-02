package com.thiagopolli.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagopolli.course.entities.User;



@RestController
@RequestMapping(value = "/users")
public class UserResource  {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1l, "Maria", "Maria@gmail", "9999999", "123456");
		return ResponseEntity.ok().body(u);
		
	}
	
	

}

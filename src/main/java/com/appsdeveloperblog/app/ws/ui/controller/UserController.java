package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int page, 
			@RequestParam(value="limit") int limit) {
		return "get user was called with pahe " + page + " and limit " + limit;
	}
	
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId) {
		return "get user was called with userId : " + userId;
	}
	
	
	@PostMapping
	public String createUser() {
		return "creaye user was called";
		
	}
	
	@PutMapping
	public String updateUser() {
		return "update user by called";
		
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user by called";
	}

}

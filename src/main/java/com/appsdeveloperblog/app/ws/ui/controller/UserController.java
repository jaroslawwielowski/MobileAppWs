package com.appsdeveloperblog.app.ws.ui.controller;


//import static org.mockito.Mockito.never;

import org.hibernate.validator.cfg.context.ReturnValueConstraintMappingContext;
import org.springframework.http.MediaType;
//import org.junit.Test;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/users") //
public class UserController {

	@GetMapping
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit,
			@RequestParam(value = "sort", defaultValue = "DSCR", required = false) String sort) {
		return "get user was called with pahe " + page + " and limit " + limit + " and sort " + sort;
	}

	@GetMapping(path = "/{userId}", 
			produces = 
		{ MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
	})
	public UserRest getUser(@PathVariable String userId) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail("test@Test.com");
		returnValue.setFirstName("Jarosław");
		returnValue.setLastName("Wielowski");
		return returnValue;
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

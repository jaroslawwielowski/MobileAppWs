package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message = "firstname cannot be null")
	@Size(min = 2, message="firstname must hev minimum 2 characters")
	private String firstName;
	@NotNull(message = "lastname cannot be null")
	@Size(min = 2, message="lasttname must hev minimum 2 characters")

	private String lastName;
	@NotNull(message = "email cannot be null")
	@Email
	private String email;
	@NotNull(message = "password name cannot be null")
	@Size(min = 8, max = 30, message = "password must be betwen 8 and 30 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

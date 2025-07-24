package com.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class LoginRequestDTO {
	@Email(message = "Enter valid Email")
	@NotBlank(message="Email is Required")
	private String email;
	@NotBlank(message="Password is Required")
	private String password;
	

}

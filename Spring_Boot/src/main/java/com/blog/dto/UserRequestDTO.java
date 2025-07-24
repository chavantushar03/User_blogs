package com.blog.dto;

import java.time.LocalDateTime;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO extends BaseDTO{
	public UserRequestDTO(Long id,LocalDateTime createdOn, LocalDateTime updatedOn)
	{
		super(id,createdOn,updatedOn);
	}
	@NotBlank(message = "FirstName is Required")
	private String firstName;
	@NotBlank(message = "LastName is Required")
	private String lastName;
	@Email(message = "Email is not valid")
	@NotBlank(message = "Email is Required")
	private String  email;
	@Pattern(
		    regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$",
		    message = "Password must be at least 8 characters long and include uppercase, lowercase, number, and special character"
		)
	@NotBlank(message = "Password is Required")
	private String password;
	 @Pattern(
		        regexp = "^[6-9]\\d{9}$",
		        message = "Phone number must be a valid 10-digit Indian number starting with 6-9"
		    )
	 @NotBlank(message = "Phone Number is Required")
	private int phoneNumber;
	
}

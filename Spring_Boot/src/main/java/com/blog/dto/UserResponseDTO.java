package com.blog.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO extends BaseDTO{
	private String firstName;
	private String lastName;
	private String  email;
	private int phoneNumber;
	public UserResponseDTO(Long id,LocalDateTime createdOn, LocalDateTime updatedOn,String firstName,String lastName,String email,int phoneNumber )
	{
		super(id,createdOn,updatedOn);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber =phoneNumber;
	}
}

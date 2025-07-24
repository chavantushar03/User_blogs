package com.blog.service;

import java.util.List;

import com.blog.dto.UserRequestDTO;
import com.blog.dto.UserResponseDTO;

public interface UserService {
	UserResponseDTO addUser(UserRequestDTO dto);
	UserResponseDTO updateduser(Long id, UserRequestDTO dto);
	UserResponseDTO getUserById(Long id);
	List<UserResponseDTO> getAllUser();
	void deleteUser(Long id);
}

package com.blog.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.UserDao;
import com.blog.dto.UserRequestDTO;
import com.blog.dto.UserResponseDTO;
import com.blog.pojo.User;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	@Autowired
	private final UserDao userDao;
	private final ModelMapper mapper;
	
	@Override
	public UserResponseDTO addUser(UserRequestDTO dto) {
		User user = mapper.map(dto, User.class);
		user.setActive(true);
		User saved = userDao.save(user);
		return mapper.map(saved, UserResponseDTO.class);
	}

	@Override
	public UserResponseDTO updateduser(Long id,UserRequestDTO dto) {
		User user = userDao.findById(id).orElseThrow(()->new RuntimeException("User not found with id : "+id));
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());
		
		return null;
		
	}

	@Override
	public UserResponseDTO getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserResponseDTO> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}

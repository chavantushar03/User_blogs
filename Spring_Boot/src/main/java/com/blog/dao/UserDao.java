package com.blog.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.pojo.User;
@Repository
public interface UserDao extends JpaRepository<User, Long> {
	User getByUserByName(String name);
	Optional<User>findByIdIsActiveTrue(Long id);
	Optional<User> findByEmailAndIsActiveTrue(String email);
	boolean existsByEmail(String email);
	List<User> findByIsActiveTrue();
}

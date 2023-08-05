package com.pesu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pesu.demo.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	@Query("SELECT p FROM User p WHERE p.userId = :userId AND p.password = :password AND p.userType = :userType")
	User findByUserIdAndPasswordAndUserType(String userId, String password, String userType);
	

}

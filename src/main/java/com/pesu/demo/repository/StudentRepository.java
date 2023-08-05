package com.pesu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pesu.demo.model.student;

@Repository
public interface StudentRepository extends JpaRepository<student, String>{
	
	

}

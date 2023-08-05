package com.pesu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesu.demo.model.student;
import com.pesu.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	 
	public void saveStudent(student student) {
        studentRepository.save(student);
    }
	

}

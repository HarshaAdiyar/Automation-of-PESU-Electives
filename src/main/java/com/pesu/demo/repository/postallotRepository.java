package com.pesu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pesu.demo.model.postallot;
@Repository
public interface postallotRepository extends JpaRepository<postallot, String>{
	

}

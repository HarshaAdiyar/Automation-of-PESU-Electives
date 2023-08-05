package com.pesu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pesu.demo.model.query;

public interface queryRepository extends JpaRepository<query, Integer>{
	
	@Modifying
	@Query("UPDATE query q SET q.answer = ?2 WHERE q.id = ?1")
	int updateAnswerById(Integer id, String answer);

}

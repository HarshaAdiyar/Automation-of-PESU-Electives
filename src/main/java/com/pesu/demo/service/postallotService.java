package com.pesu.demo.service;

import org.springframework.stereotype.Service;

import com.pesu.demo.model.postallot;
import com.pesu.demo.repository.postallotRepository;

@Service
public class postallotService {
	postallotRepository postallotRepository;

	public void save(postallot postallot) {
		// TODO Auto-generated method stub
		System.out.println("save method "+postallot);
		postallotRepository.save(postallot);
		
	}

}

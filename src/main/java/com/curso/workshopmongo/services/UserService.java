package com.curso.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.workshopmongo.domain.User;
import com.curso.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;//injeção de dependencia
	
	public List<User> findAll(){
		return repo.findAll();	
		
	}

}

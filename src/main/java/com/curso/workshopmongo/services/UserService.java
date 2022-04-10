package com.curso.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.workshopmongo.domain.User;
import com.curso.workshopmongo.dto.UserDTO;
import com.curso.workshopmongo.repository.UserRepository;
import com.curso.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;// injeção de dependencia

	public List<User> findAll() {
		return repo.findAll();

	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	public User fromDTO(UserDTO objtDto) {
		return new User(objtDto.getId(), objtDto.getName(), objtDto.getEmail());
	}
	
	
	
}
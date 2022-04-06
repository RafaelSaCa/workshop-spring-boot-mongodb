package com.curso.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.workshopmongo.domain.User;

@RestController
@RequestMapping(value ="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
			User maria = new User("1","Maria Silva", "maria@gmail");
			User alex = new User("1", "Alex Brown","alex@gmail");
			List<User> list = new ArrayList<>();
			list.addAll(Arrays.asList(maria,alex));
			return ResponseEntity.ok().body(list);
	}

}

package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/save")
	private UserTable saveUser(@RequestBody UserTable user) {
		return userRepo.save(user);
	}
	
	@GetMapping("/get")
	public List<UserTable> getAll(){
		return userRepo.findAll();
	}
}

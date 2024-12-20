package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.User;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {

	List<User> userList = new ArrayList<User>(); // 0

	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {

		if (user.getUserId() == null) {
			user.setUserId(1001);
		}
		userList.add(user);
		return user;

	}

	// PathParam , RequestParam , PathVaraible

	@GetMapping("/findAllUsers")
	public List<User> findAllUsers() {

		return userList;
	}
	
	
	
	//findByid ,findByName , findByAddress ,

}

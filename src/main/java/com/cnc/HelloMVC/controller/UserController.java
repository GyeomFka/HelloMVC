package com.cnc.HelloMVC.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.HelloMVC.entity.User;
import com.cnc.HelloMVC.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

	private final UserService userService;

	@GetMapping("/user/{id}")
	public User findUser(@PathVariable Long id) {
		return userService.findUserById(id);
	}

	@GetMapping("/users")
	public List<User> findUsers() {
		return userService.findUsers();
	}

	//restful api -> GET, POST, PUT, DELETE
	//read, create, update, delete
	@PostMapping("/user")
	public User createUser(User user) {
		Long id = 5L;
		/*User user = User.builder()
			.id(id)
			.name(userName)
			.build();*/

		return userService.createUser(user);
	}

	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}

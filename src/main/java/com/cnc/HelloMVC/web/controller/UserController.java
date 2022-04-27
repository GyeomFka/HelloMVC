package com.cnc.HelloMVC.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.HelloMVC.domain.entity.User;
import com.cnc.HelloMVC.domain.service.UserService;
import com.cnc.HelloMVC.web.dto.UserDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

	private final UserService userService;

	@GetMapping("/user/{id}")
	public User findUser(@PathVariable Long id) {
		return userService.findUserById(id);
	}

	@GetMapping("/user/dto/{id}")
	public UserDto findUserDto(@PathVariable Long id) {
		return userService.findUserDtoById(id);

	}

	@GetMapping("/users")
	public List<User> findUsers() {
		return userService.findUsers();
	}

	//restful api -> GET, POST, PUT, DELETE
	//read, create, update, delete
	@PostMapping("/user")
	public User createUser(User user) {
		return userService.createUser(user);
	}

	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}

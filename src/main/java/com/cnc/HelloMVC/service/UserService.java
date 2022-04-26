package com.cnc.HelloMVC.service;

import java.util.List;

import com.cnc.HelloMVC.entity.User;

public interface UserService {
	User findUserById(Long id);

	List<User> findUsers();

	User createUser(User user);

	User deleteUser(Long id);
}

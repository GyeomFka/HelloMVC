package com.cnc.HelloMVC.domain.service;

import java.util.List;

import com.cnc.HelloMVC.domain.entity.User;
import com.cnc.HelloMVC.web.dto.UserDto;

public interface UserService {
	User findUserById(Long id);

	List<User> findUsers();

	User createUser(User user);

	User deleteUser(Long id);

	UserDto findUserDtoById(Long id);
}

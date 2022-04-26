package com.cnc.HelloMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cnc.HelloMVC.entity.User;
import com.cnc.HelloMVC.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public User findUserById(Long id) {
		return userRepository.findUser(id);
	}

	@Override
	public List<User> findUsers() {
		return userRepository.findUsers();
	}

	@Override
	public User createUser(User user) {
		return userRepository.createUser(user);
	}

	@Override
	public User deleteUser(Long id) {
		return userRepository.deleteUser(id);
	}
}

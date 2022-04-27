package com.cnc.HelloMVC.domain.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.cnc.HelloMVC.domain.entity.User;
import com.cnc.HelloMVC.domain.repository.UserRepository;
import com.cnc.HelloMVC.web.dto.UserDto;

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

	@Override
	public UserDto findUserDtoById(Long id) {
		User user = findUserById(id);
		UserDto dto = UserDto.builder().build();
		BeanUtils.copyProperties(user, UserDto.builder().build());
		return dto;
	}
}

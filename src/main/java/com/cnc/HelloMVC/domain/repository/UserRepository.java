package com.cnc.HelloMVC.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cnc.HelloMVC.domain.entity.User;

@Repository
public class UserRepository {
	private List<User> db = new ArrayList<>();
	{
		db.add(User.builder()
			.id(1L)
			.name("KIM")
			.build());

		db.add(User.builder()
			.id(2L)
			.name("KIM")
			.build()); //생성인자의 순서를 고려하지 않아도 된다.
	}

	public User findUser(Long id) {
		for (User user : db) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

	public List<User> findUsers() {
		return db;
	}

	public User createUser(User user) {
		db.add(user);
		return findUser(user.getId());
	}

	public User deleteUser(Long id) {
		User user = findUser(id);
		db.remove(user);
		return user;
	}
}

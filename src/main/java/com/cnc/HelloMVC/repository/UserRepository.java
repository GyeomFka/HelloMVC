package com.cnc.HelloMVC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cnc.HelloMVC.entity.User;

@Repository
public class UserRepository {
	private List<User> db = new ArrayList<>();
	{
		db.add(User.builder().id(1L).name("KIM").build());
		db.add(User.builder().id(2L).name("KIM").build());
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

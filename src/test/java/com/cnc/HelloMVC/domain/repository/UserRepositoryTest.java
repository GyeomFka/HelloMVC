package com.cnc.HelloMVC.domain.repository;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cnc.HelloMVC.domain.entity.User;

class UserRepositoryTest {

	UserRepository repository = new UserRepository();

	@Test
	void del_test() {

		User user = repository.findUser(1L);


		assertThat(user.getId().equals(1L));
	}

	@Test
	void delete_test() {

		User user = repository.deleteUser(1L);

		int size = repository.findUsers().size();
		assertThat(size).isEqualTo(1);

	}


}
package com.mifel.mx.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mifel.mx.pojos.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByLogin(String login);

	List<User> findAllByLogin(String login);
}

package com.mifel.mx.service;

import java.util.List;

import com.mifel.mx.pojos.User;

public interface GenericService {

	User findByLogin(String login);

	List<User> findAllUsers();
	
	List<User> findAllByFilter(String login);

}

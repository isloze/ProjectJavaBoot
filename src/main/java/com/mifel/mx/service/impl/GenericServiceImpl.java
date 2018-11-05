package com.mifel.mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mifel.mx.pojos.User;
import com.mifel.mx.repository.UserRepository;
import com.mifel.mx.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public List<User> findAllByFilter(String login) {
		if(login != null && !login.equals("")){
			return (List<User>) userRepository.findAllByLogin(login);
		}else{
			return (List<User>) userRepository.findAll();
		}
	}

}

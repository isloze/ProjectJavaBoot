package com.mifel.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.mx.pojos.User;
import com.mifel.mx.service.GenericService;

@RestController
@RequestMapping("/servicios")
@CrossOrigin(origins = "http://localhost:4200")
public class ResourceController {
	@Autowired
	private GenericService userService;

	@RequestMapping(value = "/consultaUsuario", method = RequestMethod.GET)
	public User getUser(@RequestParam String nombre) {
		return userService.findByLogin(nombre);
	}

	@RequestMapping(value = "/consultaUsuarios", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userService.findAllUsers();
	}
	
	@RequestMapping(value = "/consultaUsuariosbyFilter", method = RequestMethod.GET)
	public List<User> consultaUsuariosbyFilter(@RequestParam String nombre) {
		return userService.findAllByFilter(nombre);
	}

	@RequestMapping(value = "/holaMundo", method = RequestMethod.GET)
	public String getInit() {
		return "Hola Mundo";
	}
}

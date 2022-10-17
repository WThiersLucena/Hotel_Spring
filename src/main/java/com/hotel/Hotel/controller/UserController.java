package com.hotel.Hotel.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.DTO.UserDTO;
import com.hotel.Hotel.Form.UserForm;
import com.hotel.Hotel.Service.UserService;
import com.hotel.Hotel.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public UserDTO register(@RequestBody UserForm userForm) {
		return userService.createUser(userForm);
	}

	@GetMapping
	public Collection<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		userService.deleteById(id);
	}
	
//  @DeleteMapping("/{id}")
//  public void deleteById(@PathVariable("id") Long id) {
//     userService.deleteById(id);
//  }

}

package com.hotel.Hotel.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.Hotel.DTO.UserDTO;
import com.hotel.Hotel.Form.UserForm;
import com.hotel.Hotel.entities.User;
import com.hotel.Hotel.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public UserDTO createUser(UserForm form) {
		User user = convertToBusiness(form);
		user = userRepository.save(user);
		return convertToDto(user);
	}

	private User convertToBusiness(UserForm form) {
		User user = new User();
		user.setNome(form.getNome());
		user.setEmail(form.getEmail());
		user.setSenha(form.getSenha());
		user.setCpf(form.getCpf());
		return user;

	}

	private UserDTO convertToDto(User user) {
		UserDTO dto = new UserDTO();
		dto.setNome(user.getNome());
		dto.setEmail(user.getEmail());
		dto.setCpf(user.getCpf());
		return dto;

	}

	public Collection<User> findAll() {
		List<User> entity = userRepository.findAll();
		return entity;

	}
	
	public UserDTO findById(Long id) {
		User entity = userRepository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

}

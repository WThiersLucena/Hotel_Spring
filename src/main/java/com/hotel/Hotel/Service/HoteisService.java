package com.hotel.Hotel.Service;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Hotel.DTO.Hotel_DTO;
import com.hotel.Hotel.DTO.UserDTO;
import com.hotel.Hotel.Form.HotelForm;
import com.hotel.Hotel.Form.UserForm;
import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.entities.User;
import com.hotel.Hotel.repositories.HotelsRepository;

@Service
public class HoteisService {
	// o service é a camada na qual ficará contida toda a lógica
	
	@Autowired 
	private HotelsRepository repository;
	
	
	 // TRAZENDO POR ID
	public Hotel_DTO findById(Long id){
		Hotels entity = repository.findById(id).get();
		Hotel_DTO dto = new Hotel_DTO(entity);
		return dto;
	}
	
	
	public Collection<Hotels> findAll(){
		List<Hotels> entity = repository.findAll();
		return entity;
		
	}
	
	// ADD NOVO HOTEL 
	public Hotel_DTO createUser(HotelForm form) {
		Hotels user = convertToBusiness(form);
		user = repository.save(user);
		return convertToDto(user);
	}

	private Hotels convertToBusiness(HotelForm form) {
		Hotels user = new Hotels();
		user.setName(form.getName());
		return user;

	}

	private Hotel_DTO convertToDto(Hotels user) {
		Hotel_DTO dto = new Hotel_DTO();
		dto.setName(user.getName());
		return dto;
	}
	


	
	
	
	
	
	
}

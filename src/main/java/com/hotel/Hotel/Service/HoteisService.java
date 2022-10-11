package com.hotel.Hotel.Service;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Hotel.DTO.Hotel_DTO;
import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.repositories.HotelsRepository;

@Service
public class HoteisService {
	
	@Autowired 
	private HotelsRepository repository;
	
	 // TRAZENDO POR ID
	public Hotel_DTO findById(Long id){
		Hotels entity = repository.findById(id).get();
		Hotel_DTO dto = new Hotel_DTO(entity);
		return dto;
	}
	
	// TRAZENDO LISTA COMPLETA 
//	public Hotel_DTO findAll(){
//		List<Hotels> entity = repository.findAll();
//		Hotel_DTO dto = new Hotel_DTO(entity);
//		return dto;
//	}
	
	
	public Collection<Hotels> findAll(){
		List<Hotels> entity = repository.findAll();
		return entity;
		
	}
}

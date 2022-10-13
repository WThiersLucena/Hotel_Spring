package com.hotel.Hotel.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Hotel.DTO.Entradas_DTO;
import com.hotel.Hotel.entities.Entradas;
import com.hotel.Hotel.repositories.EntradasRepository;

@Service
public class EntradasService {

	@Autowired
	private EntradasRepository repository;

	// TRAZENDO LISTA DE ENTRADAS
	public Collection<Entradas> findAll(){
		List<Entradas> entity = repository.findAll();
		if (entity.size()<5) {
			return null;
			}else {
				return entity;
			}
		}

	// TRAZENDO POR ID
	public Entradas_DTO findById(Long id) {
		Entradas entity = repository.findById(id).get();
		Entradas_DTO dto = new Entradas_DTO(entity);
		return dto;
	}

}

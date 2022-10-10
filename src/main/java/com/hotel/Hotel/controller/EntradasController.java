package com.hotel.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.entities.Entradas;
import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.repositories.EntradasRepository;
import com.hotel.Hotel.repositories.HotelsRepository;

@RestController
@RequestMapping(value = "/search/entradas")
public class EntradasController {
	
	
	@Autowired
	private EntradasRepository entradasRepository;
	@GetMapping
	public List<Entradas> findAll(){
		List<Entradas> result = entradasRepository.findAll();
		return result;
	}
	

	@GetMapping(value = "/{id}")
	public Entradas findById(@PathVariable Long id){
		Entradas result = entradasRepository.findById(id).get();
		return result;
	}

	
	
}

package com.hotel.Hotel.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.DTO.Entradas_DTO;
import com.hotel.Hotel.Service.EntradasService;
import com.hotel.Hotel.entities.Entradas;
import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.repositories.EntradasRepository;
import com.hotel.Hotel.repositories.HotelsRepository;

@RestController
@RequestMapping(value = "/search/entradas")
public class EntradasController {

	@Autowired
	EntradasService service;

	@GetMapping
	public Collection<Entradas> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public Entradas_DTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}

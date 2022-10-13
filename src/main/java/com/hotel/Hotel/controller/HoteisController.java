package com.hotel.Hotel.controller;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.DTO.Hotel_DTO;
import com.hotel.Hotel.Service.HoteisService;
import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.repositories.HotelsRepository;

@RestController
@RequestMapping(value = "/search")
public class HoteisController {

	@Autowired
	private HoteisService service;
	private HoteisService hotelsRepository;

	@GetMapping
	public Collection<Hotels> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public Hotel_DTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

//	@PostMapping
//	public ResponseEntity<Hotels> insert(@RequestBody Hotels obj, URI uri){
//		obj = service.save(obj);		
//		return ResponseEntity.created(uri).body(obj);
//		
//	}
	
	// teste 2 
//	public Hotels insert (@RequestBody Hotels hotels) {
//		Hotels insert = service.save(hotels);
//		return insert;
//	}
	
	
	
}

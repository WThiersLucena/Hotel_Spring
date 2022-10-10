package com.hotel.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.entities.Hotels;
import com.hotel.Hotel.repositories.HotelsRepository;



@RestController
@RequestMapping(value = "/search")
public class HoteisController {

	
	@Autowired
	private HotelsRepository repository;
	@GetMapping
	public List<Hotels> findAll(){
		List<Hotels> result = repository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{id}")
	public Hotels findById(@PathVariable Long id){
		Hotels result = repository.findById(id).get();
		return result;
	}
	

	@PostMapping
	public Hotels insert (@RequestBody Hotels hotels){
		Hotels result = repository.save(hotels);
		return result;
	}
	
	
	
	
}

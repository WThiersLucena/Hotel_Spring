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

import com.hotel.Hotel.DTO.Hotel_DTO;
import com.hotel.Hotel.Form.HotelForm;
import com.hotel.Hotel.Service.HoteisService;
import com.hotel.Hotel.entities.Hotels;

@RestController
@RequestMapping(value = "/search")
public class HoteisController {

	@Autowired
	private HoteisService service;

	@GetMapping
	public Collection<Hotels> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public Hotel_DTO findById(@PathVariable Long id) {
		return service.findById(id);
	}


	@PostMapping("/cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
    public Hotel_DTO register(@RequestBody HotelForm hotelForm) {
        return service.createUser(hotelForm);
    }
	

	
	
	@DeleteMapping("/{id}")
		public void deleteById(@PathVariable("id") Long id) {
		service.deleteById(id);
	}

	
	
}

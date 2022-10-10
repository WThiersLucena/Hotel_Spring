package com.hotel.Hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Hotel.entities.EnderecoHoteis;
import com.hotel.Hotel.entities.Entradas;
import com.hotel.Hotel.repositories.EnderecoHoteisRepository;
import com.hotel.Hotel.repositories.EntradasRepository;

@RestController
@RequestMapping(value = "/search/endereco")
public class EnderecoHoteisController {
	

	@Autowired
	private EnderecoHoteisRepository endRepository;
	@GetMapping
	public List<EnderecoHoteis> findAll(){
		List<EnderecoHoteis> result = endRepository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{id}")
	public EnderecoHoteis findById(@PathVariable Long id){
		EnderecoHoteis result = endRepository.findById(id).get();
		return result;
	}

}

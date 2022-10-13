package com.hotel.Hotel.DTO;

import java.util.List;

import com.hotel.Hotel.entities.Hotels;

public class Hotel_DTO {

//	private Long id;	// AO COMENTAR O ID, SUA BUSCA NAO TRATA O NUMERO DO ID DO HOTEL
	private String name;
	
	public Hotel_DTO() {
		
	}

	public Hotel_DTO(Long id, String name) {
		
//		this.id = id;
		this.name = name;
	}

	
	public Hotel_DTO(Hotels hotels) {
		
//		id = hotels.getId();
		name = hotels.getName();
	}

	
	
	
	public Hotel_DTO(List<Hotels> entity) {
		// TODO Auto-generated constructor stub
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	
	
	
}

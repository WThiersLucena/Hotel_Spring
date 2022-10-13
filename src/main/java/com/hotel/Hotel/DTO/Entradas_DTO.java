package com.hotel.Hotel.DTO;

import java.util.List;

import com.hotel.Hotel.entities.Entradas;

public class Entradas_DTO {

	private Long id;
	private String name;
	private String checkin;
	private String checkout;
	
	
	public Entradas_DTO(Long id, String name, String checkin, String checkout) {
		//super();
		this.id = id;
		this.name = name;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	
	public Entradas_DTO(Entradas entradas) {
		id = entradas.getId();
		name = entradas.getName();
		checkin = entradas.getCheckout();
		checkout = entradas.getCheckout();
	}
	
	public Entradas_DTO (List<Entradas> entity) {
		
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCheckin() {
		return checkin;
	}


	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}


	public String getCheckout() {
		return checkout;
	}


	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	
	
	
	
	
	
}

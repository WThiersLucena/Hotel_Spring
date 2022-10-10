package com.hotel.Hotel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_entradas")
public class Entradas {
	
	@Id  //  chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // auto incrementavel
	private Long id;	
	private String name;
	private String checkin;
	private String checkout;
	
	
//	 FAZENDO A LIGAÇÃO DE MUITOS USUARIOS PARA 1 DEPARTAMENTO
	@ManyToOne  // Muitos para 1 
	@JoinColumn(name = "hotels_id") //
	private Hotels hotels;
	

	public Entradas() {
		
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


	public String getCheckIn() {
		return checkin;
	}


	public void setCheckIn(String checkin) {
		this.checkin = checkin;
	}


	public String getCheckout() {
		return checkout;
	}


	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}


	public Hotels getHoteis() {
		return hotels;
	}


	public void setHoteis(Hotels hotels) {
		this.hotels = hotels;
	}


		
}

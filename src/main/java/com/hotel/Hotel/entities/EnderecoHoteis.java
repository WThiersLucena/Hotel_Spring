package com.hotel.Hotel.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endhoteis")
public class EnderecoHoteis {

	@Id  //  chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // auto incrementavel
	private Long id;	
	private String zipcode;
	private String address;
	private String number;
	private String complement;
	
	
//	 FAZENDO A LIGAÇÃO DE MUITOS USUARIOS PARA 1 DEPARTAMENTO
	@OneToOne  // 1 para 1
	@JoinColumn(name = "hotels_id") //
	private Hotels hotels;
	
	public EnderecoHoteis() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Hotels getHotels() {
		return hotels;
	}

	public void setHotels(Hotels hotels) {
		this.hotels = hotels;
	}


	
	
}

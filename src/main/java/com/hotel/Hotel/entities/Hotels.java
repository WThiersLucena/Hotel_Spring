package com.hotel.Hotel.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_hotels")
public class Hotels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String name;
	

	
	public Hotels() {
		
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





	
}

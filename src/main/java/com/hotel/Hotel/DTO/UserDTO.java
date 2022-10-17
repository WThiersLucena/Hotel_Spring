package com.hotel.Hotel.DTO;

import com.hotel.Hotel.entities.User;

public class UserDTO {

	
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	
	
	
	
	public UserDTO() {
		
	}




	public UserDTO(String nome, String email, String cpf, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}
	
	
	public UserDTO(User user) {
		
		nome = user.getNome();
		email = user.getEmail();
		cpf = user.getCpf();
		senha = user.getSenha();
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getSenha() {
		return senha;
	}




	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
}

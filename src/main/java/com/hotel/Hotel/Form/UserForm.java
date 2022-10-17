package com.hotel.Hotel.Form;


public class UserForm {

//	 	@NotBlank(message = "Nome não pode estar em branco")
	    private String nome;
//	    @NotBlank @Email(message = "Endereço de e-mail inválido")
	    private String email;
//	    @CPF(message = "Número de CPF inválido")
	    private String cpf;
//	    @NotNull(message = "Data de nascimento não pode ser nula")
	    private String senha;
	    
	    
		
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

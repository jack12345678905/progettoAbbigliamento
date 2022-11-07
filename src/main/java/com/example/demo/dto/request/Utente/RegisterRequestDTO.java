package com.example.demo.dto.request.Utente;

public class RegisterRequestDTO {

	private String nome;
	private String username;
	private String password;
	public RegisterRequestDTO() {
		
	}

	public String getNome() {
		return nome;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return nome != null && username != null && password != null && !nome.isEmpty() && !username.isEmpty() && !password.isEmpty();
		
	}

}

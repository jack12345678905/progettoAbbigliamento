package com.example.demo.dto.request.Utente;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginRequestDTO {

	private String username;
	private String password;
	public LoginRequestDTO() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return username != null && password != null && !username.isEmpty() && !password.isEmpty();
	}



}

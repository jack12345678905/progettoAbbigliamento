package com.example.demo.dto.request.Luogo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LuogoRequestDTO {
	
	private String nome;

	public LuogoRequestDTO() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return nome != null && !nome.isEmpty();
	}
	

}

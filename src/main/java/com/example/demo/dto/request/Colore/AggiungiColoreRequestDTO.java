package com.example.demo.dto.request.Colore;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AggiungiColoreRequestDTO {
	
	private String nome;

	public AggiungiColoreRequestDTO() {
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

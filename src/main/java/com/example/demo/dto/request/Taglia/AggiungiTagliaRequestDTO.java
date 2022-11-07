package com.example.demo.dto.request.Taglia;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AggiungiTagliaRequestDTO {
	
	private String nome;

	public AggiungiTagliaRequestDTO() {
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

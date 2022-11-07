package com.example.demo.dto.request.Categoria;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RicercaRequestDTO {
	
	private String nome;

	public RicercaRequestDTO() {
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

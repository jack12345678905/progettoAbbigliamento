package com.example.demo.dto.request.Categoria;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AggiungiCategoriaRequestDTO {
	
	private String nome;

	public AggiungiCategoriaRequestDTO() {
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

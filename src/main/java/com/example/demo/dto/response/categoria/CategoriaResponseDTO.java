package com.example.demo.dto.response.categoria;

public class CategoriaResponseDTO {

	private String nome;

	public CategoriaResponseDTO() {
		super();
	}

	public CategoriaResponseDTO(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

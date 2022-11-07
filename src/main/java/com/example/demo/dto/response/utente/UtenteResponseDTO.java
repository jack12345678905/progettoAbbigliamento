package com.example.demo.dto.response.utente;

public class UtenteResponseDTO {
private String nome;

public UtenteResponseDTO() {
	super();
}

public UtenteResponseDTO(String nome) {
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

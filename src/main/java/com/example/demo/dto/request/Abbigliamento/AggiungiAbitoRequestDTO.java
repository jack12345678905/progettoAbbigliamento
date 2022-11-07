package com.example.demo.dto.request.Abbigliamento;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AggiungiAbitoRequestDTO {

	private String nome;
	private String nome_categoria;
	private String nome_colore;
	private boolean isSolidColor;
	private String nome_taglia;
	private String nome_luogo;
	private String nome_utente;
	private String password;
	private String username;

	public AggiungiAbitoRequestDTO() {
	}

	public AggiungiAbitoRequestDTO(String nome, String nome_categoria, String nome_colore, boolean isSolidColor,
			String nome_taglia, String nome_luogo, String nome_utente, String password, String username) {
		super();
		this.nome = nome;
		this.nome_categoria = nome_categoria;
		this.nome_colore = nome_colore;
		this.isSolidColor = isSolidColor;
		this.nome_taglia = nome_taglia;
		this.nome_luogo = nome_luogo;
		this.nome_utente = nome_utente;
		this.password = password;
		this.username = username;
	}

	public AggiungiAbitoRequestDTO(String nome, String nome_categoria, String nome_colore, boolean isSolidColor,
			String nome_taglia, String nome_luogo, String nome_utente, String password) {
		this.nome = nome;
		this.nome_categoria = nome_categoria;
		this.nome_colore = nome_colore;
		this.isSolidColor = isSolidColor;
		this.nome_taglia = nome_taglia;
		this.nome_luogo = nome_luogo;
		this.nome_utente = nome_utente;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public String getNome_colore() {
		return nome_colore;
	}

	public boolean isSolidColor() {
		return isSolidColor;
	}

	public String getNome_taglia() {
		return nome_taglia;
	}

	public String getNome_luogo() {
		return nome_luogo;
	}

	public String getNome_utente() {
		return nome_utente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public void setNome_colore(String nome_colore) {
		this.nome_colore = nome_colore;
	}

	public void setSolidColor(boolean isSolidColor) {
		this.isSolidColor = isSolidColor;
	}

	public void setNome_taglia(String nome_taglia) {
		this.nome_taglia = nome_taglia;
	}

	public void setNome_luogo(String nome_luogo) {
		this.nome_luogo = nome_luogo;
	}

	public void setNome_utente(String nome_utente) {
		this.nome_utente = nome_utente;
	}

	@JsonIgnore
	public boolean isValid() {
		return nome != null && !nome.isEmpty() && nome_categoria != null && !nome_categoria.isEmpty()
				&& nome_colore != null && !nome_colore.isEmpty() && nome_taglia != null && !nome_taglia.isEmpty()
				&& nome_luogo != null && !nome_luogo.isEmpty() && nome_utente != null && !nome_utente.isEmpty()
				&& password != null && !password.isEmpty() && username != null && !username.isEmpty();
	}

}

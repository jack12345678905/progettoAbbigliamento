package com.example.demo.dto.request.Abbigliamento;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class RicercaRequestDTO {

	private String nome;
	private String nome_categoria;
	private String nome_colore;
	private boolean isSolidColor;
	private String nome_taglia;
	private String nome_luogo;
	private String username;
	private String password;

	public RicercaRequestDTO() {
		super();
	}

	public RicercaRequestDTO(String nome, String nome_categoria, String nome_colore, boolean isSolidColor,
			String nome_taglia, String nome_luogo, String username, String password) {
		super();
		this.nome = nome;
		this.nome_categoria = nome_categoria;
		this.nome_colore = nome_colore;
		this.isSolidColor = isSolidColor;
		this.nome_taglia = nome_taglia;
		this.nome_luogo = nome_luogo;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
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

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonIgnore
	public boolean isValid() {
		return nome != null && !nome.isEmpty() && nome_categoria != null && !nome_categoria.isEmpty()
				&& nome_colore != null && !nome_colore.isEmpty() && nome_taglia != null && !nome_taglia.isEmpty()
				&& nome_luogo != null && !nome_luogo.isEmpty() && username != null && !username.isEmpty() &&
				password != null && !password.isEmpty();
	}

}

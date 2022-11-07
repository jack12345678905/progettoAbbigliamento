package com.example.demo.dto.response.Abbigliamento;

public class AbbilgiamentoResponseDTO {

	private String nome;
	private String nome_categoria;
	private String nome_colore;
	private boolean isSolidColor;
	private String taglia;
	private String nome_luogo;
	private String nome_utente;

	public AbbilgiamentoResponseDTO() {
		super();
	}

	public AbbilgiamentoResponseDTO(String nome, String nome_categoria, String nome_colore, boolean isSolidColor,
			String taglia, String nome_luogo, String nome_utente) {
		super();
		this.nome = nome;
		this.nome_categoria = nome_categoria;
		this.nome_colore = nome_colore;
		this.isSolidColor = isSolidColor;
		this.taglia = taglia;
		this.nome_luogo = nome_luogo;
		this.nome_utente = nome_utente;
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

	public String getTaglia() {
		return taglia;
	}

	public String getNome_luogo() {
		return nome_luogo;
	}
	
	public String getNome_utente() {
		return nome_utente;
	}
	
	public void setNome_utente(String nome_utente) {
		this.nome_utente = nome_utente;
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

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public void setNome_luogo(String nome_luogo) {
		this.nome_luogo = nome_luogo;
	}
	
	

}

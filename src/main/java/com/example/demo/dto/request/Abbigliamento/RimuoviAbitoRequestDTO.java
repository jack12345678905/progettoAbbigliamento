package com.example.demo.dto.request.Abbigliamento;

import com.example.demo.model.Categoria;
import com.example.demo.model.Colore;
import com.example.demo.model.Luogo;
import com.example.demo.model.Taglia;
import com.example.demo.model.Utente;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class RimuoviAbitoRequestDTO {

	private String nome;
	private Categoria id_categoria;
	private Colore id_colore;
	private boolean isSolidColor;
	private Taglia id_taglia;
	private Luogo id_luogo;
	private Utente id_utente;
	public RimuoviAbitoRequestDTO() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public Categoria getId_caCategoria() {
		return id_categoria;
	}
	public Colore getId_colore() {
		return id_colore;
	}
	public boolean isSolidColor() {
		return isSolidColor;
	}
	public Taglia getId_taglia() {
		return id_taglia;
	}
	public Luogo getId_luogo() {
		return id_luogo;
	}
	public Utente getId_utente() {
		return id_utente;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId_caCategoria(Categoria id_caCategoria) {
		this.id_categoria = id_caCategoria;
	}
	public void setId_colore(Colore id_colore) {
		this.id_colore = id_colore;
	}
	public void setSolidColor(boolean isSolidColor) {
		this.isSolidColor = isSolidColor;
	}
	public void setId_taglia(Taglia id_taglia) {
		this.id_taglia = id_taglia;
	}
	public void setId_luogo(Luogo id_luogo) {
		this.id_luogo = id_luogo;
	}
	public void setId_utente(Utente id_utente) {
		this.id_utente = id_utente;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return nome != null && id_categoria != null && id_colore != null && id_taglia != null && id_luogo != null && id_utente != null && !nome.isEmpty();
	}
}


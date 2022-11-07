package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Abbigliamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nome;
	@ManyToOne
	@JoinColumn(name = "id_categoria", nullable = false, updatable = false)
	private Categoria id_categoria;
	@ManyToOne
	@JoinColumn(name = "id_colore", nullable = false, updatable = false)
	private Colore id_colore;
	@Column(nullable = false)
	private boolean isSolidColor;
	@ManyToOne
	@JoinColumn(name = "id_taglia", nullable = false, updatable = false)
	private Taglia id_taglia;
	@ManyToOne
	@JoinColumn(name = "id_luogo", nullable = false, updatable = false)
	private Luogo id_luogo;
	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false, updatable = false)
	private Utente id_utente;

	public Abbigliamento() {
	}
	

	public Abbigliamento(long id, String nome, Categoria id_categoria, Colore id_colore, boolean isSolidColor,
			Taglia id_taglia, Luogo id_luogo, Utente id_utente) {
		this.id = id;
		this.nome = nome;
		this.id_categoria = id_categoria;
		this.id_colore = id_colore;
		this.isSolidColor = isSolidColor;
		this.id_taglia = id_taglia;
		this.id_luogo = id_luogo;
	}
	
	


	public Abbigliamento(String nome, Categoria id_categoria, Colore id_colore, boolean isSolidColor, Taglia id_taglia,
			Luogo id_luogo, Utente id_utente) {
		this.nome = nome;
		this.id_categoria = id_categoria;
		this.id_colore = id_colore;
		this.isSolidColor = isSolidColor;
		this.id_taglia = id_taglia;
		this.id_luogo = id_luogo;
		this.id_utente = id_utente;
	}
	

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Categoria getId_categoria() {
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

	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
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

}

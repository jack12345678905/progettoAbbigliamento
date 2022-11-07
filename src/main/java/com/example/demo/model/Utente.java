package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false)
	private String password;

	public Utente() {

	}

	public Utente(String nome, String username, String password) {
		this.nome = nome;
		this.username = username;
		this.password = password;
	}
	
	
	public Utente(long id, String nome, String username, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

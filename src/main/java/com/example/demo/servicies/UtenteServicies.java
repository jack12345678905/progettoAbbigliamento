package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@Service
public class UtenteServicies {
	@Autowired
	UtenteRepository repo;

	public Utente register(String nome, String username, String password) {
		try {
			Utente u = new Utente(nome, username, password);
			u = repo.save(u);
			return u;
		} catch (Exception e) {
			return null;
		}

	}
	
	public Utente login(String username, String password) {
		
		try {
			Utente u = repo.login(username, password);
			return u;
		} catch (Exception e) {
			return null;
		}
		
		
	}
	public Utente trova(String username) {
		try {
			Utente u = repo.trova(username);
			return u;
		}catch(Exception e) {
			return null;
		}
	}

	

}



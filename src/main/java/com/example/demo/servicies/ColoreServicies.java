package com.example.demo.servicies;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Colore;
import com.example.demo.repository.ColoreRepository;

@Service
public class ColoreServicies {
	@Autowired
	ColoreRepository repo;
	
	  public Colore ricerca(String nome) {
	        try {
	            Colore c = repo.ricerca(nome);
	            return c;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    public Colore aggiungiColore(String nome) {
	        try {
	            Colore c = new Colore(nome);
	            c = repo.save(c);
	            return c;
	        } catch (Exception e) {
	            return null;
	        }


	    }
}

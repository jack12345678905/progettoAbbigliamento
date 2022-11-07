package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;
@Service
public class CategoriaServicies {
	@Autowired
	CategoriaRepository repo;
	
	public Categoria ricerca(String nome) {
		try {
			Categoria c = repo.ricerca(nome);
			return c;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Categoria aggiungiCategoria(String nome) {
		try {
			Categoria c = new Categoria(nome);
			c = repo.save(c);
			return c;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	

}

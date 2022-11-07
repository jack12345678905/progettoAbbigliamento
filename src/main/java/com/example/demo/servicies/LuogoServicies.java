package com.example.demo.servicies;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Luogo;
import com.example.demo.repository.LuogoRepository;

@Service
public class LuogoServicies {
	@Autowired
	LuogoRepository repo;
	
	public Luogo ricerca(String nome) {
        try {
            Luogo l = repo.ricerca(nome);
            return l;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Luogo aggiungiLuogo(String nome) {
        try {
            Luogo l = new Luogo(nome);
            l = repo.save(l);
            return l;
        } catch (Exception e) {
            return null;
        }
        
    }
}

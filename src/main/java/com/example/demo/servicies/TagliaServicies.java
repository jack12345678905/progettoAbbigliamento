package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Taglia;
import com.example.demo.repository.TagliaRepository;

@Service
public class TagliaServicies {

	@Autowired
    TagliaRepository repo;
    
    public Taglia ricerca(String nome) {
        try {
            Taglia t = repo.ricerca(nome);
            return t;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Taglia aggiungiTaglia(String nome) {
        try {
            Taglia t = new Taglia(nome);
            t = repo.save(t);
            return t;
        } catch (Exception e) {
            return null;
        }
        
    }

}

package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Abbigliamento;
import com.example.demo.model.Categoria;
import com.example.demo.model.Colore;
import com.example.demo.model.Luogo;
import com.example.demo.model.Taglia;
import com.example.demo.model.Utente;
import com.example.demo.repository.AbbigliamentoRepository;



@Service
public class AbbigliamentoServicies {
	@Autowired
	AbbigliamentoRepository repo;
	
	
	public Abbigliamento aggiungiAbito(String nome, Categoria id_categoria, Colore id_colore, boolean isSolidColor, Taglia id_taglia,
			Luogo id_luogo, Utente u) {
		try {
			
			Abbigliamento a = new Abbigliamento(nome, id_categoria, id_colore, isSolidColor, id_taglia, id_luogo, u);
			a = repo.save(a);
			return a; 
		}catch (Exception e) {
			return null;
		}
	}
			
	
	public Abbigliamento ricerca(String nome, long id_categoria, long id_colore, long id_taglia, long id_luogo, long id_utente, boolean isSolidColor) {
		try {
			Abbigliamento a = repo.ricerca(nome, id_categoria, id_colore, id_taglia, id_luogo, id_utente, isSolidColor);
			return a;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
	/*public boolean rimuoviAbito(Abbigliamento a) {
		try {
			 
			repo.ricerca(a.getNome(),a.getId_categoria().getId(),a.getId_colore().getId(),a.isSolidColor(), a.getId_taglia().getId(),a.getId_luogo().getId(), a.getId_utente().getId());
			 repo.delete(a);	
			return true;
			} catch (Exception e) {
			return false;
		}
		
	}
	
	public Abbigliamento modificaAbito(Abbigliamento a) {
		
		try {
			repo.ricerca(a.getNome(), a.getId_categoria().getId(), a.getId_colore().getId(), a.isSolidColor(), a.getId_taglia().getId(), a.getId_luogo().getId(), a.getId_utente().getId()); 
				 a = new Abbigliamento(a.getNome(),a.getId_categoria(),a.getId_colore(),a.isSolidColor(),a.getId_taglia(),a.getId_luogo(),a.getId_utente());
				 return a;
		} catch (Exception e) {
			return null;
		}
		
	}*/
			
	}



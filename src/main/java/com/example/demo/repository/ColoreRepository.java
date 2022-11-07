package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Colore;

@Repository
public interface ColoreRepository extends JpaRepository<Colore, Long >  {
	
	@Query("select c from Colore c where c.nome = :nome")
	public Colore ricerca(String nome);

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Luogo;

@Repository
public interface LuogoRepository extends JpaRepository<Luogo, Long> {
	
	@Query("select l from Luogo l where l.nome = :nome ")
	public Luogo ricerca(String nome);

}

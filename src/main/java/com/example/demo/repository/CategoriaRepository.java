package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
	
	@Query("select c from Categoria c where c.nome = :nome")
	public Categoria ricerca(String nome);
	

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Abbigliamento;


@Repository
public interface AbbigliamentoRepository extends JpaRepository<Abbigliamento, Long> {
	
	@Query("select a from Abbigliamento a where a.nome = ?1 and a.categoria.id_categoria = ?2 and a.colore.id_colore = ?3 and a.taglia.id_taglia = ?4 and a.luogo.id_luogo = ?5 and a.utente.id_utente = ?6 and a.isSolidColor = ?7")
	public Abbigliamento ricerca(String nome, long id_categoria, long id_colore, long id_taglia, long id_luogo, long id_utente, boolean isSolidColor);

}

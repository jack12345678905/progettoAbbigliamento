package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Taglia;

@Repository
public interface TagliaRepository extends JpaRepository<Taglia, Long> {
	@Query("select t from Taglia t where t.taglia = :taglia ")
	public Taglia ricerca(String taglia);

}

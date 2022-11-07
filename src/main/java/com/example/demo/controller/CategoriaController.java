package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Categoria.AggiungiCategoriaRequestDTO;
import com.example.demo.dto.request.Categoria.RicercaRequestDTO;
import com.example.demo.dto.response.categoria.CategoriaResponseDTO;
import com.example.demo.model.Categoria;
import com.example.demo.servicies.CategoriaServicies;

@RestController
@CrossOrigin
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	CategoriaServicies servicies;
	
	@RequestMapping(method = RequestMethod.POST,path = "/ricercaCategoria")
	public ResponseEntity ricerca(@RequestBody RicercaRequestDTO request) {
		if(request.isValid()) {
			Categoria c = servicies.ricerca(request.getNome());
			if(c != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new CategoriaResponseDTO(c.getNome()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/aggiungicategoria")
	public ResponseEntity aggiungiCategoria(@RequestBody AggiungiCategoriaRequestDTO request) {
		if(request.isValid()) {
			Categoria c = servicies.aggiungiCategoria(request.getNome());
			if(c != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new CategoriaResponseDTO(c.getNome()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	

}

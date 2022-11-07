package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Colore.RicercaRequestDTO;
import com.example.demo.dto.response.Colore.ColoreResponseDTO;
import com.example.demo.dto.response.categoria.CategoriaResponseDTO;
import com.example.demo.model.Colore;
import com.example.demo.servicies.ColoreServicies;

@RestController
@CrossOrigin
@RequestMapping("/colore")
public class ColoreController {
	@Autowired
	ColoreServicies servicies;
	
	public ResponseEntity ricerca(@RequestBody RicercaRequestDTO request) {
		if (request.isValid()) {
			Colore c = servicies.ricerca(request.getNome());
			if (c != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new ColoreResponseDTO(c.getNome()));
				
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			
		}else {
			return ResponseEntity.status(403).build();
		}
		
	}
	
	public ResponseEntity aggiungiColore(@RequestBody RicercaRequestDTO request) {
		if (request.isValid()) {
			Colore c = servicies.aggiungiColore(request.getNome());
			if (c != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new ColoreResponseDTO(c.getNome()));
				
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			
		}else {
			return ResponseEntity.status(403).build();
		}
		
	}
}

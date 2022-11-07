package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Taglia.RicercaRequestDTO;
import com.example.demo.dto.response.Taglia.TagliaResponseDTO;
import com.example.demo.dto.response.categoria.CategoriaResponseDTO;
import com.example.demo.model.Taglia;
import com.example.demo.servicies.TagliaServicies;

@RestController
@CrossOrigin
@RequestMapping("/taglia")
public class TagliaController {

	@Autowired
	TagliaServicies servicies;
	
	@RequestMapping(method = RequestMethod.POST,path = "/ricercaTaglia")
	public ResponseEntity ricercaTaglia(@RequestBody RicercaRequestDTO request) {
		if(request.isValid()) {
			Taglia t = servicies.ricerca(request.getTaglia());
			if (t != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new TagliaResponseDTO(t.getTaglia()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "/aggiungiTaglia")
	public ResponseEntity aggiungiTaglia(@RequestBody RicercaRequestDTO request) {
		if(request.isValid()) {
			Taglia t = servicies.aggiungiTaglia(request.getTaglia());
			if (t != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new TagliaResponseDTO(t.getTaglia()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
	}
}

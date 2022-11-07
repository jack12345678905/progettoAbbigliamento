package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Luogo.LuogoRequestDTO;
import com.example.demo.dto.response.Luogo.LuogoResponseDTO;
import com.example.demo.dto.response.categoria.CategoriaResponseDTO;
import com.example.demo.model.Luogo;
import com.example.demo.servicies.LuogoServicies;

@RestController
@CrossOrigin
@RequestMapping("/luogo")
public class LuogoController {
	@Autowired
	LuogoServicies servicies;
	
	@RequestMapping(method = RequestMethod.POST, path = "/ricercaluogo")
	public ResponseEntity ricerca(@RequestBody LuogoRequestDTO request) {
		if(request.isValid()) {
			Luogo l = servicies.ricerca(request.getNome());
			if(l != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new LuogoResponseDTO(l.getNome()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
	}
	@RequestMapping(method = RequestMethod.POST, path = "/aggiungiluogo")
	public ResponseEntity aggiungiLuogo(@RequestBody LuogoRequestDTO request) {
		if(request.isValid()) {
			Luogo l = servicies.aggiungiLuogo(request.getNome());
			if (l != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new LuogoResponseDTO(l.getNome()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
		
	}
}

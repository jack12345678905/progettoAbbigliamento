package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Utente.LoginRequestDTO;
import com.example.demo.dto.request.Utente.RegisterRequestDTO;
import com.example.demo.dto.response.utente.UtenteResponseDTO;
import com.example.demo.model.Utente;
import com.example.demo.servicies.UtenteServicies;

@RestController
@CrossOrigin
@RequestMapping("/utente")
public class UtenteController {
	@Autowired
	UtenteServicies servicies;

	@RequestMapping(method = RequestMethod.POST, path = "/register")
	public ResponseEntity register(@RequestBody RegisterRequestDTO request) {
		if (request.isValid()) {
			Utente u = servicies.register(request.getNome(), request.getUsername(), request.getPassword());
			if (u != null) {
				
				return ResponseEntity.status(HttpStatus.OK).body(new UtenteResponseDTO(u.getNome()));
				
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		} else {
			return ResponseEntity.status(403).build();
		}
	}

	@RequestMapping(method = RequestMethod.POST, path = "/login")
	public ResponseEntity<UtenteResponseDTO> login(@RequestBody LoginRequestDTO request) {
		if (request.isValid()) {
			Utente u = servicies.login(request.getUsername(), request.getPassword());
			if (u != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new UtenteResponseDTO(u.getNome()));
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		} else {
			return ResponseEntity.status(403).build();
		}
	}

}

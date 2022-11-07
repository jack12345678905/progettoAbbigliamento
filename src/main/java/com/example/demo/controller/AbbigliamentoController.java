package com.example.demo.controller;

import java.beans.beancontext.BeanContextServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.Abbigliamento.AggiungiAbitoRequestDTO;
import com.example.demo.dto.request.Categoria.RicercaRequestDTO;
import com.example.demo.dto.response.Abbigliamento.AbbilgiamentoResponseDTO;
import com.example.demo.dto.response.utente.UtenteResponseDTO;
import com.example.demo.model.Abbigliamento;
import com.example.demo.model.Categoria;
import com.example.demo.model.Colore;
import com.example.demo.model.Luogo;
import com.example.demo.model.Taglia;
import com.example.demo.model.Utente;
import com.example.demo.servicies.AbbigliamentoServicies;
import com.example.demo.servicies.CategoriaServicies;
import com.example.demo.servicies.ColoreServicies;
import com.example.demo.servicies.LuogoServicies;
import com.example.demo.servicies.TagliaServicies;
import com.example.demo.servicies.UtenteServicies;

@RestController
@CrossOrigin
@RequestMapping("/abbigliamento")
public class AbbigliamentoController {
	@Autowired
	AbbigliamentoServicies servicies;
	@Autowired
	UtenteServicies serviceUtente;
	@Autowired
	CategoriaServicies serviceCategoria;
	@Autowired
	ColoreServicies serviceColore;
	@Autowired
	LuogoServicies serviceLuogo;
	@Autowired
	TagliaServicies serviceTaglia;

	@RequestMapping(method = RequestMethod.POST, path = "/aggiungiabito")
	public ResponseEntity<AbbilgiamentoResponseDTO> aggiungiAbito(@RequestBody AggiungiAbitoRequestDTO request) {
		if (request.isValid()) {
			String nome = request.getNome();
			Boolean isSolidColor = request.isSolidColor();
			Categoria c = serviceCategoria.ricerca(request.getNome_categoria());
			System.out.println(c==null);
			if (c == null) {
				c = serviceCategoria.aggiungiCategoria(request.getNome_categoria());
			}
			Colore co = serviceColore.ricerca(request.getNome_colore());
			System.out.println(co==null);
			if (co == null) {
				co = serviceColore.aggiungiColore(request.getNome_colore());
			}
			Luogo l = serviceLuogo.ricerca(request.getNome_luogo());
			System.out.println(l==null);
			if (l == null) {
				l = serviceLuogo.aggiungiLuogo(request.getNome_luogo());
			}
			Taglia t = serviceTaglia.ricerca(request.getNome_taglia());
			System.out.println(t==null);
			if (t == null) {
				t = serviceTaglia.aggiungiTaglia(request.getNome_taglia());
			}
			Utente u = serviceUtente.login(request.getUsername(), request.getPassword());
			System.out.println(u==null);
			if (u == null) {
				u = serviceUtente.register(request.getNome(), request.getUsername(), request.getPassword());
			}
			Abbigliamento a = servicies.aggiungiAbito(nome, c, co, isSolidColor, t, l, u); 
			if (a != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new AbbilgiamentoResponseDTO(nome,c.getNome(),co.getNome(),isSolidColor,l.getNome(),
						t.getTaglia(),u.getNome()));
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		} else {
			return ResponseEntity.status(403).build();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/ricercaabito")
	public ResponseEntity<AbbilgiamentoResponseDTO> ricerca(@RequestBody com.example.demo.dto.request.Abbigliamento.RicercaRequestDTO request) {
		if(request.isValid()) {
			
			Categoria c = serviceCategoria.ricerca(request.getNome_categoria());
			System.out.println(c == null);
			Colore co = serviceColore.ricerca(request.getNome_colore());
			System.out.println(co == null);
			Luogo l = serviceLuogo.ricerca(request.getNome_luogo());
			System.out.println(l == null);
			Taglia t = serviceTaglia.ricerca(request.getNome_taglia());
			System.out.println(t == null);
			Utente u = serviceUtente.login(request.getUsername(), request.getPassword());
			System.out.println(u == null);
			Abbigliamento a = servicies.ricerca(request.getNome(), c.getId(), co.getId(), t.getId(), l.getId(), u.getId(), request.isSolidColor());
			//System.out.println(a.getNome());
			if(a != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new AbbilgiamentoResponseDTO(request.getNome(),c.getNome(),co.getNome(),request.isSolidColor(),l.getNome(),
						t.getTaglia(),u.getNome()));
			}else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}else {
			return ResponseEntity.status(403).build();
		}
		
	}

}

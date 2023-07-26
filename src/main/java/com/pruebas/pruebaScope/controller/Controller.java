package com.pruebas.pruebaScope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.pruebaScope.general.Contexto;
import com.pruebas.pruebaScope.general.ContextoSingleton;
import com.pruebas.pruebaScope.service.Servicio;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller {
	
	@Autowired
	private Servicio servicio;
	
	@Autowired
	ContextoSingleton singleton;
	
	@Autowired
	Contexto context;
	
	@GetMapping("/demo/{id}")
	public ResponseEntity<Contexto> getDemo(@PathVariable("id") Long id){		
		System.out.println("Path id: " + id);
		context.setNombre(id.toString());
		singleton.setNombre(id.toString());
		return ResponseEntity.ok().body(servicio.makeDemo(id));
		
	}
	

}

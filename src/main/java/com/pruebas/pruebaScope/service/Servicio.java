package com.pruebas.pruebaScope.service;

import org.springframework.stereotype.Service;

import com.pruebas.pruebaScope.general.Contexto;
import com.pruebas.pruebaScope.general.ContextoSingleton;

@Service
public class Servicio {
	
	private Contexto context;
	
	private ContextoSingleton singleton;

	public Servicio(Contexto context, ContextoSingleton singleton) {
		super();
		this.context = context;
		this.singleton = singleton;
	}

	public Contexto getContext() {
		return context;
	}

	public void setContext(Contexto context) {
		this.context = context;
	}
	
	public ContextoSingleton getSingleton() {
		return singleton;
	}

	public void setSingleton(ContextoSingleton singleton) {
		this.singleton = singleton;
	}

	public Contexto makeDemo(Long id) {
		
		System.out.println("Id" + id + "\tcontexto: " + context.getNombre());
		System.out.println("Id" + id + "\tcsingleton: " + singleton.getNombre());
		
		System.out.println("Pausa: " + id);
		
		System.out.println("Id" + id + "\tcontexto: " + context.getNombre());
		System.out.println("Id" + id + "\tcsingleton: " + singleton.getNombre());
		
		return null;		
	}

}

package com.pruebas.pruebaScope.general;

public class ContextoSingleton {
	
	private String nombre;
	
	
	public ContextoSingleton(String nombre) {
		super();
		this.nombre = nombre;
	}


	public ContextoSingleton() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	

}

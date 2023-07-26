package com.pruebas.pruebaScope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.pruebas.pruebaScope.general.Contexto;
import com.pruebas.pruebaScope.general.ContextoSingleton;

@Configuration
public class ContextConfig {
	
	@Bean
	@RequestScope
	public Contexto getContexto() {
		return new Contexto();
	}
	
	@Bean
	public ContextoSingleton getContextoSingleton() {
		return new ContextoSingleton();
	}
	

}

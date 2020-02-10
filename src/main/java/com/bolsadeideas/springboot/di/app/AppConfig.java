package com.bolsadeideas.springboot.di.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.service.IServicios;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServiciosComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicios registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicios registrarMiServicioComplejo() {
		return new MiServiciosComplejo();
	}
}

package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServiciosComplejo implements IServicios {
	
	public String operacion() {
		return "ejecutando algún proceso importante complicado...";
	}
}

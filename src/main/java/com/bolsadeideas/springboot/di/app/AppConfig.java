package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
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
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItem(){
		Producto producto1 = new Producto ("Camara Sony",1100);
		Producto producto2 = new Producto ("Notebook",1200);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary												//solo funciona con Primary
	public List<ItemFactura> registrarItemOficina(){
		Producto producto1 = new Producto ("Monitor LG LCD 24'' ",2500);
		Producto producto2 = new Producto ("Notebook Asus",5000);
		Producto producto3 = new Producto ("Impresora HP Multifuncional",800);
		Producto producto4 = new Producto ("Escritorio Oficina",3000);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 3);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}

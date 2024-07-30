package com.demo.gestion.alumnos.gestionalumnos.model;

import java.io.Serializable;

public class DatosEntradaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7906379978839637080L;

	private String nombre;

	private String primerApellido;

	private String segundoApellido;

	private Integer edad;

	private String gradoActual;

	private String direccion;

	private Boolean isActive;

	private Boolean isExtranjero;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGradoActual() {
		return gradoActual;
	}

	public void setGradoActual(String gradoActual) {
		this.gradoActual = gradoActual;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsExtranjero() {
		return isExtranjero;
	}

	public void setIsExtranjero(Boolean isExtranjero) {
		this.isExtranjero = isExtranjero;
	}

}

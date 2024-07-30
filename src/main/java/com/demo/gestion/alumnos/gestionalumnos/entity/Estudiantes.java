package com.demo.gestion.alumnos.gestionalumnos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "primerApellido")
	private String primerApellido;

	@Column(name = "segundoApellido")
	private String segundoApellido;

	@Column(name = "edad")
	private int edad;

	@Column(name = "gradoActual")
	private String gradoActual;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "isActive")
	private boolean isActive;

	@Column(name = "isExtranjero")
	private boolean isExtranjero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isExtranjero() {
		return isExtranjero;
	}

	public void setExtranjero(boolean isExtranjero) {
		this.isExtranjero = isExtranjero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiantes [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", primerApellido=");
		builder.append(primerApellido);
		builder.append(", segundoApellido=");
		builder.append(segundoApellido);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", gradoActual=");
		builder.append(gradoActual);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append(", isExtranjero=");
		builder.append(isExtranjero);
		builder.append("]");
		return builder.toString();
	}

}

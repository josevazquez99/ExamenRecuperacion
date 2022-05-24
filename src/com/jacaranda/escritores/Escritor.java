package com.jacaranda.escritores;

public class Escritor { 
	/*
	 * Declaro las variables de la clase
	 */
	public String dni;
	public String nombre;
	public String apelllidos;
	public String nacionalidad;
	
	/*
	 * Declaro el constructor
	 */
	public Escritor() {
		super();
		
	}

	public Escritor(String dni, String nombre, String apelllidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apelllidos = apelllidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelllidos() {
		return apelllidos;
	}

	public void setApelllidos(String apelllidos) {
		this.apelllidos = apelllidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	

}

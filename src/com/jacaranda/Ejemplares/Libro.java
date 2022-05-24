package com.jacaranda.Ejemplares;

import java.time.LocalDate;

import com.jacaranda.escritores.Escritor;

public class Libro extends Ejemplar{
	private int numPaginas;

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String titulo,int numPaginas, Escritor escritor) {
		super(titulo, escritor);
		// TODO Auto-generated constructor stub
	}

	public Libro(String titulo,int numPaginas, String valoracion,Escritor escritor) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	

}

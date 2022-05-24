package com.jacaranda.Ejemplares;

import com.jacaranda.escritores.Escritor;

public class Revista extends Ejemplar {
	private int mes;
	private int anno;
	private Tipo tipo;

	public Revista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Revista(String titulo, int mes, int anno, Escritor escritor) {
		super();
		this.mes = mes;
		this.anno = anno;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}

package com.jacaranda.Ejemplares;

public enum Valoracion {
	MUYINTERESANTE(10), INTERESANTE(8), PASABLE(6), ABURRIDO(4), MUYABURRIDO(0);

	private int valor;

	private Valoracion(int valor) {
		this.valor = valor;
	}

}

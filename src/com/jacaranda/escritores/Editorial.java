package com.jacaranda.escritores;

import com.jacaranda.Ejemplares.Ejemplar;
import com.jacaranda.Ejemplares.EjemplaresException;
import com.jacaranda.Ejemplares.Libro;
import com.jacaranda.Ejemplares.Revista;

public class Editorial {
	private static int NUMEROMAXIMOESCRITORES = 15;
	private static int NUMEROMAXIMOEJEMPLARES = 100;
	private int numeroEscritoresActuales;
	private int numeroEjemplaresActuales;
	private Escritor[] escritor;
	private Ejemplar[] ejemplar;

	public Editorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addEscritor(String dni, String nombre, String apellidos) throws EjemplaresException {

		for (int i = 0; i < numeroEscritoresActuales; i++) {
			if (escritor[i].getDni().equals(dni)) {
				throw new EjemplaresException("Ya existe el escritor");
			}
		}
		if (numeroEscritoresActuales == NUMEROMAXIMOESCRITORES) {
			throw new EjemplaresException("Error");
		}
		escritor[numeroEscritoresActuales++] = new Escritor(dni, nombre, apellidos);
	}

	public void addEjemplar(String titulo, int codigo, String valoracion1, Escritor escritor)
			throws EjemplaresException {
		if (numeroEjemplaresActuales == NUMEROMAXIMOESCRITORES) {
			throw new EjemplaresException("Error");
		}
		ejemplar[numeroEjemplaresActuales++] = new Ejemplar();
	}

	public void addEjemplar(String titulo, int codigo, int codigoSiguiente, Escritor escritor)
			throws EjemplaresException {
		if (numeroEjemplaresActuales == NUMEROMAXIMOESCRITORES) {
			throw new EjemplaresException("Error");
		}

		ejemplar[numeroEjemplaresActuales++] = new Ejemplar();

	}

	public String mostrarEjemplares() {
		String resultado = "";
		for (int i = 0; i < numeroEjemplaresActuales; i++) {
			resultado += ejemplar[i] + "\n";
		}
		return resultado;
	}

	public String mostrarLibros() {
		String resultado = "";
		for (int i = 0; i < numeroEjemplaresActuales; i++) {
			if (ejemplar[i] instanceof Libro) {
				resultado += ejemplar[i] + "\n";
			}
		}
		return resultado;
	}

	public String mostrarRevistas() {
		String resultado = "";
		for (int i = 0; i < numeroEjemplaresActuales; i++) {
			if (ejemplar[i] instanceof Revista) {
				resultado += ejemplar[i] + "\n";
			}
		}
		return resultado;
	}
}

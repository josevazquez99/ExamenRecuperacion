package com.jacaranda.Ejemplares;

import java.time.LocalDate;
import java.util.Objects;

import com.jacaranda.escritores.Escritor;

public class Ejemplar implements Valorable {
	private String titulo;
	private LocalDate fechaPublicacion;
	private int codigo;
	private static int codigoSiguiente;
	private Escritor escritor;
	private String valoracion;

	public Ejemplar() {
		super();
		this.codigo+=codigoSiguiente++;
	}

	public Ejemplar(String titulo, LocalDate fechaPublicacion, String valoracion) {
		super();
		this.codigo+=codigoSiguiente++;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.valoracion = valoracion;
	}

	public Ejemplar(String titulo, Escritor escritor) {
		this.codigo+=codigoSiguiente++;
		this.titulo = titulo;
		this.escritor = escritor;
	}

	public String getNombreApellidos() {
		String resultado;
		resultado = escritor.getNombre() + escritor.getApelllidos();
		return resultado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, escritor, fechaPublicacion, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplar other = (Ejemplar) obj;
		return codigo == other.codigo && Objects.equals(escritor, other.escritor)
				&& Objects.equals(fechaPublicacion, other.fechaPublicacion) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public boolean valorar(String valoracion) throws EjemplaresException {
		boolean resultado;
		if (valoracion.equals("MUYINTERESANTE") || valoracion.equals("INTERESANTE") || valoracion.equals("PASABLE")
				|| valoracion.equals("ABURRIDO") || valoracion.equals("MUYABURRIDO")) {
			resultado = true;
		} else {
			throw new EjemplaresException("La valoracion introducida es invalida");
		}
		return resultado;
	}

}

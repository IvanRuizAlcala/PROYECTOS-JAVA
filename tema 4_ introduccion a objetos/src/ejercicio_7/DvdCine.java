package ejercicio_7;

import java.util.Random;
import java.util.Scanner;

import EJERCICIO6.Alumnos6;

public class DvdCine {
	private String titulo;
	private String director;
	private String productora;
	private String actoresPrincipales;
	private String genero;
	private String resumen;
	private double duracion;
	
	@Override
	public String toString() {
		return "DvdCine [titulo=" + titulo + ", director=" + director + ", productora=" + productora
				+ ", actoresPrincipales=" + actoresPrincipales + ", genero=" + genero + ", resumen=" + resumen
				+ ", duracion=" + duracion + "]";
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the productora
	 */
	public String getProductora() {
		return productora;
	}
	/**
	 * @param productora the productora to set
	 */
	public void setProductora(String productora) {
		this.productora = productora;
	}
	/**
	 * @return the actoresPrincipales
	 */
	public String getActoresPrincipales() {
		return actoresPrincipales;
	}
	/**
	 * @param actoresPrincipales the actoresPrincipales to set
	 */
	public void setActoresPrincipales(String actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	/**
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public DvdCine(String titulo, String director, String productora, String actoresPrincipales, String genero,
			String resumen, double duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.productora = productora;
		this.actoresPrincipales = actoresPrincipales;
		this.genero = genero;
		this.resumen = resumen;
		this.duracion = duracion;
	}


}

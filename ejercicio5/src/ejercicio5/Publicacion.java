package ejercicio5;

public class Publicacion {
private String titulo;
private String tipo;
private String editorial;
private String periocidad;
private int numeroDeEjemplares;
public Publicacion(String titulo, String tipo, String editorial, String periocidad, int numeroDeEjemplares) {
	super();
	this.titulo = titulo;
	this.tipo = tipo;
	this.editorial = editorial;
	this.periocidad = periocidad;
	this.numeroDeEjemplares = numeroDeEjemplares;
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
 * @return the tipo
 */
public String getTipo() {
	return tipo;
}
/**
 * @param tipo the tipo to set
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}
/**
 * @return the editorial
 */
public String getEditorial() {
	return editorial;
}
/**
 * @param editorial the editorial to set
 */
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
/**
 * @return the periocidad
 */
public String getPeriocidad() {
	return periocidad;
}
/**
 * @param periocidad the periocidad to set
 */
public void setPeriocidad(String periocidad) {
	this.periocidad = periocidad;
}
/**
 * @return the numeroDeEjemplares
 */
public int getNumeroDeEjemplares() {
	return numeroDeEjemplares;
}
/**
 * @param numeroDeEjemplares the numeroDeEjemplares to set
 */
public void setNumeroDeEjemplares(int numeroDeEjemplares) {
	this.numeroDeEjemplares = numeroDeEjemplares;
}
@Override
public String toString() {
	return "Publicacion [titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", periocidad="
			+ periocidad + ", numeroDeEjemplares=" + numeroDeEjemplares + "]";
}

}

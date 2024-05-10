package Class;

public class Viaje {
private int codigo;
private String nombre;
private int numeroDeCaracteres;
public Viaje(int codigo, String nombre, int numeroDeCaracteres) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.numeroDeCaracteres = numeroDeCaracteres;
}
@Override
public String toString() {
	return "Viaje [codigo=" + codigo + ", nombre=" + nombre + ", numeroDeCaracteres=" + numeroDeCaracteres + "]";
}
/**
 * @return the codigo
 */
public int getCodigo() {
	return codigo;
}
/**
 * @param codigo the codigo to set
 */
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the numeroDeCaracteres
 */
public int getNumeroDeCaracteres() {
	return numeroDeCaracteres;
}
/**
 * @param numeroDeCaracteres the numeroDeCaracteres to set
 */
public void setNumeroDeCaracteres(int numeroDeCaracteres) {
	this.numeroDeCaracteres = numeroDeCaracteres;
}
}

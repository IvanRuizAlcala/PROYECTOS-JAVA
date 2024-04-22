package ejercicio_6;

import java.time.LocalDate;
import java.util.Date;

public abstract class Productos{
private int idProducto;
private String descripcion;
private LocalDate fechaDeCaducidad;
private int numeroDeLote;


public Productos(int idProducto, String descripcion, LocalDate fechaDeCaducidad, int numeroDeLote) {
	super();
	this.idProducto = idProducto;
	this.descripcion = descripcion;
	this.fechaDeCaducidad = fechaDeCaducidad;
	this.numeroDeLote = numeroDeLote;
}

/**
 * @return the idProducto
 */
public int getIdProducto() {
	return idProducto;
}

/**
 * @param idProducto the idProducto to set
 */
public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}

/**
 * @return the descripcion
 */
public String getDescripcion() {
	return descripcion;
}

/**
 * @param descripcion the descripcion to set
 */
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

/**
 * @return the fechaDeCaducidad
 */
public LocalDate getFechaDeCaducidad() {
	return fechaDeCaducidad;
}

/**
 * @param fechaDeCaducidad the fechaDeCaducidad to set
 */
public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
	this.fechaDeCaducidad = fechaDeCaducidad;
}

/**
 * @return the numeroDeLote
 */
public int getNumeroDeLote() {
	return numeroDeLote;
}

/**
 * @param numeroDeLote the numeroDeLote to set
 */
public void setNumeroDeLote(int numeroDeLote) {
	this.numeroDeLote = numeroDeLote;
}

@Override
public String toString() {
	return "productos [idProducto=" + idProducto + ", descripcion=" + descripcion + ", fechaDeCaducidad="
			+ fechaDeCaducidad + ", numeroDeLote=" + numeroDeLote + "]";
}
}

package model.data;

public class Tarifa {
private String nombre;
private double precio;
public Tarifa(String nombre, double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}
public String getNombre() {
	return nombre;
}
public double getPrecio() {
	return precio;
}
@Override
public String toString() {
	return "Tarifa [nombre=" + nombre + ", precio=" + precio + "]";
}

}

package model.data;

public class Producto {
private String Codigo;
private String Nombre;
private String vendedor;
private String Pventa;


public Producto(String codigo, String nombre, String vendedor, String pventa) {
	super();
	Codigo = codigo;
	Nombre = nombre;
	this.vendedor = vendedor;
	Pventa = pventa;
}
@Override
public String toString() {
	return "Producto [Codigo=" + Codigo + ", Nombre=" + Nombre + ", vendedor=" + vendedor + ", Pventa=" + Pventa + "]";
}
public String getVendedor() {
	return vendedor;
}
public void setVendedor(String vendedor) {
	this.vendedor = vendedor;
}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getPventa() {
	return Pventa;
}
public void setPventa(String pventa) {
	Pventa = pventa;
}
}

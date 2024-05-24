package model.data;

public class Producto {
private String Codigo;
private String Nombre;
private String Categoria;
private String Pventa;
private String Pcompra;
public Producto(String codigo, String nombre, String categoria, String pventa, String pcompra) {
	super();
	Codigo = codigo;
	Nombre = nombre;
	Categoria = categoria;
	Pventa = pventa;
	Pcompra = pcompra;
}
@Override
public String toString() {
	return "Producto [Codigo=" + Codigo + ", Nombre=" + Nombre + ", Categoria=" + Categoria + ", Pventa=" + Pventa
			+ ", Pcompra=" + Pcompra + "]";
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
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;
}
public String getPventa() {
	return Pventa;
}
public void setPventa(String pventa) {
	Pventa = pventa;
}
public String getPcompra() {
	return Pcompra;
}
public void setPcompra(String pcompra) {
	Pcompra = pcompra;
}
}

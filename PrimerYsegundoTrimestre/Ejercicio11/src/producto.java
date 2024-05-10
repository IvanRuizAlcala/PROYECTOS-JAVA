
public class producto {
private int codigo;
private String nombre;
private String tipo;
private double precioVenta;
private double precioCompra;
private int unidadesDisponibles;

public producto(int codigo, String nombre, String tipo, double precioVenta, double precioCompra, int unidadesDisponibles) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.tipo = tipo;
	this.precioVenta = precioVenta;
	this.precioCompra = precioCompra;
	this.unidadesDisponibles = unidadesDisponibles;
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
 * @return the precioVenta
 */
public double getPrecioVenta() {
	return precioVenta;
}
/**
 * @param precioVenta the precioVenta to set
 */
public void setPrecioVenta(int precioVenta) {
	this.precioVenta = precioVenta;
}
/**
 * @return the precioCompra
 */
public double getPrecioCompra() {
	return precioCompra;
}
/**
 * @param precioCompra the precioCompra to set
 */
public void setPrecioCompra(int precioCompra) {
	this.precioCompra = precioCompra;
}
/**
 * @return the unidadesDisponibles
 */
public int getUnidadesDisponibles() {
	return unidadesDisponibles;
}
/**
 * @param unidadesDisponibles the unidadesDisponibles to set
 */
public void setUnidadesDisponibles(int unidadesDisponibles) {
	this.unidadesDisponibles = unidadesDisponibles;
}
@Override
public String toString() {
	return "producto [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", precioVenta=" + precioVenta
			+ ", precioCompra=" + precioCompra + ", unidadesDisponibles=" + unidadesDisponibles + "]";
}


}

package model;

public class Cliente {
private String nombreCliente;
private String telefono;
private String ciudad;
private String pais;
public Cliente(String nombreCliente, String telefono, String ciudad, String pais) {
	this.nombreCliente = nombreCliente;
	this.telefono = telefono;
	this.ciudad = ciudad;
	this.pais = pais;
}
public String getNombreCliente() {
	return nombreCliente;
}
public String getTelefono() {
	return telefono;
}
public String getCiudad() {
	return ciudad;
}
public String getPais() {
	return pais;
}
@Override
public String toString() {
	return "Cliente [nombreCliente=" + nombreCliente + ", telefono=" + telefono + ", ciudad=" + ciudad + ", pais="
			+ pais + "]";
}


}

package model;

import java.io.Serializable;

public class Empleado implements Serializable{
private int numeroEmpleado;
private String nombre;
private double salario;
private double comision;
private int departamento;
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public Empleado(int numeroEmpleado,String nombre, double salario, double comision, int departamento, String email, String telefono) {
	super();
	this.numeroEmpleado=numeroEmpleado;
	this.nombre = nombre;
	this.salario = salario;
	this.comision = comision;
	this.departamento = departamento;
	this.email = email;
	this.telefono = telefono;
}
@Override
public String toString() {
	return "Empleado [numeroEmpleado=" + numeroEmpleado + ", nombre=" + nombre + ", salario=" + salario + ", comision="
			+ comision + ", departamento=" + departamento + ", email=" + email + ", telefono=" + telefono + "]";
}
private String telefono;
public Empleado(String nombre, double salario, double comision,int departamento) {
	super();
	this.nombre = nombre;
	this.salario = salario;
	this.comision = comision;
	this.departamento = departamento;
	
}
public int getDepartamento() {
	return departamento;
}
public void setDepartamento(int departamento) {
	this.departamento = departamento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public double getComision() {
	return comision;
}
public void setComision(double comision) {
	this.comision = comision;
}

}

package model;

public class Empleado {
private String nombre;
private double salario;
private double comision;
private int departamento;
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
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", salario=" + salario + ", comision=" + comision + "]";
}
public void setComision(double comision) {
	this.comision = comision;
}

}
